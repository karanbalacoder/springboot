package info.inetsolv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ADPTaxCal {

	@Autowired
	private Environment environment; 
	
	@GetMapping("/tax/{eno}/{salary}")
	public EmpTaxCal performTaxCal(
			@PathVariable("eno") Integer eno,
			@PathVariable("salary") Double salary) {
		
		
		double tax = (salary * 30)/100;
		salary = salary - (salary * 30)/100;
		EmpTaxCal empTaxCal = new EmpTaxCal(eno,salary, tax);
		int portNumber = Integer.parseInt(environment.getProperty("local.server.port"));
		empTaxCal.setPortNumber(portNumber);
		return empTaxCal;
	}
}











