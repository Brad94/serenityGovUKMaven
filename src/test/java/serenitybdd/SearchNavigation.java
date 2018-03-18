package serenitybdd;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import model.Search;

import org.openqa.selenium.WebElement;

public class SearchNavigation extends PageObject{
	
	    @FindBy(name="q")
	    WebElement searchElement;

	    public void search(Search search) {
	    	element(searchElement).typeAndEnter(search.label());
	    }
}
