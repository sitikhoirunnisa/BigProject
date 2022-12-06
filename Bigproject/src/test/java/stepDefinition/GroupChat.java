package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.xpath.XPath;

public class GroupChat {
    public WebDriver driver;

    public GroupChat() {
        super();
        this.driver = BeforeAfter.driver;
    }
    @Given("User Click Group Chat")
    public void ClickBoard() throws InterruptedException {
        Thread.sleep(3000);
        Factory.GroupChat GChat = new Factory.GroupChat(driver);
        GChat.GrChat();
    }

    @When("User Type Message {string}")
    public void userTypeMessage(String Msg) throws InterruptedException {
        Thread.sleep(3000);
        Factory.GroupChat GChat = new Factory.GroupChat(driver);
        Thread.sleep(3000);
        GChat.Type(Msg);
        }

    @Then("User Click Button Send")
    public void Send() throws InterruptedException {
        Thread.sleep(3000);
        Factory.GroupChat GChat = new Factory.GroupChat(driver);
        GChat.BtnSend();
    }
    @And("Message Is Send")
    public void isSend() throws InterruptedException {
        Thread.sleep(3000);
        Factory.GroupChat GChat = new Factory.GroupChat(driver);
        GChat.IsSend();

    }
// Attach File Group Chat
    @When("User Choose File")
    public void userTypeName()throws InterruptedException {
        Thread.sleep(4000);
        Factory.GroupChat GChat = new Factory.GroupChat(driver);
        GChat.chooseFile();
    }
//Mantion Member
    @And("User Click Member")
    public void userChooseMember()throws InterruptedException {
        Thread.sleep(3000);
        Factory.GroupChat GChat = new Factory.GroupChat(driver);
        GChat.mtn();
    }
}


