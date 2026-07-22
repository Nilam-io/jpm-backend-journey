class User {
    private String name = "Nilam";
    private int age = 20;

    public void setName(String name){
        this.name = name;      // sets only, returns nothing
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;           // gets only, no params
    }
    public int getAge(){
        return age;
    }
}

public class About {
    public static void main(String[] args){
        User u = new User();
        u.setName("Nilam");
        u.setAge(21);
        System.out.println("Name: " + u.getName() + " Age:" + u.getAge());
    }
}