public class Task3 {
    public static void main(String[] args) {
        int i =1;

        while(i<=10){
            String result = (i%2 == 0) ? "EVEN" : "ODD";
			System.out.println(i +" "+ result);
			i++;
        }
    }
}
