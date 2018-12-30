package info.inetsolv;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="adp")
@RibbonClient(name="adp")
public interface AdpRestClientCall {
	
	@GetMapping("/tax/{eno}/{salary}")
	public EmployeePersonDetails performTaxCal(
			@PathVariable("eno") Integer eno,
			@PathVariable("salary") Double salary);

}
