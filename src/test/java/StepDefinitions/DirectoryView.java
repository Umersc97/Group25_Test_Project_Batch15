package StepDefinitions;

import Utils.CommonMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DirectoryView extends CommonMethods {
    @When("“Page” navigates to Directory")
    public void page_navigates_to_directory() {
        clickOn(directoryViewPage.navigateDirectory);
      // driver.findElement(By.xpath("//*[@id=\"menu_directory_viewDirectory\"]/b")).click();
    }
    @Then("User should able to see all employees")
    public void user_should_able_to_see_all_employees() {
        WebElement element = driver.findElement(By.xpath("//b[text()='Kate Mrs Andrews']"));

        boolean isDisplayed = element.isDisplayed();

        if (isDisplayed) {
            System.out.println("The element is displayed on the web page.");
        } else {
            System.out.println("The element is not displayed on the web page.");
        }
    }

}
