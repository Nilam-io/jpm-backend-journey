
        package com.nilam.api;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/student")
@Produces(MediaType.APPLICATION_JSON)
public class StudentResource {

    private final StudentRepository repository = new StudentRepository();

    // READ: Get all students
    @GET
    public List<Student> getStudents() {
        return repository.getAllStudents();
    }

    // READ: Get one student by ID
    @GET
    @Path("/{id}")
    public Response getStudentById(@PathParam("id") int id) {

        Student student = repository.getStudentById(id);

        if (student != null) {
            return Response.ok(student).build();
        }

        return Response.status(Response.Status.NOT_FOUND).build();
    }

    // CREATE: Add a student
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addStudent(Student student) {

        boolean created = repository.createStudent(student);

        if (created) {
            return Response.status(Response.Status.CREATED)
                    .entity(student)
                    .build();
        }

        return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                .entity("Could not create student. Check the server logs.")
                .build();
    }

    // UPDATE: Update an existing student
    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateStudent(
            @PathParam("id") int id,
            Student updatedStudent) {

        boolean updated = repository.updateStudent(id, updatedStudent);

        if (updated) {
            updatedStudent.setId(id);
            return Response.ok(updatedStudent).build();
        }

        return Response.status(Response.Status.NOT_FOUND)
                .entity("Student not found or update failed.")
                .build();
    }

    // DELETE: Delete a student by ID
    @DELETE
    @Path("/{id}")
    public Response deleteStudent(@PathParam("id") int id) {

        boolean deleted = repository.deleteStudent(id);

        if (deleted) {
            return Response.ok("Student deleted successfully.").build();
        }

        return Response.status(Response.Status.NOT_FOUND)
                .entity("Student not found or deletion failed.")
                .build();
    }
}