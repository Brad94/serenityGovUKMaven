package serenitybdd;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import model.Link;

public class LinkNavigation extends PageObject{
	public void selectCategory(Link category) {
		$("#services-and-information > div > div.categories-lists").findBy(By.linkText(category.label())).click();
	}
	
	public void selectStudentFinance(Link link) {
		$("#js-live-search-results").findBy(By.partialLinkText(link.label())).click();
	}

}