package javabasics;

public class SwitchExample {
    public static void main(String[] args) {
        /*
         * switch(condition){
         *   case 1:
         *       //execute this
         *       break
         *
         * case 2:
         *       //execute this
         *          break
         * case 3:
         *       //execute this
         *          break
         * default:
         *      // execute this

         * }
         *
         *
         * */
        String value = "Thru";
        switch (value) {
            case "M":
                System.out.println("Monday");
                break;
            case "Tue":
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("No Day");
        }

    }
}
