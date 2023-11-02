package telran.configuration.example;

import lombok.Data;
import telran.configuration.annotation.Value;
@Data
public class TestConfiguration {
	@Value("10")
	int i;
	@Value("1000000000")
	long l;
	@Value("0.5")
	float f;
	@Value("10.5")
	double d;
	@Value("abcd")
	String s;
//	@Override
//	public String toString() {
//		return "TestConfiguration [i=" + i + ", l=" + l + ", f=" + f + ", d=" + d + ", s=" + s + "]";
//	}
//	
	

}
