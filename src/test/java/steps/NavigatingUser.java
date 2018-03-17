package steps;

import model.*;
import net.serenitybdd.tutorials.ui.CategoryNavigation;
import net.serenitybdd.tutorials.ui.CurrentPage;
import net.serenitybdd.tutorials.ui.GovHomePage;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;
public class NavigatingUser {
	
	GovHomePage govHomePage;
	CurrentPage currentPage;
	CategoryNavigation categoryNavigation;
	
	@Step
	public void isOnTheHomePage() {
		govHomePage.open();
	}
	
	@Step
    public void navigatesToDrivingAndTransport(Category category) {
        categoryNavigation.selectCategory(category);
    }
	
	@Step
	public void shouldSeePageTitleContaining(String expectedTitle) {
		assertThat(currentPage.getTitle()).containsIgnoringCase(expectedTitle);
	}

}
