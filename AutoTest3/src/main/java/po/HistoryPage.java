package po;

import base.mathods.BaseMethods;
import org.openqa.selenium.By;

public class HistoryPage extends BaseMethods  {

    private static final By firstHeadingHistory = By.xpath("//h1[@class='firstHeading mw-first-heading']");


    public String getHeadingOfArticle2() {
        return getText(firstHeadingHistory);
    }

}
