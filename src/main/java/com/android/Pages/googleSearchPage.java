package com.android.Pages;

import com.android.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class googleSearchPage extends Base {
    public googleSearchPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(className ="gLFyf")
    WebElement searchBox;
    @FindBy(name = "q")
    WebElement buttonBox;

    public void searchWord(String Word) throws InterruptedException {
        searchBox.sendKeys(Word);
        buttonBox.sendKeys(Keys.ENTER);
        Thread.sleep(6000);

    }
    public void worldDisplayed(){

    }
}
