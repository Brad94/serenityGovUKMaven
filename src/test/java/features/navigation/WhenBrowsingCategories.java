package features.navigation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import model.Link;
import model.Search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import steps.NavigatingUser;


@RunWith(SerenityRunner.class)
public class WhenBrowsingCategories {

	@Steps
	NavigatingUser mark;
	
	@Managed
	WebDriver browser;
	
	@Test
	public void shouldBeAbleToNavigateToDrivingAndTransport() 
	{
		//Given
		mark.isOnTheHomePage();
		
		//When
		mark.navigatesToCategory(Link.Driving);
		
		//Then
		mark.shouldSeePageTitleContaining("Driving and transport - GOV.UK");
	}
	@Test
	public void shouldBeAbleToSearchForStudentFinance() 
	{
		//Given
		mark.isOnTheHomePage();
		
		//When
		mark.searchesFor(Search.StudentFinance);
		
		//And
		mark.navigatesToLink(Link.StudentFinance);
		
		//Then
		mark.shouldSeePageTitleContaining("Student finance - GOV.UK");
	}
}
