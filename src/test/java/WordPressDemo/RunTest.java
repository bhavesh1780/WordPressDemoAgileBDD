package WordPressDemo;

import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Unit test for simple BasePage.
 */

@RunWith(Cucumber.class)
@Cucumber.Options(features = ".",format = "html:target/CucumberReport",tags = "@register")
public class RunTest{

}
