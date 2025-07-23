
import java.util.Scanner;
public class areaofrectangle {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("write the length of rectangle");
       int L= Sc.nextInt();
        System.out.println("write the breadth of rectangle");
        int B= Sc.nextInt();
        System.out.println("Area of Rectangle "+ (L*B));

        System.out.println("perimeter of recatngle " + 2*(L+B)) ;

        if(L > 0 && B>0 && (L*B > 2*(L+B))){
            System.out.println("area of rectangle is greater than its perimeter");


        }else{
            System.out.println("area of rectangle is not greater than is perimeter");
        }

    }
}
