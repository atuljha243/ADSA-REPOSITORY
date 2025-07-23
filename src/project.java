//take postive integer input and tell if it is divisible by 5
import java.util.Scanner;
public class project {
    public static void main(String[] args) {
     Scanner Sc = new Scanner(System.in);
        System.out.println("enter your number");
     int n= Sc.nextInt();

     if(n>0 && n%5==0){
         System.out.println("your number is divided by 5");


     }else{
         System.out.println("your number is not divided by 5");
     }


    }
}
