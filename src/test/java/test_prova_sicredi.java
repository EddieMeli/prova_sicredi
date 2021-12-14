package test.java;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test_prova_sicredi {
    @Test
    public void testGoogleSearch() throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.grocerycrud.com/v1.x/demo/my_boss_is_in_a_hurry/bootstrap");

        //Theme
        WebElement comboTheme = driver.findElement(By.xpath("//*[@id='switch-version-select']"));
        comboTheme.sendKeys("Bootstrap V4 Theme");

        //Add Record
        WebElement addRecord = driver.findElement(By.xpath("//*[@id='gcrud-search-form']/div[1]/div[1]/a"));
        addRecord.click();

        String name = "Teste Sicredi";
        String last_name = "Teste";
        String contact_first_name = "Edenilson";
        String phone = "51999999999";
        String address_line1 = "Av Assis Brasil, 3970";
        String address_line2 = "Torre D";
        String city = "Porto Alegre";
        String state = "RS";
        String postal_code = "91000-000";
        String country = "Brasil";
        String from_employeer = "Fixter";
        Integer credlimit = 200;

        //
        WebElement field_customerName = driver.findElement(By.xpath("//*[@id=\"field-customerName\"]"));
        field_customerName.sendKeys(name);
        //
        WebElement field_contactLastName = driver.findElement(By.xpath("//*[@id=\"field-contactLastName\"]"));
        field_contactLastName.sendKeys(last_name);
        //
        WebElement field_phone = driver.findElement(By.xpath("//*[@id=\"field-phone\"]"));
        field_phone.sendKeys(phone);
        //
        WebElement field_addressLine1 = driver.findElement(By.xpath("//*[@id=\"field-addressLine1\"]"));
        field_addressLine1.sendKeys(address_line1);
        //
        WebElement field_addressLine2 = driver.findElement(By.xpath("//*[@id=\"field-addressLine2\"]"));
        field_addressLine2.sendKeys(address_line2);
        //
        WebElement field_city = driver.findElement(By.xpath("//*[@id=\"field-city\"]"));
        field_city.sendKeys(city);
        //
        WebElement field_state = driver.findElement(By.xpath("//*[@id=\"field-state\"]"));
        field_state.sendKeys(state);
        //
        WebElement field_postalCode = driver.findElement(By.xpath("//*[@id=\"field-postalCode\"]"));
        field_postalCode.sendKeys(postal_code);
        //
        WebElement field_country = driver.findElement(By.xpath("//*[@id=\"field-country\"]"));
        field_country.sendKeys(country);
        //Validar questao
        WebElement field_salesRepEmployeeNumber = driver.findElement(By.xpath("//*[@id=\"field-salesRepEmployeeNumber\"]"));
        field_salesRepEmployeeNumber.sendKeys("1");
        //
        WebElement field_creditLimit = driver.findElement(By.xpath("//*[@id=\"field-creditLimit\"]"));
        field_creditLimit.sendKeys(credlimit.toString());
        //Save
        WebElement field_save = driver.findElement(By.xpath("//*[@id=\"form-button-save\"]"));
        field_save.submit();
        //wait element

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"report-success\"]/p")));

        WebElement sucess = driver.findElement(By.xpath("//*[@id=\"report-success\"]/p"));
        if(sucess.getText() == "Your data has been successfully stored into the database. "){
            System.out.println("Sucesso!!! ");
        }
        //assert(sucess.getText().contains("Your data has been successfully stored into the database."));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"save-and-go-back-button\"]")));
        WebElement field_save_back = driver.findElement(By.xpath("//*[@id=\"save-and-go-back-button\"]"));
        field_save_back.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/button/span[1]")));
        WebElement field_button_close = driver.findElement(By.xpath("/html/body/div[3]/button/span[1]"));
        field_button_close.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='gcrud-search-form']/div[2]/table/thead/tr[2]/td[3]/input")));
        WebElement field_find_by_name = driver.findElement(By.xpath("//*[@id='gcrud-search-form']/div[2]/table/thead/tr[2]/td[3]/input"));
        field_find_by_name.sendKeys(name);



        //More
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='gcrud-search-form']/div[2]/table/tbody/tr/td[2]/div[1]/div/button")));
        WebElement field_more = driver.findElement(By.xpath("//*[@id='gcrud-search-form']/div[2]/table/tbody/tr/td[2]/div[1]/div/button"));
        field_more.click();




        WebElement field_delete = driver.findElement(By.xpath("//*[@id='gcrud-search-form']/div[2]/table/tbody/tr/td[2]/div[1]/div/div/a[3]/span"));
        field_delete.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[3]/button[2]")));
        WebElement field_delete_box = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[3]/button[2]"));
        field_delete_box.click();
        //   btn btn-danger delete-confirmation-button
        driver.close();

    }
}
