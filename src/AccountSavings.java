public class AccountSavings implements Account {

	private Bank bank;
	private String account;
	private double balance;

	public AccountSavings(Bank bank, String account, double balance) {
		super();
		this.bank = bank;
		this.account = account;
		this.balance = balance;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double value) {
		this.balance += value;
	}

	public void withdraw(double value) {
		if (this.balance > value) {
			this.balance -= value;
		}
	}

	@Override
	public String toString() {
		return "AccountSavings [bank=" + bank + ", account=" + account + ", balance=" + balance + "]";
	}
}
