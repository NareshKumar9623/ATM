
public class User {
    int userId;
    int pin;
    int Account_no;
    int balance;
    int phone;
	public User(int userId, int pin, int account_no, int balance, int phone) {
		super();
		this.userId = userId;
		this.pin = pin;
		Account_no = account_no;
		this.balance = balance;
		this.phone = phone;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public int getAccount_no() {
		return Account_no;
	}
	public void setAccount_no(int account_no) {
		Account_no = account_no;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
    
}
