import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a year u want to check : ");
        int n=Sc.nextInt();
        if(n%4==0){
            System.out.println("this is leap year");
        }else{
            System.out.println("this is not a leap year");
        }
    }
}
