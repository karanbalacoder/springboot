package info.inetsolv;

public class EmployeePersonDetails {

	private Integer eno;
	private String name;
	private Double salary;
	private Double taxAmount;
	private Integer portNumber;
	
	
	
	
	public EmployeePersonDetails() {
		super();
	}
	public EmployeePersonDetails(Integer eno, String name, Double salary) {
		super();
		this.eno = eno;
		this.name = name;
		this.salary = salary;
	}
	public EmployeePersonDetails(Integer eno, String name, Double salary, Double taxAmount) {
		super();
		this.eno = eno;
		this.name = name;
		this.salary = salary;
		this.taxAmount = taxAmount;
	}
	public Integer getEno() {
		return eno;
	}
	public void setEno(Integer eno) {
		this.eno = eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Double getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(Double taxAmount) {
		this.taxAmount = taxAmount;
	}
	public Integer getPortNumber() {
		return portNumber;
	}
	public void setPortNumber(Integer portNumber) {
		this.portNumber = portNumber;
	}
	
	
}
