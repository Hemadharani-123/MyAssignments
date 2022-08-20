package week3.day1.assignment;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("80000");
	}
	public static void main(String[] args) {
		AxisBank amount= new AxisBank();
		amount.deposit();
		BankInfo cash=new BankInfo();
		cash.deposit();
		
	}
}
