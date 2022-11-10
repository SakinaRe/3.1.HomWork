package entites;

public class Instractor {
	private int id;
	private String firstName;
	private String lastName;
	private double Salary;
	
	public Instractor() {
		super();
		
	}
	public Instractor(int id, String firstName, String lastName, double Salary) {
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.Salary=Salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	
	

}
