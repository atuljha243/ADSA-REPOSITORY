package basicsofjava;

import java.util.Scanner;

public class checkthenumberis3digitornot {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
//        System.out.println("write a number u want to check is 3 digit or not");
        //       int n= Sc.nextInt();
//        if(n>99 && n <1000){
//            System.out.println("number is 3 digit  number");
//        }else{
//            System.out.println("number is not 3 digit number");
//        }
//        System.out.println("Enter n ");
//       int end = Sc.nextInt();
        //print the table of 19

//        for(int i=19; i<=190;i+=19){
//            System.out.println(i);
//
//
//        }
//        print the number from 10 to 1
//        for (int i=10;i>=1;i--){
//            System.out.println(i);
//        }
        //print the arithmatic progression
//        System.out.println("Enter n ");
//        int n = Sc.nextInt();
//        for(int i =1;i<=n;i=i+2){
//            System.out.println(i);
//        }
        // print the geometric progression
//        System.out.println("Enter n");
//        int n= Sc.nextInt();
//        for (int i=3;i<=n;i=i*4){
//            System.out.println(i);
//        }
//        //Write the program to print the highest factor of number n
//        System.out.println("Enter n");
//        int n= Sc.nextInt();
//        int hf=1;
//        for (int i=1;i<n;i++){
//            if (n%i==0 ){
//                hf=i;
//
//
//            }
//
//
//
//     }
//        System.out.println(hf);
        //program to check number is prime or composite
        System.out.println("Enter a number n to check number is prime or composite ");
        int n = Sc.nextInt();
        boolean flag = false;//false means number is prime
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = true;//means now the number is true
                break;


            }
        }
        if (n == 1) {
            System.out.println("neither prime nor composite");


        } else if (flag==true) {
            System.out.println("number is composite");
        } else {
            System.out.println("number is prime");
        }


    }
}





