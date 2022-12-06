package Factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static stepDefinition.BeforeAfter.driver;

public class GroupChat {

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    public GroupChat(WebDriver driver){
        PageFactory.initElements(driver, this);}

    @FindBy(xpath ="//*[contains(text(),'Group Chat')]")
    public WebElement BtnGroupCht;
    public void GrChat() {BtnGroupCht.click();
//        WebElement GChat = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Group Chat')]")));
//        GChat.click();
    }
    @FindBy(xpath = "//*[@id='root']/div[3]/div[1]/div[2]/div/div[2]/div/div/div/p")
    public WebElement TypeMsg;
    public void Type(String Msg) {
        TypeMsg.sendKeys(Msg);
    }
    @FindBy(xpath ="//*[@id='root']/div[3]/div[1]/div[2]/div/div[3]/div/div")
    public WebElement Send;
    public void BtnSend() {Send.click();}

    @FindBy(xpath ="//*[@id='list-groupChat-messages-section']")
    public WebElement isSend;
    public void IsSend(){}

// Attach File
    @FindBy(xpath ="//div[@class='CreateMessage_attachment__2Z8Rx']")
    public WebElement Attch;

@FindBy(xpath ="//input[@multiple]")
    public WebElement Choose;
    public void chooseFile() {Choose.sendKeys("D:\\Kursus\\project java\\Bigproject\\src\\test\\java\\Picture\\logo-dwp.png");}

//Delete Message
    @FindBy (xpath = "//html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]")
    private WebElement Optn;


// User Mantion Member on message

    @FindBy(xpath ="/html/body/div[4]/ul/li[2]")
    public WebElement mantion;
    public void mtn() {mantion.click();}

}
