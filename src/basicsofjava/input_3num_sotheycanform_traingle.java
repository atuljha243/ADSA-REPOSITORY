package basicsofjava;

import java.util.Scanner;

public class input_3num_sotheycanform_traingle {
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        System.out.println("write the side1 of traingle ");
        int side1= Sc.nextInt();
        System.out.println("write the side2 of traingle ");
        int side2= Sc.nextInt();
        System.out.println("write the side3 of traingle ");
        int side3= Sc.nextInt();
        if(side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1){
            System.out.println("this is the sides of traingle");
        } else{
            System.out.println("invalid input");
        }






    }
}
