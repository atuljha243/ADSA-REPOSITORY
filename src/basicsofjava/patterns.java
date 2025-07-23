package basicsofjava;

import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int m= Sc.nextInt();
        System.out.println("Enter number of columns");
        int n=Sc.nextInt();
        for(int i=1;i<=m;i++){
            for (int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
