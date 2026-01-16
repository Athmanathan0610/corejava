class BankDetails{
    long accountNumber = 986546781;
    int balance = 100000;
    String AccountHolderName = "Shankar";
    
    public void checkBalance(){
        System.out.println("This Method is used to check Balance");
        System.out.println(balance);
    }

    public void deposit(){
        System.out.println("This method is used to deposit balance");
        }
    
}
public class BankAccount {
    public static void main(String[] args) {
        BankDetails b1 = new BankDetails();
        System.out.println(b1.accountNumber);
        b1.checkBalance();
        
    }
    
}
