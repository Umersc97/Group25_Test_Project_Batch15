package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DirectoryViewPage extends CommonMethods {


        public DirectoryViewPage() {
            PageFactory.initElements(driver, this);
        }

        @FindBy(xpath ="//*[@id=\"menu_directory_viewDirectory\"]/b")
        public WebElement navigateDirectory;

    }


