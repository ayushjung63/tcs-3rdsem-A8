package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            File file=new File("abc.txt");
            FileInputStream fileInputStream = new FileInputStream(file);

            int result = 5 / 0;
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }catch (ArithmeticException e){
            System.out.println("Arithmetic exception");
        }
        catch (Exception e) {
            System.out.println("Exception occured");
        }

    }
}
