package StepDefinitions;

import Pages.DirectoryViewPage;
import Pages.LoginPage;

public class PageInitializer {
    public static DirectoryViewPage directoryViewPage;
    public static LoginPage login;

    public static void initializePageObjects(){
       login = new LoginPage();

       directoryViewPage = new DirectoryViewPage();
    }

}
// This class will manage the object creating of different page Objects in our Framework
// Instead of calling the age objects again and again, this class will take good care of that step
