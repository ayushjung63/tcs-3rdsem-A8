package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


/*
* try{
*   // code where exception will occur
* }catch(Exception e){
*   // code to recover from exception
* }
* */

public class CheckedVsUnCheckedException {
    public static void main(String[] args) {
        File file=new File("abc.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            System.out.println("File Found");
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }finally {
            System.out.println("Finally ");
        }
    }
}
