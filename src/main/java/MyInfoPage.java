import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MyInfoPage {

    protected WebDriver driver;

    @FindBy(id = "personal_txtEmpFirstName")
    WebElement firstName;
    @FindBy(id = "personal_txtEmpMiddleName")
    WebElement middleName;
    @FindBy(id = "personal_txtEmpLastName")
    WebElement lastName;
    @FindBy(id = "personal_txtEmployeeId")
    WebElement employeeId;
    @FindBy(id = "personal_cmbMarital")
    WebElement maritalStatus;
    @FindBy(id = "personal_DOB")
    WebElement birthDate;
    @FindBy(id = "personal_optGender_1")
    WebElement genderMale;
    @FindBy(id = "personal_optGender_2")
    WebElement genderFemale;
    @FindBy(id = "personal_cmbNation")
    WebElement nationality;
    @FindBy(id = "personal_txtLicExpDate")
    WebElement licenceExpiryDate;
    @FindBy(css = "#frmEmpPersonalDetails > fieldset > ol:nth-child(3) > li.radio > ul > li:nth-child(1) > label")
    WebElement genderMaleText;
    @FindBy(css = "#frmEmpPersonalDetails > fieldset > ol:nth-child(3) > li.radio > ul > li:nth-child(2) > label")
    WebElement genderFemaleText;

    public MyInfoPage(WebDriver driver){
            this.driver = driver;
            PageFactory.initElements(driver, this);
    }

    public void getValueOfField(WebElement element){
        System.out.println(element.getAttribute("value"));
    }

    public void getSelected(WebElement element){
        Select select = new Select(element);
        System.out.println(select.getFirstSelectedOption().getText());
    }

    public void checkedGender(){
        if(genderMale.isSelected()){
            System.out.println(genderMaleText.getText());
        }
        else
            System.out.println(genderFemaleText.getText());
    }
        }