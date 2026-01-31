package Page;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class category {

    WebDriver driver;
    WebDriverWait wait;

    // Category: Popularity
    @FindBy(xpath = "//div[normalize-space()='Popularity']")
    WebElement popularityCategory;

    // Any result element after category click (update if needed)
    @FindBy(xpath = "//div[contains(@class,'product')]")
    WebElement productResults;

    public category(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Click category and WAIT for page load
    public void clickCategory() {
        wait.until(ExpectedConditions.elementToBeClickable(popularityCategory));
        popularityCategory.click();

        // IMPORTANT: wait until results load
        wait.until(ExpectedConditions.visibilityOf(productResults));
    }
}
