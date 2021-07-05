import org.junit.Test;

public class MainMyInfo extends TestBase{

    @Test
    public void TestMyInfo(){

        LoginPage loginPage = new LoginPage(driver);
        loginPage.systemLogin();
        MainPage mainPage = new MainPage(driver);
        mainPage.clickMyInfo();
        MyInfoPage myInfoPage = new MyInfoPage(driver);
        myInfoPage.getValueOfField(myInfoPage.firstName);
        myInfoPage.getValueOfField(myInfoPage.middleName);
        myInfoPage.getValueOfField(myInfoPage.lastName);
        myInfoPage.getValueOfField(myInfoPage.employeeId);
        myInfoPage.getSelected(myInfoPage.maritalStatus);
        myInfoPage.getValueOfField(myInfoPage.birthDate);
        myInfoPage.checkedGender();
        myInfoPage.getSelected(myInfoPage.nationality);
        myInfoPage.getValueOfField(myInfoPage.licenceExpiryDate);


    }

}
