package exception;

import java.io.File;
import java.io.FileInputStream;

public class RealWorldSamsya {
    public static void main(String[] args) {
        try {
            File file=new File("abcdef.txt");
            FileInputStream fileInputStream = new FileInputStream(file);
            System.out.println("Logic 1");
            System.out.println("Logic 2");
            System.out.println("Logic 3");
            System.out.println("Logi");
        }catch (Exception e){

        }
    }
}
