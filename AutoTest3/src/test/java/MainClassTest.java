import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import po.ArticlePage;
import po.HistoryPage;
import po.SearchPage;

import static java.lang.Thread.sleep;
import static org.assertj.core.api.Assertions.assertThat;

public class MainClassTest extends BaseTest {


    @Test(dataProvider = "search_provider", groups = {"Smoke"})
    void shouldBeUbisoftArticle(String search) {

        new SearchPage()
                .searchUbisoftArticle(search)
                .clickEnter()
                .clickOnUbisoftArticle();

        assertThat(new ArticlePage().getHeadingOfArticle()).as("The text must be Ubisoft")
                .isEqualTo("Ubisoft");

        try {
            sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


    @Test(dataProvider = "search_provider", groups = {"Smoke"})
    void shouldBeVisibleHistoryPage(String search) {

        new SearchPage()
                .clickTabArticle()
                .clickOnHistoryArticle();


        assertThat(new HistoryPage().getHeadingOfArticle2()).as("The text must be Заглавная страница: история изменений")
                .isEqualTo("Заглавная страница: история изменений");

        try {
            sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @DataProvider(name = "search_provider")
    public Object[][] search_methods() {
        return new Object[][]{
                {"Ubisoft"},
              {"Bl"}
        };
    }

}
