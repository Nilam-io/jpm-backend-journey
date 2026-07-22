class University{
    int totaldays = 30; // instance variable
   
    public  double attendence(int noofdays){
        if(noofdays > 2)
        {
           double attendencerate = ( (double)noofdays / totaldays)*100;
            return attendencerate;
        }

        return -1;

        }

}

public class Method {
    public static void main(String[] args){
        University uni = new University();  // uni is a reference variable of University class
        double r = uni.attendence(20);
        System.out.printf("The attendence rate is:%.2f%%\n", r);

    }
}
