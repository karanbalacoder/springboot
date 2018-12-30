package info.inetsolv;

public class EmpTaxCal {
	
	private Integer eno;
	private Double salary;
	private Double taxAmount;
	private Integer portNumber;
	
	
	public EmpTaxCal() {
		super();
	}

	public EmpTaxCal(Integer eno, Double salary, Double taxAmount) {
		this.eno = eno;
		this.salary = salary;
		this.taxAmount = taxAmount;
	}
	
	public Integer getEno() {
		return eno;
	}
	public void setEno(Integer eno) {
		this.eno = eno;
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
