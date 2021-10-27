package org.example.pages;

import org.openqa.selenium.WebDriver;

import static org.example.constants.SEARCH_BOX_LOCATOR;
import static org.example.constants.SEARCH_BUTTON_LOCATOR;

public class SearchBox extends BasePage {

    public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void search(String text) {
        type(SEARCH_BOX_LOCATOR, text);
        click(SEARCH_BUTTON_LOCATOR);
    }


}
