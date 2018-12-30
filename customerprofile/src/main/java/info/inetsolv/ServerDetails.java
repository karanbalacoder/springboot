package info.inetsolv;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix="config")
public class ServerDetails {

	private String min;
	private String max;
	
	
	public ServerDetails() {
		
	}
	public ServerDetails(String min, String max) {
		super();
		this.min = min;
		this.max = max;
	}
	public String getMin() {
		return min;
	}
	public void setMin(String min) {
		this.min = min;
	}
	public String getMax() {
		return max;
	}
	public void setMax(String max) {
		this.max = max;
	}
	
	
}
