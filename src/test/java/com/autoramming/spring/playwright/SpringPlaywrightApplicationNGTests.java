package com.autoramming.spring.playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@SpringBootTest
public class SpringPlaywrightApplicationNGTests extends AbstractTestNGSpringContextTests {

    @Test
    void contextLoads() {
        try (Playwright playwright = Playwright.create()) {
            BrowserType.LaunchOptions options = new BrowserType.LaunchOptions().setHeadless(false);
            Browser browser = playwright.chromium().launch(options);
            Page page = browser.newPage();
            page.navigate("https://playwright.dev");
            System.out.println(page.title());
            System.out.println("TestNG");
        }
    }
    @Test(enabled = true)
    void disabledContextLoads() {
        try (Playwright playwright = Playwright.create()) {
            BrowserType.LaunchOptions options = new BrowserType.LaunchOptions().setHeadless(false);
            Browser browser = playwright.chromium().launch(options);
            Page page = browser.newPage();
            page.navigate("https://playwright.dev");
            System.out.println(page.title());
            System.out.println("TestNG");
        }
    }

}
