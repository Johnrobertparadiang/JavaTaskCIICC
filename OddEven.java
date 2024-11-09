public class OddEven{
    public static void main(String[] args) {

        int checkNumber = 10;
        String message;

        for (int i=0 ;i<10 ;i++){
            message = (i%2 == 0) ? "even" : "odd";
            System.out.println(i + "is " +message+ "number" );
        }
    }
}