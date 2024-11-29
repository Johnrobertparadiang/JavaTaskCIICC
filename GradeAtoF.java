import java.util.*;
public class GradeAtoF {
public static void main(String[] args) {
    Scanner g = new Scanner(System.in);
    System.out.println("Enter your grade 1-99 :");
    int num = g.nextInt(); 

    if (num >=90){
        System.out.println("Your grade is: A");
        return;
    }
    else if(num > 80){
        System.out.println("Your grade is: B");
        return;
    } 
    else if(num > 70){
        System.out.println("Your grade is: C");
        return;
    } 
    else if(num > 60
    ){
        System.out.println("Your grade is: D");
        return;
    } 
    else System.out.println("FAIL");
    return;
    
}
}