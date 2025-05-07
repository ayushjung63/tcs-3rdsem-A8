import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // Scanner
        Scanner terminalScanner = new Scanner(System.in);
        System.out.println("Please enter your mark : ");
        int marks=terminalScanner.nextInt();
        if (marks>=80){
            System.out.println("Grade A");
        }else if(marks>70 && marks<80){
            System.out.println("Grade B");
        }else if(marks>60 && marks<70){
            System.out.println("Grade C");
        } else{
            System.out.println("Grade D");
        }
    }
}
