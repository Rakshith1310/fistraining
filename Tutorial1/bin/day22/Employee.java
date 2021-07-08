package day22;

public class Employee {

	private String employeeName;
	private int employeeId;
	private int employeeSalary;
	
	private Project project;// has-a

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String employeeName, int employeeId, int employeeSalary, Project project) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.employeeSalary = employeeSalary;
		this.project = project;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}
	
	public void annualIncrement(int per)
	{
		this.employeeSalary += ((this.employeeSalary*per)/100);
	}
	
	public void loginLogoff()
	{
		System.out.println("Login-logoff");
	}
	
}