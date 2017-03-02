package ru.stqa.pft.addressbook;

import org.openqa.selenium.firefox.FirefoxDriver;
<<<<<<< HEAD:addressbook-web-tests/src/test/java/ru/stqa/pft/addressbook/appmanager/ApplicationManager.java
=======
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
>>>>>>> parent of 54cd6cc... Create Packages appmanager, model, tests:addressbook-web-tests/src/test/java/ru/stqa/pft/addressbook/TestBase.java

import java.util.concurrent.TimeUnit;

/**
 * Created by invizzible13 on 01.03.17.
 */
public class TestBase {
  FirefoxDriver wd;

  private SessionHelper sessionHelper;
  private NavigationHelper navigationHelper;
  private GroupHelper groupHelper;


  @BeforeMethod
  public void setUp() throws Exception {
    wd = new FirefoxDriver();
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook/group.php");
    groupHelper = new GroupHelper(wd);
    navigationHelper = new NavigationHelper(wd);
    sessionHelper = new SessionHelper(wd);

<<<<<<< HEAD:addressbook-web-tests/src/test/java/ru/stqa/pft/addressbook/appmanager/ApplicationManager.java
    sessionHelper.login("admin", "secret");
  }

    public void stop() {
    wd.quit();
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
=======
    login("admin", "secret");
  }

  private void login(String username, String password) {
    wd.findElement(By.name("user")).click();
    wd.findElement(By.name("user")).clear();
    wd.findElement(By.name("user")).sendKeys(username);
    wd.findElement(By.name("pass")).click();
    wd.findElement(By.name("pass")).clear();
    wd.findElement(By.name("pass")).sendKeys(password);
    wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
  }

  protected void returnToGroupPage() {
    wd.findElement(By.linkText("group page")).click();
  }

  protected void submitGroupCreation() {
    wd.findElement(By.name("submit")).click();
  }

  protected void fillGroupForm(GroupData groupData) {
    wd.findElement(By.name("group_name")).click();
    wd.findElement(By.name("group_name")).clear();
    wd.findElement(By.name("group_name")).sendKeys(groupData.getName());
    wd.findElement(By.name("group_header")).click();
    wd.findElement(By.name("group_header")).clear();
    wd.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
    wd.findElement(By.name("group_footer")).click();
    wd.findElement(By.name("group_footer")).clear();
    wd.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
  }

  protected void initGroupCreation() {
    wd.findElement(By.name("new")).click();
  }

  protected void gotoGroupPage() {
    wd.findElement(By.linkText("groups")).click();
  }

  @AfterMethod
  public void tearDown() {
    wd.quit();
  }

  protected void deleteSelectedGroups() {
      wd.findElement(By.name("delete")).click();
  }

  protected void selectGroup() {
      wd.findElement(By.name("selected[]")).click();
>>>>>>> parent of 54cd6cc... Create Packages appmanager, model, tests:addressbook-web-tests/src/test/java/ru/stqa/pft/addressbook/TestBase.java
  }
}
