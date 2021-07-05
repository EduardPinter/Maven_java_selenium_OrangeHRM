import org.junit.Test;

public class MainUsers extends TestBase{

    @Test
    public void TestUsers(){

        LoginPage loginPage = new LoginPage(driver);
        loginPage.systemLogin();
        MainPage mainPage = new MainPage(driver);
        mainPage.clickViewSystemUsers();
        SystemUsersPage systemUsersPage = new SystemUsersPage(driver);
        systemUsersPage.countLengthOfTable();
        systemUsersPage.printNames();
    }
}
