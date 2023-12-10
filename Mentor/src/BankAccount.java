
public class BankAccount {
	private long accountNumber;
	private String holderName;
	public BankAccount(long accountNumber, String holderName) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
	}
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public String getHolderName() {
		return holderName;
	}
}
