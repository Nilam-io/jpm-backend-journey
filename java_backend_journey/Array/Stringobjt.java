class Student{
    int rollno;
    String name;
    int marks;
}


public class Stringobjt {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.rollno = 101;
        s1.name = "Nilam";          
        s1.marks = 90;
        System.out.println("The roll number of the student is:"+s1.rollno); 
        Student s2 = new Student();
        s2.rollno = 102;                
        s2.name = "nisha";
        s2.marks = 80;
        System.out.println("The roll number of the student is:"+s2.rollno);
        Student s3 = new Student();
        s3.rollno = 103;
        s3.name = "avinash";
        s3.marks = 70;
        System.out.println("The roll number of the student is:"+s3.rollno);

        Student s[] = new Student[3];
        s[0]=s1;
        s[1]=s2;
        s[2]=s3;
        for(int i=0;i<s.length;i++){
            System.out.println(" "+s[i].rollno);
            System.out.println(" "+s[i].name);
            System.out.println(" "+s[i].marks);
        }

    }
    
}
