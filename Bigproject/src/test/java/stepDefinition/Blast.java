package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
import jdk.nashorn.internal.runtime.regexp.JoniRegExp;
import org.openqa.selenium.WebDriver;

public class Blast {

    public WebDriver driver;

    public Blast() {
        super();
        this.driver = BeforeAfter.driver;
    }

    @Given("User Click Menu Blast")
    public void ClickBlast() throws InterruptedException {
        Thread.sleep(2000);
        Factory.Blast Blast = new Factory.Blast(driver);
        Blast.clickBtnBlast();
    }
    @When("User Click Button Create Blast")
    public void BtnBlast() throws InterruptedException {
        Thread.sleep(2000);
        Factory.Blast Blast = new Factory.Blast(driver);
        Blast.CreateBlast();
    }

    @And("User Set title {string}")
    public void userSetTitle(String Blst)throws InterruptedException {
        Thread.sleep(2000);
        Factory.Blast Blast = new Factory.Blast(driver);
        Thread.sleep(2000);
        Blast.title(Blst);
    }

    @Then("User Type History {string}")
    public void userTypeHistory(String hstr)throws InterruptedException {
        Thread.sleep(2000);
        Factory.Blast Blast = new Factory.Blast(driver);
        Thread.sleep(2000);
        Blast.SetHistory(hstr);
    }

    @And("User Click Button Publish")
    public void userClickButtonPublish()throws InterruptedException {
        Thread.sleep(2000);
        Factory.Blast Blast = new Factory.Blast(driver);
        Blast.Publish();
    }

    @And("User Get PopUp Create Post Sucsessfully")
    public void PopUp()throws InterruptedException {
        Thread.sleep(2000);
        Factory.Blast Blast = new Factory.Blast(driver);
        Blast.PopUp();
    }

// User Creat Blast on Blast Menu without Titele
    @And("User Get PopUp Field parameter not complete.")
    public void Without()throws InterruptedException {
        Thread.sleep(3000);
        Factory.Blast Blast = new Factory.Blast(driver);
        Blast.PooUp();
    }

// User Set Due Date on Blast
    @When("User click due date")
    public void userClickDueDate()throws InterruptedException {
        Thread.sleep(3000);
        Factory.Blast Blast = new Factory.Blast(driver);
        Blast.Ddate();
    }

    @And("User Choose Manual set due date")
    public void userChooseManualSetDueDate()throws InterruptedException {
        Thread.sleep(3000);
        Factory.Blast Blast = new Factory.Blast(driver);
        Blast.Manual();
    }

    @And("User Set date")
    public void userSetDate()throws InterruptedException {
        Thread.sleep(3000);
        Factory.Blast Blast = new Factory.Blast(driver);
        Blast.Calender();
    }

    @Then("User Click Next on Calender")
    public void NextOnCalender()throws InterruptedException{
        Thread.sleep(3000);
        Factory.Blast Blast = new Factory.Blast(driver);
        Blast.nextCal();
    }

    @And("User Choose Date")
    public void userChooseDate()throws InterruptedException {
        Thread.sleep(3000);
        Factory.Blast Blast = new Factory.Blast(driver);
        Blast.btntgl();
    }
    // User Edit Blast to private
    @And("User Click Blast")
    public void userClickBlast()throws InterruptedException {
        Thread.sleep(3000);
        Factory.Blast Blast = new Factory.Blast(driver);
        Blast.bls();
    }

    @When("User Click Option on Blast")
    public void userClickOptionOnBlast()throws InterruptedException {
        Thread.sleep(3000);
        Factory.Blast Blast = new Factory.Blast(driver);
        Blast.Option();
    }

    @And("User Click Edit")
    public void userClickEdit()throws InterruptedException {
        Thread.sleep(3000);
        Factory.Blast Blast = new Factory.Blast(driver);
        Blast.Edit();
    }

    @And("User switch to Private")
    public void userSwitch()throws InterruptedException {
        Thread.sleep(3000);
        Factory.Blast Blast = new Factory.Blast(driver);
        Blast.BtnSwitch();
    }

    @Then("User Click Button Save Changes")
    public void ButtonSaveChanges()throws InterruptedException {
        Thread.sleep(3000);
        Factory.Blast Blast = new Factory.Blast(driver);
        Blast.btnsave();
    }

    @And("User Get PopUp Update post successful")
    public void userGet()throws InterruptedException {
        Thread.sleep(4000);
        Factory.Blast Blast = new Factory.Blast(driver);
        Blast.Repo();
    }

}