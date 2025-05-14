package bank;
import java.util.Scanner;
public class bank{
 private String accountNumber;
 private double balance;
 public bank(String accountNumber) {
   this.accountNumber = accountNumber;
 }
 public bank(String accountNumber, double balance) {
      this.accountNumber = accountNumber;
      this.balance = balance;
 }
 public void deposit(double amount) {
   if(amount>=0){
      this.balance+=amount;
      System.out.println("成功存入"+amount);
      System.out.println("餘額"+this.balance);
   }else{
      System.out.println("存款金額必須大於零的話才存款");
   }
 // todo 存款金額必須大於零的話才存款
 }
 public void withdraw(double amount) {
   if(amount>=0&&balance-amount>=0){
      this.balance-=amount;
      System.out.println("成功取出"+amount);
      System.out.println("餘額"+this.balance);
   }else{
      System.out.println("error");
   }

 // todo 提領金額必須大於零且小於或等於餘額才能提款
 }
 public double getBalance() {
   return this.balance;
 // todo 回傳餘額
 }
 public String getAccountNumber() {
 // todo 回傳帳號
 return this.accountNumber;
 }
 
 public static void main(String[] args) {
  Scanner scn = new Scanner(System.in);
  String acountname = scn.next();
  int balance = scn.nextInt();
  bank firstaccount = new bank(acountname,balance);
  int deposit = scn.nextInt();
  firstaccount.deposit(deposit);
  int take = scn.nextInt();
  firstaccount.withdraw(take);
  scn.close();

 }

}