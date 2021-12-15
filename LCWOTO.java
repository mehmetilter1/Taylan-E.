package tests;

import com.sun.xml.internal.ws.policy.AssertionValidationProcessor;
import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.xml.sax.Locator;

import static java.awt.SystemColor.text;

public class LCWOTO {

    WebDriver driver;
    static By homePageLocator= By.xpath("//a/span[.='Hızlı Teslimat']");
    static By loginPageLocator=By.xpath("//span[.='Hesabım']");



    static void SetUp() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.lcwaikiki.com/tr-TR/TR");
        driver.manage().deleteAllCookies();


        if(homePageLocator!=null){
            System.out.println("Ana Sayfadayız.");
        }




        driver.manage().window().maximize();

        WebElement login=driver.findElement(By.xpath("//span[.='Giriş Yap']"));
        login.click();

        WebElement emailText=driver.findElement(By.xpath("//input[@id='LoginEmail']"));
        emailText.click();
        emailText.sendKeys("taylanertopoglu@hotmail.com");

        if(homePageLocator!=null){
            System.out.println("Giriş Yapıldı");
        }

        for(int i=1;i<50000;i++);

        WebElement password=driver.findElement(new By.ByCssSelector(".ym-disable-keys[id='Password']"));
        password.click();

        password.sendKeys("tayloata97");
        WebElement loginbutton=driver.findElement(new By.ByCssSelector(".login-button-link"));
        loginbutton.click();



        WebElement searchbutton=driver.findElement(By.id("search_input"));
        searchbutton.click();
        searchbutton.sendKeys("pantolon");


        WebElement tick=driver.findElement(By.xpath("//button[.='Ara']"));
        tick.click();

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,100000)");

        WebElement moreProductbutton=driver.findElement(new By.ByCssSelector("button.paginator__button"));
        moreProductbutton.click();


        WebElement pant=driver.findElement(By.xpath("//img[@src='https://img-lcwaikiki.mncdn.com/mnresize/600/-/pim/productimages/20212/5177433/l_20212-w13377z8-pnp_a.jpg']"));
        pant.click();


        WebElement selectsize=driver.findElement(By.xpath("//a[@size='28']"));
        selectsize.click();

        WebElement selectWeight=driver.findElement(By.xpath("//a[@height=\'32\']"));
        selectWeight.click();

        WebElement buy=driver.findElement(By.xpath("//a[@id='pd_add_to_cart']"));
        buy.click();

        WebElement gotocard=driver.findElement(By.xpath(" //div[.='Sepetim']"));
        gotocard.click();

        WebElement addProduct =driver.findElement(By.xpath("//input[@value='1']"));
        addProduct.click();
        addProduct.sendKeys("2");




    }


    public static void main(String[] args) {

        SetUp();
    }






    }
















