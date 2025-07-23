package basicsofjava;

import java.util.Scanner;

public class checkifgivennumberisdivisibleby5ornot {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("write a number u want to divide by 3 and 5 ");
        int n=Sc.nextInt();
        if (n>0 && n%5==0 && n%3==0){
            System.out.println("number is divisible by 5 and 3");
        }else{
            System.out.println("number is not divisible by 5 and 3");
        }

    }
}
