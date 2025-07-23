package basicsofjava;

import java.util.Scanner;

public class printgreatestof3integer {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter first integer");
        int a = Sc.nextInt();
        System.out.println("enter second integer");
        int b = Sc.nextInt();
        System.out.println("enter third integer");
        int c= Sc.nextInt();
        if(a>b && a>c){
            System.out.println("a is largest integer: "+a);
        } else if (b>c) {
            System.out.println("b is largest integer: "+b);


        }else {
            System.out.println("c is largest: "+c);
        }


    }
}
