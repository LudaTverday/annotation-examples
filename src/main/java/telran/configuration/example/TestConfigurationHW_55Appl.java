package telran.configuration.example;

import telran.configuration.Configuration;

public class TestConfigurationHW_55Appl {

	private static final String DEFAULT_FILE_NAME = "src/main/resources/app.properties";

	public static void main(String[] args) throws Exception {
		String fileName = args.length > 0 ? args[0]: DEFAULT_FILE_NAME;
		
		TestConfigurationHW_55 testObj = new TestConfigurationHW_55();
		Configuration config = new Configuration(testObj, fileName);
		config.configInjection();
		System.out.println(testObj);

	}

}
