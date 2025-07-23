package basicsofjava;

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the index no");
//        int x=sc.nextInt();
//
//        int []arr={11,22,33,44,55};
//        System.out.println(arr[x]);

        // taking as input
//        System.out.println("enter array size");
//        int n=sc.nextInt();
//        int[] arr = new int[n];
//        //input
//        for (int i=0;i<n;i++){
//            System.out.println("enter the arrays");
//            arr[i]=sc.nextInt();
//        }
//        //print
//        for (int i=0;i<n;i++){
//            System.out.println(arr[i]+" ");
//        }

        // enter the roll no of student those are fail

        int[] marks={90,40,50,77,19,14,18};
       for (int i=0;i<=marks.length;i++){
           if (marks[i]<35) {
               System.out.println(i + " ");
           }


       }

    }
}
