package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaSearch {
    public WikipediaSearch(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //#2- Use @FindBy instead of findElement()
    @FindBy(name = "search")
    public WebElement searchBox;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement searchButton;
}
