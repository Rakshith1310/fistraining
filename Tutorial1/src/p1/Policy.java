package p1;

public class Policy {
	private int polno;
	private String polname;
	private int tenure;
	
	public Policy(int polno,String polname,int tenure) {
		this.polname = polname;
		this.polno =  polno;
		this.tenure = tenure;
	}

	public int getPolno() {
		return polno;
	}

	public void setPolno(int polno) {
		this.polno = polno;
	}
	
	public String getPolname() {
		return polname;
	}
	
	public void setPolname(String polname) {
		this.polname=polname;
	}
	
	public int getTenure() {
		return tenure;
	}
	
	public void setTenure(int tenure) {
		this.tenure=tenure;
	}
	
	public void displayPolicy()
	{
		System.out.println("Name of the policy is "+this.polname);
	}

	@Override
	public String toString() {
		return "Policy [polno=" + polno + ", polname=" + polname + ", tenure="
				+ tenure + "]";
	}
	
}
