package thisDemo;

public class BankAccount {
    private String accountNumber;
    private double balance;

    // 建構子
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    // 建構子多載，建立一個含 balance 的建構子
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // 存款方法
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("成功存入: " + amount);
        } else {
            System.out.println("存款金額必須大於零");
        }
    }

    // 提款方法
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("成功提取: " + amount);
        } else {
            System.out.println("提款失敗: 金額不足或輸入金額不正確");
        }
    }

    // 回傳餘額
    public double getBalance() {
        return balance;
    }

    // 回傳帳號
    public String getAccountNumber() {
        return accountNumber;
    }

    public static void main(String[] args) {
        // 建立 account3
        BankAccount account3 = new BankAccount("A1003");
        account3.deposit(1000);
        account3.withdraw(1500); // 會顯示錯誤訊息
        System.out.println("帳號: " + account3.getAccountNumber() + ", 餘額: " + account3.getBalance());

        // 建立 account4，預設餘額為 2000
        BankAccount account4 = new BankAccount("A1004", 2000);
        account4.deposit(1000);
        account4.withdraw(2000);
        account4.deposit(-500); // 會顯示錯誤訊息
        System.out.println("帳號: " + account4.getAccountNumber() + ", 餘額: " + account4.getBalance());
    }
}