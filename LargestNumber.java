public class LargestNumber{
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 1;
        int num3 = 10;

        if(num1 > num2 && num1 > num3){
            System.out.println("Number 1 is the Largest number");
        }

        else if(num2 > num1 && num2 > num3){
            System.out.println("Largest number is 2");
        }
        
        else if (num3 > num1 && num3 > num2 ) {
            System.out.println("Largest number is 3");
        }
        
        else{
            System.out.println("All numbers are Equal");
        }
        
        //TERNARY OPERATOR TRY

        //String result = (num1 > num2) ? "Num 1 is Largest Number" : "Num 2 is Largest Number";

        //System.out.println(result);
    }
}