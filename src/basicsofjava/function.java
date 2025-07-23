package basicsofjava;

import java.util.Scanner;

public class function {
//    public static void main(String[] args) {
//        greet("Alakh sir");
//           }
//
//    public static void greet(String name) {
//        System.out.println("Good morning"+name);

//
//
//public static void main(String[] args) {
//    sum(70,-17);
//}
//public static void sum(int a,int b){
//    System.out.println(a+b);

//    public static void main(String[] args) {
//     myMethods("atul");
//
//    }
//    public static void myMethods(String name){
//        System.out.println(name + " jha");
//    }

    // multiple parameters
//    public static void main(String[] args) {
//       myMethods("Atul",20);
//       myMethods("anushka",16);
//       myMethods("shlok",14);
//
//    }
//    public static void myMethods(String name,int age){
//        System.out.println("my name is "+name+ " my age is " +age);
//
//    }

    // methods in if-else statement
//    public static void main(String[] args) {
//        checkAge(12);
//
//    }
//    public static void checkAge(int age){
//        if (age>18){
//            System.out.println("yes you are eligible to vote because your age is "+age);
//        }else{
//            System.out.println("No you are  not eligible to vote because your age is "+age+ " less than 18");
//
//        }
//    }

    // return keyword inside the methods
//    public static void main(String[] args) {
//        System.out.println(myMethods(6));
//
//    }
//    public static int myMethods(int x){
//       return 5 + x;
//    }

    // sum of methods two paramters
//    public static void main(String[] args) {
//        System.out.println(90+60);
//
//    }
//    public static int myMethods(int x,int y){
//       return x+y;
//    }

//    Consider the following example, which has two methods that add numbers of different type:

    //    public static void main(String[] args) {
//    System.out.println(plusMethodInt(3,5));
//    System.out.println(plusDoubleInt(5.666,7.99));
//
//}
//public static int plusMethodInt(int x,int y){
//    return x+y;
//}
//public static double plusDoubleInt(double x,double y){
//    return x+y;
//}
    //combinationusingfunction.java
//    public static int fact(int x) {
//        int xfact = 1;
//        for (int i = 1; i <= x; i++) {
//            xfact *= i;
//        }
//        return xfact;
//    }
//
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int r = sc.nextInt();
//        int nfact = fact(n);
//        int rfact = fact(r);
//        int n_rfact = fact(n - r);
//        int ncr = nfact / (rfact * n_rfact);
//        System.out.println(ncr);
//
//    }


    // pascal traingle

    public static int fact(int x) {
        int xfact=1;
        for (int i = 1; i <= x; i++) {
            xfact *= i;
        }
        return xfact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<=n;i++){
            for (int j=1;j<=n-i;j++) {
                System.out.print(" "+" ");
            }
                for (int j=0;j<=i;j++){

                int icj=fact(i)/(fact(j)*fact((i-j)));
                System.out.print(icj +"   ");
            }
            System.out.println(" ");
        }


    }
}











