package org.example;

import com.microsoft.playwright.*;

public class Context {
    public static void main(String[] args) {

        Playwright playwright = Playwright.create();

        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();


        page.navigate("https://www.saucedemo.com/v1/");
        page.type("#user-name", "standard_user");
        page.type("#password", "standard_user");

        page.click("#login");
        page.click("#login");
        page.click("#login");
        page.click("#login");

//        git push --set-upstream origin New
//        git push --set-upstream origin New
//        git push --set-upstream origin New
//        git push --set-upstream origin New
//        git push --set-upstream origin New



        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        browser.close();
        playwright.close();
    }
}