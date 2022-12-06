package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Blast {
    public Blast(WebDriver driver){
    PageFactory.initElements(driver, this);}

    //Add List//
    @FindBy(xpath ="//*[contains(text(),'Blast!')]")
    public WebElement BtnBlast;
    public void clickBtnBlast() {BtnBlast.click();}

    @FindBy(xpath =" //*[contains(text(),'Create Blast')]")
    public WebElement BtnCreate;
    public void CreateBlast() {BtnCreate.click();}

    @FindBy(css = "[placeholder='Type a title...']")
    public WebElement SetTitle;
    public void title(String Blst) {SetTitle.sendKeys(Blst);}

    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[2]/div/div/div[2]/div/div/div[3]/div/p")
    public WebElement TypeHstry;
    //*[contains(text(),'Tell your story here...')]
    public void SetHistory(String hstr) {TypeHstry.sendKeys(hstr);}

    @FindBy(xpath ="//*[contains(text(),'Publish')]")
    public WebElement BtnPublish;
    public void Publish() {BtnPublish.click();}

    @FindBy(xpath ="//*[contains(text(),'Create post successful')]")
    public WebElement PopUp;
    public void PopUp(){PopUp.click();}

    //Create Blast Without Title
    @FindBy(xpath ="//*[contains(text(),'Field parameter not complete.')]")
    public WebElement PoUp;
    public void PooUp(){PoUp.click();}


    //Create due date

    @FindBy(xpath ="//*[contains(text(),'Auto complete')]")
    public WebElement Btndate;
    public void Ddate() {Btndate.click();}
    @FindBy(xpath ="//*[contains(text(),'Set due date manually')]")
    public WebElement Ddate;
    public void Manual() {Ddate.click();}
    @FindBy(css ="[data-testid='CalendarIcon']")
    public WebElement BtnCalender;
    public void Calender() {BtnCalender.click();}
    @FindBy(css ="[data-testid='ArrowRightIcon']")
    public WebElement Btnnext;
    public void nextCal() {Btnnext.click();}

    @FindBy(css =" [aria-label='Jan 1, 2023']")
    public WebElement tgl;
    public void btntgl() {tgl.click();}

// Edit Blast
    @FindBy(xpath ="//*[@id='root']/div[3]/div[2]/div/div/div/div/div/div[1]/a/div")
    public WebElement Btnblas;
    public void bls() {Btnblas.click();}
    @FindBy(css ="[data-testid='MoreVertOutlinedIcon']")
    public WebElement Btnopt;
    public void Option() {Btnopt.click();}

    @FindBy(css ="[data-testid='ModeEditOutlineOutlinedIcon']")
    public WebElement Btnedit;
    public void Edit() {Btnedit.click();}

    @FindBy(css ="[name='switchItem']")
    public WebElement Switch;
    public void BtnSwitch() {Switch.click();}

    @FindBy(xpath ="//*[contains(text(),'Save Changes')]")
    public WebElement save;
    public void btnsave() {save.click();}

    @FindBy(xpath ="//*[contains(text(),'Update post successful')]")
    public WebElement Rep;
    public void Repo() {Rep.click();}

    //attach file by link on blast
    @FindBy(xpath ="//*[@id='insertLink-2']/svg")
    public WebElement file;
    public void File() {file.click();}
    @FindBy(xpath ="//*[contains(text(),'By URL')]")
    public WebElement bylink;
    public void Link() {bylink.click();}

    @FindBy(xpath = "//*[@id='fr-files-by-url-layer-text-16']")
    public WebElement link ;
    public void Typelink(String link) {SetTitle.sendKeys(link);}

    @FindBy(xpath ="//*[contains(text(),'Add')]")
    public WebElement Add;
    public void BtnAdd() {Add.click();}

    @FindBy(css ="//*[@id='fr-file-insert-button-0']/svg")
    public WebElement Upload;
    public void Up() {Upload.click();}












}
