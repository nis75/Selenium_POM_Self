package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasePage extends Page{
    @Override
    public String getPageTitle() {
        return driver.getTitle().trim();
    }

    @Override
    public WebElement getWebElement(By locator) {
        WebElement element = null;
        try {
            driver.findElement(locator);
        } catch (Exception e){
            System.out.printf(locator.toString()+" Select or locator not found");
        }
        return element;
    }

    @Override
    public List<WebElement> getWebElements(By locator) {
        List<WebElement>elements=null;
        try {
            elements = driver.findElements(locator);

        }catch (Exception e){
            System.out.printf(locator.toString()+ "Select or locator not found");
        }
        return elements;
    }

    @Override
    public void waitForElement(By locator) {

    }
}
