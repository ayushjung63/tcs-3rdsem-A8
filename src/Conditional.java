public class Conditional {
    public static void main(String[] args) {
        //if else
        /*
        if(condition){
            // statement
        }else{
            // statement
        }
         */
        int age=8;
        if(age>18){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }

        // logical Operator
        // AND , OR


        int marks=50;
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
