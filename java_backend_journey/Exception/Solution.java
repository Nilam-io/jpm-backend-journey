import java.util.Scanner;
public class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of hte array:");
        int n = sc.nextInt();

        int num[] = new [n];
        for(int i =0;i<n;i++){
            int num[i]= sc.nextInt();
        }
        System.out.println("Enter the target element:");
        int target = sc.nextInt();
        for(int i=0;i<n;i++){
            num([i] + [i+1]) == target;
            break;
        } 
        System.out.println("[ "+ num[i]+ ", "num[i+1]"]");
    }
}