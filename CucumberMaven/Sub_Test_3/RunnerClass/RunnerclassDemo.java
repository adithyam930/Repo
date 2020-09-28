package RunnerClass;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features= {"C:\\Users\\win\\eclipse-workspace\\CucumberMaven\\src\\test\\resources\\Feature\\demo\\demoGuru1.feature",
			"C:\\Users\\win\\eclipse-workspace\\CucumberMaven\\src\\test\\resources\\Feature\\demo\\demoGuru2.feature",
			"C:\\Users\\win\\eclipse-workspace\\CucumberMaven\\src\\test\\resources\\Feature\\demo\\demoGuru3.feature"},
			glue="Stepdef",
		    plugin = {"pretty","html:target/cucumber-reports"}
			)	
public class RunnerclassDemo {

}
