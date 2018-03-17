package features.navigation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import model.Category;
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
		mark.navigatesToDrivingAndTransport(Category.Driving);
		
		//Then
		mark.shouldSeePageTitleContaining("Driving and transport - GOV.UK");
	}
}
