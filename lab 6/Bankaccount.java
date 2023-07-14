public class Bankaccount {
	private int accountNumber;
	private double balance;
	private String Customername;
   public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomername() {
		return Customername;
	}
	public void setCustomername(String customername) {
		this.Customername = customername;
	}
public static void main(String[] args) {
	Bankaccount account =new Bankaccount();
	account.setAccountNumber(698753211);
	account.setBalance(6000);
	account.setCustomername("vastpro");
	System.out.println(" account number is :" +account.getAccountNumber());
	System.out.println(" account balance " +account.getBalance());
	System.out.println("customername : "  +account.getCustomername());
	
	
}
}