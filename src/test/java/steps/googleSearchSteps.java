package steps;

import com.android.Base;
import com.android.Pages.googleSearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;

public class googleSearchSteps extends Base {
    googleSearchPage GoogleSearchPage;
    @Given("User open the browser")
    public void user_open_the_browser() throws MalformedURLException {
        luncherWeb();
    }
    @When("User fill the word {string} and click on button search")
    public void user_fill_the_word_and_click_on_button_search(String world) throws InterruptedException {
        GoogleSearchPage =new googleSearchPage();
        GoogleSearchPage.searchWord(world);

    }
    @Then("Messi result should be dispayed")
    public void messi_result_should_be_dispayed() {

    }

}
