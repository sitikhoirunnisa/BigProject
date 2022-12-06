package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Board {
    public Board(WebDriver driver){
        PageFactory.initElements(driver, this);}

    //Add List//
    @FindBy(xpath ="//*[contains(text(),'Board')]")
    public WebElement BtnBoard;
    public void clickBtnBoard() {BtnBoard.click();}

    @FindBy(xpath = "//*[contains(text(),'Add List')]")
    public WebElement BtnAddList;
    public void clickBtnAddList() {BtnAddList.click();}

    @FindBy(css = "[placeholder='Input list name...']")
    public WebElement SetNameList;
    public void TypeName(String Nisa) {SetNameList.sendKeys(Nisa);}

    @FindBy(xpath ="//*[contains(text(),'Create')]")
    public WebElement BtnCreate;
    public void clickBtnCreate() {BtnCreate.click();}
    @FindBy(xpath = "//*[contains(text(),'Creating list is success')]")
    public WebElement Pop;
    public void popop() {Pop.click();}


    //add Card//
    @FindBy(xpath ="//*[@class='ListContainer_ListContainer__buttonBottom__2kZAI']/a")
    public WebElement card;
    public void Card() {card.click();}

    @FindBy(css = "[placeholder='Card name']")
    public WebElement TypeName;
    public void Type(String card) {TypeName.sendKeys(card);}

    @FindBy(xpath ="//*[contains(text(),'Add Card')]")
    public WebElement BtnAdd;
    public void BtnAddCard() {BtnAdd.click();}

    @FindBy(id ="#notistack-snackbar")
    public WebElement PopUp;
    public void PopUp() {PopUp.click();}

    //Move Card
    @FindBy(id ="editCardMenu")
    public WebElement Optn;
    public void BtnOptn() {Optn.click();}

    @FindBy(xpath="//*[contains(text(),'Move Card')]")
    public WebElement Move;
    public void MoveCard() {Move.click();}

    @FindBy(xpath="//div[@class='ManageMoveCard_listSection__listName__TN7R2']")
    public WebElement List;
    public void Listname() {List.click();}

    @FindBy(xpath="//*[contains(text(),'Senin')]")
    public WebElement Name;
    public void Choosename() {List.click();}

    @FindBy(xpath="//div[@class='Button_container__1WNuB']")
    public WebElement move;
    public void BtnMove() {move.click();}

    @FindBy(xpath="//*[contains(text(),'Success!')]")
    public WebElement Succ;
    public void Succses() {Succ.click();}

    //Add Card Without Title
    @FindBy(xpath = "//*[contains(text(),'Card name cannot be empty')]")
    public WebElement Report;
    public void report() {Report.click();}

    //Add Cheers Without
    @FindBy(xpath = "//*[@id='listcard_content-0']/div[1]/div/div/a")
    public WebElement MyCard;
    public void ClickCard() {MyCard.click();}

    @FindBy(xpath = "//div[@class='CheersButton_buttonCheers__2mJix']")
    public WebElement Cheers;
    public void ClickCheers() {Cheers.click();}

    @FindBy(css = "[data-testid='CheckCircleOutlineIcon']")
    public WebElement Check;
    public void BtnCheck() {Check.click();}

    @FindBy(xpath = "//*[contains(text(),'Cheer cannot be empty')]")
    public WebElement Msg;




}
