package po;

import base.mathods.BaseMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class SearchPage extends BaseMethods {

    private static final By searchInput = By.cssSelector(".vector-search-box-input");
    private static final By article = By.xpath("//h1[@id='firstHeading']");

    private static final By article1 = By.xpath("//li[@id='ca-history']");

    private static final By article2 = By.xpath("//h1[@class='firstHeading mw-first-heading']");



    public SearchPage searchUbisoftArticle(String text) {
        send(searchInput, text);
        return this;
    }

    public SearchPage clickEnter() {
        send(searchInput, Keys.ENTER);
        return this;
    }

    public SearchPage clickOnUbisoftArticle() {
        click(article);
        return this;
    }
    public SearchPage clickTabArticle() {
        click(article1);
        return this;
    }
    public SearchPage clickOnHistoryArticle() {
        click(article2);
        return this;
    }



}
