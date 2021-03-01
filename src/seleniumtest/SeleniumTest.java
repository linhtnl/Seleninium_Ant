/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author ASUS
 */
public class SeleniumTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        checkSearchWithKeyWord();
    }
    /*
    TEST CASE #1 - Test to search a keyword on Google 
    Steps:
    1.Open a browser, r.g. Chrome
    2.Type the following URL: http://google.com
        *Expected: the Google homepage appears
    3.Type a keyword that you want to search, e.g. ahihi đồ ngok and press Enter
        *Expected: show the list of websites that contain the "ahihi đồ ngok" keyword.
    */
    public static void checkSearchWithKeyWord(){
        //Call driver to connect and control
        String chromDriverPath="C:\\Users\\ASUS\\Desktop\\chromedriver_win32\\chromedriver.exe"; //Match google chrome version 
        //Báo với JVM là tao xài mày, giống Class.forName()
        System.setProperty("webdriver.chrome.driver", chromDriverPath);
        WebDriver myBrowser = new ChromeDriver(); //Gọi trình duyệt xuất hiện
        //Mọi hành động trên trình duyệt sẽ được điều kihieenrm chính là method của object myBrowser       
        myBrowser.get("http://google.com"); // tương đương gõ URL và enter
        //Gõ keyword vào ô search, tìm ô search nằm đâu.trong trang web đang ở trong trình duyệt, cây DOM
        //JS, xPath
        //Dùng f12 để tìm vào cấu trúc trang, tìm name của ô saerch
        //Ô search hay mọi tag HTML trong trang web đều được xem là 1 object thuộc class WebElement
        WebElement searchBox = myBrowser.findElement(By.name("q"));
        searchBox.sendKeys("Ahihi đồ ngok");
        searchBox.submit();                        
    } 
    //Kịch bản chung của tự động hóa test
    //Cần driver tương ứng trình duyêt - .exe
    //Cần .jar để có được các class điều khiển trình duyệt 
    //Báo với JVM, về việc kết nối driver
    //Có được object trình duyệt, các webElement
}
