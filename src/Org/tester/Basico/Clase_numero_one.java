package Org.tester.Basico;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Clase_numero_one {
    public static void main (String[] args) {
        //instanciar un objeto de tipo webdriver
        WebDriver driver;

        //Declarar variables
        String BaseUrl = "http://newtours.demoaut.com/";
        String actualResult = "";
        String expectedResult = "";

        //Indicar la localización del archivo chromedriver.exe en la propiedad webdriver.chrome
        //System.getproperty ("user.dir") = C: \..\..\..\SeleniumWebDriver
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");

        //Abrir el navegador
        driver=new ChromeDriver();

        //Navegar a la pagina
        driver.get(BaseUrl);

        //Obtener titulo
        actualResult = driver.getTitle();

        driver.close();

    }

}