package net.serenitybdd.tutorials.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import model.Category;

public class CategoryNavigation extends PageObject{
	public void selectCategory(Category category) {
		$("#services-and-information > div > div.categories-lists > ol:nth-child(2) > li:nth-child(2) > h3").findBy(By.partialLinkText(category.name())).click();
	}

}
