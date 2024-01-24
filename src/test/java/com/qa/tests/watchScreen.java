package com.qa.tests;

import com.qa.CoreTest;
import com.qa.pages.*;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.*;
import io.appium.java_client.InteractsWithApps;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Random;

public class watchScreen extends CoreTest {
    com.qa.pages.loginPage loginPage;
    com.qa.pages.launchScreen launchScreen;
    com.qa.pages.watchScreen watchScreen;
    JSONObject loginUser;
    com.qa.pages.accountPage accountPage;
    com.qa.pages.verifyLogin verifyLogin;
    com.qa.pages.vodSearch vodSearch;
    com.qa.pages.watchList watchList;
    com.qa.pages.Signup SignUp;
    com.qa.pages.SignupValidation SignupValidation;
    com.qa.pages.faqValidation faqValidation;
    com.qa.pages.toolBar toolBar;
    com.qa.pages.bets bets;


    @BeforeClass
    public void beforeClass() throws Exception {
        InputStream datais = null;
        try {
            String dataFileName = "data/loginUser.json";
            datais = getClass().getClassLoader().getResourceAsStream(dataFileName);
            JSONTokener tokener = new JSONTokener(datais);
            loginUser = new JSONObject(tokener);
        } catch(Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            if(datais != null) {
                datais.close();
            }
        }
    }

    @AfterClass
    public void afterClass() {

    }

    @BeforeMethod
    public void beforeMethod(Method m) {
        System.out.println("\n" + "-------- starting test:" + m.getName() + "-------" + "\n");
        loginPage = new loginPage();
        launchScreen = new launchScreen();
        watchScreen = new com.qa.pages.watchScreen();
        accountPage = new accountPage();
        verifyLogin = new verifyLogin();
        vodSearch = new vodSearch();
        watchList = new watchList();
        faqValidation = new faqValidation();
        SignUp = new Signup();
        SignupValidation = new SignupValidation();
        toolBar = new toolBar();
        bets = new bets();
    }

    @AfterMethod
    public void afterMethod() {
        watchScreen.scoreClick();
        accountPage.AccountIcon();
        accountPage.manageAcc();
        loginPage.signOut();
    }
    Random rand = new Random();
    // Generate random integers in range 0 to 999
    int rand_int1 = rand.nextInt(1000);

    @Test
    public void login() {
        loginPage.emailTxtField(loginUser.getJSONObject("validUser").getString("username"));
        loginPage.passwordText(loginUser.getJSONObject("validUser").getString("password"));
        loginPage.loginBtn();
        watchScreen.scoreClick();
        accountPage.AccountIcon();
        accountPage.userEmailFieldDisplayed();
        accountPage.manageAcc();
        loginPage.signOut();
        loginPage.emailTxtField(loginUser.getJSONObject("validUser").getString("username"));
        loginPage.passwordText(loginUser.getJSONObject("validUser").getString("password"));
        loginPage.loginBtn();
    }
    @Test
    public void signUp() {
        SignUp.createAccount();
        SignUp.firstName(loginUser.getJSONObject("firstName").getString("firstName"));
        SignUp.emailTextField("djay"+rand_int1+"@amdocs.com");
        SignUp.passwordText(loginUser.getJSONObject("validUser").getString("password"));
        SignUp.letsGo();
    }
    @Test
    public void signUpValidation() {
        SignUp.createAccount();
        SignupValidation.firstName();
        SignupValidation.letsGo();
        SignupValidation.emailTxtField();
        SignupValidation.passwordText();
        SignupValidation.signIn();
        loginPage.emailTxtField(loginUser.getJSONObject("validUser").getString("username"));
        loginPage.passwordText(loginUser.getJSONObject("validUser").getString("password"));
        loginPage.loginBtn();
    }

    @Test
    public void toolBar() {
        loginPage.emailTxtField(loginUser.getJSONObject("validUser").getString("username"));
        loginPage.passwordText(loginUser.getJSONObject("validUser").getString("password"));
        loginPage.loginBtn();
//        toolBar.bets();
//        toolBar.news();
//        toolBar.schedule();
//        toolBar.score();
    }

    @Test
    public void bets() {
        loginPage.emailTxtField(loginUser.getJSONObject("validUser").getString("username"));
        loginPage.passwordText(loginUser.getJSONObject("validUser").getString("password"));
        loginPage.loginBtn();
//        bets.betsOn();
//        bets.betSelect();
//        bets.accIconClick();
//        bets.NESNBets();
//        bets.betSelectAcc();
//        bets.betBack();
//        bets.done();
    }

    @Test
    public void watchScreenSignOut(){
        loginPage.emailTxtField(loginUser.getJSONObject("validUser").getString("username"));
        loginPage.passwordText(loginUser.getJSONObject("validUser").getString("password"));
        loginPage.loginBtn();
        watchScreen.scoreClick();
        accountPage.AccountIcon();
        accountPage.manageAcc();
        loginPage.signOut();
        loginPage.emailTxtField(loginUser.getJSONObject("validUser").getString("username"));
        loginPage.passwordText(loginUser.getJSONObject("validUser").getString("password"));
        loginPage.loginBtn();
    }

    @Test
    public void watchScreenValidation() {
        loginPage.emailTxtField(loginUser.getJSONObject("validUser").getString("username"));
        loginPage.passwordText(loginUser.getJSONObject("validUser").getString("password"));
        loginPage.loginBtn();
        watchScreen.score();
        watchScreen.bets();
        watchScreen.schedule();
        watchScreen.news();
    }

    @Test
    public void Search() {
        loginPage.emailTxtField(loginUser.getJSONObject("validUser").getString("username"));
        loginPage.passwordText(loginUser.getJSONObject("validUser").getString("password"));
        loginPage.loginBtn();
        vodSearch.searchButton();
        vodSearch.search(loginUser.getJSONObject("search").getString("search"));
        vodSearch.backButton();
    }
    @Test
    public void watchList() {
        loginPage.emailTxtField(loginUser.getJSONObject("validUser").getString("username"));
        loginPage.passwordText(loginUser.getJSONObject("validUser").getString("password"));
        loginPage.loginBtn();
    }

    @Test
    public void reLaunch() {
        loginPage.emailTxtField(loginUser.getJSONObject("validUser").getString("username"));
        loginPage.passwordText(loginUser.getJSONObject("validUser").getString("password"));
        loginPage.loginBtn();
        /*closeApp();
        launchApp();*/
    }

    @Test
    public void faqVerify() {
        faqValidation.isFAQLinkDisplayed();
        loginPage.emailTxtField(loginUser.getJSONObject("validUser").getString("username"));
        loginPage.passwordText(loginUser.getJSONObject("validUser").getString("password"));
        loginPage.loginBtn();
    }
}
