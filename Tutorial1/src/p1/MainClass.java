package p1;

public class MainClass {
	public static void main(String[] args)
	{
		Policy p1 = new Policy(1001,"Life insurance",10);
		Policy p2 = new Policy(1002,"Accidental insurance",5);

		Policy[] policyArray1 = new Policy[]{p1};
		Policy[] policyArray2 = new Policy[]{p1,p2};
		
		//Policy p = policyArray2[0];

		Account a1=new Account(1,"Rakskhith", "Savings");
		a1.setPolicy(policyArray1);
		
		Account a2=new Account(1,"Karthik", "Current",policyArray2);
	
		MainClass main = new MainClass();
		main.displayAccountInfo(a1, 5000, 1000);
		main.displayAccountInfo(a2, 5000, 2000);
		
		
	}
	
	public void displayAccountInfo(Account a, int depositAmt, int withdrawAmt){
		System.out.println("##########################");

		System.out.println("Account Details :"+a.toString());
		System.out.println("Get Class : "+a.getClass());
		a.deposit(depositAmt);
		a.withdrawal(withdrawAmt);
		System.out.println("##########################");

	}
	
}
