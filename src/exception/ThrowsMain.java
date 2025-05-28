package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsMain {
    public static void main(String[] args)  {

    }

    public static void methodA(){
        try {
            methodB();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void methodB() throws FileNotFoundException {
        readFile();
    }

    public static void readFile() throws FileNotFoundException{
        File file = new File("abcde.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
    }
}
