package info.inetsolv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeDetails {

	@Autowired
	private AdpRestClientCall adpClient;
	
	
	
	
	@GetMapping("/employee/{eno}/{name}/{salary}")
	public EmployeePersonDetails performTaxCal(
			@PathVariable("eno") Integer eno,
			@PathVariable("name") String name,
			@PathVariable("salary") Double salary) {
		
		EmployeePersonDetails details = adpClient.performTaxCal(eno, salary);
	
		
		
//		String url="http://localhost:7000/tax/{eno}/{salary}";
//		
//		HashMap<String, Object> hashMap = new HashMap<>();
//		hashMap.put("eno", eno);
//		hashMap.put("salary", salary);
//		
//		RestTemplate restTemplate = new RestTemplate();
//		ResponseEntity<EmployeePersonDetails> responseEntity = restTemplate.getForEntity(url, EmployeePersonDetails.class, hashMap);
//		EmployeePersonDetails details = responseEntity.getBody();
//		
		
		
		EmployeePersonDetails employeePersonDetails = new EmployeePersonDetails();
		employeePersonDetails.setEno(eno);
		employeePersonDetails.setName(name);
		employeePersonDetails.setSalary(details.getSalary());
		employeePersonDetails.setTaxAmount(details.getTaxAmount());
		employeePersonDetails.setPortNumber(details.getPortNumber());
		
		return employeePersonDetails;
	}
}







