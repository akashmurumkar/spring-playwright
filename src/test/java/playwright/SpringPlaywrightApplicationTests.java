package playwright;

import com.akasham.spring.playwright.SpringPlaywrightApplication;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = SpringPlaywrightApplication.class)
class SpringPlaywrightApplicationTests {

    @Test
    void contextLoads() {
        try (Playwright playwright = Playwright.create()) {
            BrowserType.LaunchOptions options = new BrowserType.LaunchOptions().setHeadless(false);
            Browser browser = playwright.chromium().launch(options);
            Page page = browser.newPage();
            page.navigate("https://playwright.dev");
            System.out.println(page.title());
        }
    }

}
