import java.util.Scanner;

    public class BankAccount {
        private String accountNumber;
        private int balance;
        public BankAccount(String accountNumber) {
    // todo 建構子
            this.accountNumber = accountNumber;
            this.balance = 0;
        }
        public BankAccount(String accountNumber, int balance) {
        // todo 建構子多載，建立一個含 balance 的建構子
            this.accountNumber = accountNumber;
            this.balance = balance;
        }
        public void deposit(int amount) {
        // todo 存款金額必須大於零的話才存款
        if(amount>0){
            balance+=amount;
        }
        else{
            System.out.println("存款金額必須大於零的話才存款");
            System.out.println("帳號:"+accountNumber);
            System.out.println("餘額:"+balance);
         }
        }
        
        public void withdraw(int amount) {
            if(amount>0 &&amount<=balance){
                balance-=amount;

            }else{
                System.out.println("提領金額必須大於零且小於或等於餘額才能提款");
                System.out.println("帳號:"+accountNumber);
                System.out.println("餘額:"+balance);
            }
 // todo 提領金額必須大於零且小於或等於餘額才能提款
        }
        public int getBalance() {
            return balance;
        // todo 回傳餘額
        }
        public String getAccountNumber() {
    // todo 回傳帳號
            return accountNumber;
        }
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            
            BankAccount account3 = new BankAccount("account3");
            account3.deposit(1000);
        
            account3.withdraw(1500);
            BankAccount account4 = new BankAccount("account4",2000);
            account4.deposit(1000);
            account4.withdraw(2000);
            account4.deposit(-500);

            scn.close();            
        // 建立一個銀行帳號物件，命名為 account3
         // 存入1000，再提取 1500(會顯示錯誤訊息)，並顯示帳號及餘額
        // 再建立一個銀行帳號物件，命名為 account4，balance 預設為 2000
        // 存入1000，提取 2000，再存入 -500(會顯示錯誤訊息)，並顯示帳號及餘額
        // todo
        }
    }

