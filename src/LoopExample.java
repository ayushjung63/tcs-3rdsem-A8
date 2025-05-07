public class LoopExample {
    public static void main(String[] args) {
        /*
        * while(condition){
        *   //execute this
        * }
        *
        * */
        int i=1;
        while (i<=10){
            System.out.println("Hello World");
            i++;
        }

        /*
        * do{
        *   // execute this
        * }while(condition)
        *
        * */

        int j=1;
        do{
            System.out.println("Hello World");
            j++;
        }while(j<=10);


        /*
        * for (int i=0;i<10;i++){
        *   // execute this
        * }
        * */

        for (int k=1;k<10;++k){
            System.out.println("Value :: "+ k);
        }
    }
}
