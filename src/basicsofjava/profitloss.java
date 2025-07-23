import java.util.Scanner;

public class profitloss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a cost price of item : ");
        int costprice=sc.nextInt();
        System.out.println("enter selling price of item");
        int sellingprice= sc.nextInt();
        if(sellingprice > costprice){
            System.out.println("congragulation! you made a profit of "+ (sellingprice-costprice));

        }else{
            System.out.println("oh shit you made a loss of " +(costprice-sellingprice) );
        }

    }

}
