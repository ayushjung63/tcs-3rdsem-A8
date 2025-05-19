package oops.polymorphism;

public class AccountVerifier {
    public static void main(String[] args) {
        AccountVerifier accountVerifier=new AccountVerifier();

        accountVerifier.verify("ram@techspire.com");
        accountVerifier.verify(985111111);
    }

    public void verify(int mobileNumber) {
        System.out.println(mobileNumber + " is verified");
    }


    public void verify(String email) {
        System.out.println(email + " is verified");
    }
}
