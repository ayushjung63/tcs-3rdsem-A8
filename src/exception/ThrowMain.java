package exception;

public class ThrowMain {
    public static void main(String[] args) {
        validateAgeForElection(11);
    }

    public static void validateAgeForElection(int age) {
        if (age < 18) {
            throw new AgeNotValidException("Age must be at least 18");
        }else{
            System.out.println("Eligible for Vote");
        }
    }
}
