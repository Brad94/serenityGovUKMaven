package steps;

import model.*;
import net.thucydides.core.annotations.Step;
import serenitybdd.LinkNavigation;
import serenitybdd.CurrentPage;
import serenitybdd.GovHomePage;
import serenitybdd.SearchNavigation;

import static org.assertj.core.api.Assertions.assertThat;
public class NavigatingUser {
	
	GovHomePage govHomePage;
	CurrentPage currentPage;
	LinkNavigation linkNavigation;
	SearchNavigation searchNavigation;
	
	@Step
	public void isOnTheHomePage() {
		govHomePage.open();
	}
	
	@Step
    public void navigatesToCategory(Link category) {
        linkNavigation.selectCategory(category);
    }
	
	@Step
	public void shouldSeePageTitleContaining(String expectedTitle) {
		assertThat(currentPage.getTitle()).containsIgnoringCase(expectedTitle);
	}
	
	@Step
	public void searchesFor(Search search) {
		searchNavigation.search(search);
	}
	@Step
    public void navigatesToLink(Link link) {
		linkNavigation.selectStudentFinance(link);
    }
}
