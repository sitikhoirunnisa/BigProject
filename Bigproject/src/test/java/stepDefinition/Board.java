package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class Board {
    public WebDriver driver;

    public Board() {
        super();
        this.driver = BeforeAfter.driver;
    }
    @Given("User Click Board")
    public void ClickBoard() throws InterruptedException {
        Thread.sleep(3000);
        Factory.Board Board = new Factory.Board(driver);
        Board.clickBtnBoard();
    }
    @When("User Click Button Add List")
    public void BtnList() throws InterruptedException {
        Thread.sleep(3000);
        Factory.Board Board = new Factory.Board(driver);
        Board.clickBtnAddList();
    }
    @And("User Set Name {string}")
    public void setName(String Nisa) throws InterruptedException {
        Thread.sleep(3000);
        Factory.Board Board = new Factory.Board(driver);
        Thread.sleep(2000);
        Board.TypeName(Nisa);
    }
    @Then("User Click Button Creat")
    public void BtnCreate() throws InterruptedException {
        Thread.sleep(3000);
        Factory.Board Board = new Factory.Board(driver);
        Board.clickBtnCreate();
    }
    @And("User get PopUp Creating list is success")
    public void PopList() throws InterruptedException {
        Thread.sleep(3000);
        Factory.Board Board = new Factory.Board(driver);
        Thread.sleep(3000);
        Board.popop();
    }

    //Add card
    @When("User Click add Card on List")
    public void AddList() throws InterruptedException {
        Thread.sleep(3000);
        Factory.Board Board = new Factory.Board(driver);
        Board.Card();
    }

    @And("User Set Name Card {string}")
    public void TypeName(String card) throws InterruptedException {
        Thread.sleep(3000);
        Factory.Board Board = new Factory.Board(driver);
        Thread.sleep(3000);
        Board.Type(card);
    }

    @Then("User Click Button AddCard")
    public void BtnAdd() throws InterruptedException {
        Thread.sleep(3000);
        Factory.Board Board = new Factory.Board(driver);
        Board.BtnAddCard();
    }

    @And("User Sucsesfully Create Card")
    public void Popup() throws InterruptedException {
        Thread.sleep(3000);
        Factory.Board Board = new Factory.Board(driver);
        Thread.sleep(3000);
        Board.PopUp();
    }

    //User Move Card on Other List
    @When("User Click Option On Card")
    public void Opt() throws InterruptedException {
        Thread.sleep(4000);
        Factory.Board Board = new Factory.Board(driver);
        Board.BtnOptn();
    }
    @And("User Clik Move Card")
    public void Move() throws InterruptedException {
        Thread.sleep(3000);
        Factory.Board Board = new Factory.Board(driver);
        Board.MoveCard();
    }
    @And("User Click List Name")
    public void ListName() throws InterruptedException {
        Thread.sleep(3000);
        Factory.Board Board = new Factory.Board(driver);
        Board.Listname();
    }
    @Then("User Choose Name")
    public void Choose() throws InterruptedException {
        Thread.sleep(3000);
        Factory.Board Board = new Factory.Board(driver);
        Board.Choosename();
    }
    @And("User Click Move")
    public void move() throws InterruptedException {
        Thread.sleep(3000);
        Factory.Board Board = new Factory.Board(driver);
        Board.BtnMove();
    }
    @And("User Get PopUp Sucsess")
    public void Suc() throws InterruptedException {
        Thread.sleep(3000);
        Factory.Board Board = new Factory.Board(driver);
        Board.Succses();
    }

    //Add Card Without Title
    @Then("User Click add")
    public void Add() throws InterruptedException {
        Thread.sleep(3000);
        Factory.Board Board = new Factory.Board(driver);
        Board.BtnAddCard();
    }
    @And("User get PopUp Card name cannot be empty")
    public void Report() throws InterruptedException {
        Thread.sleep(3000);
        Factory.Board Board = new Factory.Board(driver);
        Thread.sleep(3000);
        Board.report();
    }
    //Add Cheers Without description
    @When("User Click Card")
    public void Card() throws InterruptedException {
        Thread.sleep(3000);
        Factory.Board Board = new Factory.Board(driver);
        Board.ClickCard();
        }
    @And("User Click Cheers")
    public void Cheers() throws InterruptedException {
        Thread.sleep(3000);
        Factory.Board Board = new Factory.Board(driver);
        Board.ClickCheers();
    }
    @Then("User Click Check")
    public void Check() throws InterruptedException {
        Thread.sleep(3000);
        Factory.Board Board = new Factory.Board(driver);
        Board.BtnCheck();
    }
    @And("User Get popup Cheer cannot be empty")
    public void PopCheers() throws InterruptedException {
        Thread.sleep(3000);
        Factory.Board Board = new Factory.Board(driver);
    }



}