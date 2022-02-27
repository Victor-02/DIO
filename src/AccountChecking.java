
public class AccountChecking implements Account {

	private Bank bank;
	private String account;
	private double balance;
	private double credit;

	public AccountChecking(Bank bank, String account, double balance, double credit) {
		this.bank = bank;
		this.account = account;
		this.balance = balance;
		this.credit = credit;
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

	public double getCredit() {
		return credit;
	}

	public void deposit(double value) {
		this.balance += value;
	}

	public void withdraw(double value) {
		if (this.balance > value) {
			this.balance -= value;
		}
	}

}