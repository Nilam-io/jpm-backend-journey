public class For {
    public static void main(String[] args){
        System.out.println("Task Tracker");
        
        for (int i =0;i<7;i++){
            switch(i) {
                case 0:
                    System.out.println("Monday" + "Day "+(i+1));
                    break;
                case 1:
                    System.out.println("Tuesday" + "Day "+(i+1));
                    break;
                case 2:
                    System.out.println("Wednesday" + "Day "+(i+1));
                    break;
                case 3:
                    System.out.println("Thursday" + "Day "+(i+1));
                    break;  
                case 4:
                    System.out.println("Friday" + "Day "+(i+1));   
                    break;
                case 5:
                    System.out.println("Saturday" + "Day "+(i+1));                
                    break;
                    case 6:
                    System.out.println("Sunday" + "Day "+(i+1));

            }
            for(int j=1;j<9;j++){
                System.out.println(" "+ (j+8) + "-" +" "+ (j+9)+" [ ] checkbox");
                     }
            
                

            

        }
    }
    
}
