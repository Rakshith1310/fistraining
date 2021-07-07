package p1;

public class Account {
	Policy[] policy;
	private int balance;
	private int accno;
	private String name;
	private String type;
	
	public Account(int accno, String name, String type)
	{
		this.accno=accno;
		this.name=name;
		this.type=type;
	}
	
	public Account(int accno, String name, String type,Policy[] policy)
	{
		this.accno=accno;
		this.name=name;
		this.type=type;
		this.policy=policy;
	}
	
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType(){
		return type;
	}
	public void setType(String type) {
		this.type=type;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public Policy[] getPolicy() {
		return policy;
	}

	public void setPolicy(Policy[] policy) {
		this.policy = policy;
	}

	public void withdrawal(int amt)
	{
		balance-=amt;
		System.out.println("withdrawal amt is: "+amt+ " balance is: "+balance);
	}
	public void deposit(int amt)
	{
		balance+=amt;
	System.out.println("Deposited amt: "+amt+" balance amt is: "+balance);

	}
	@Override
	public String toString() {
		return "Account [p1=" + policy.toString() + ", balance=" + balance + ", accno="
				+ accno + ", name=" + name + ", type=" + type + "]";
	}
	
	
}
