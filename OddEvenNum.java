import java.util.*;
public class OddEvenNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any Number: ");
        int num = s.nextInt();

        if(num %2 == 0){
            System.out.println("Even Number");
        }
        else if (num %2 != 0) {
            System.out.println("Odd number");
        }
        else if (num == 0){
            System.out.println("Number is Zero");
        }
        else{
            System.out.println("Number is Negative");
        }

    }
}
