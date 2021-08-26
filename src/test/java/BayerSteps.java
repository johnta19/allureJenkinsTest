

public class BayerSteps {
    private static LoginPage loginPage;
    private static MainPage mainPage;

    public static LoginPage correctLogIn(String user, String pass) {
        return loginPage.login(user, pass);
    }

    public static void init(){
        loginPage = new LoginPage(BaseTest.getDriver());
        mainPage = new MainPage(BaseTest.getDriver());
    }


    public static LoginPage correctLogOut() {
        return loginPage.logOut();
    }

    public static LoginPage incorrectLogIn(String user, String pass) {
        return loginPage.login(user, pass);
    }

    public static LoginPage lockedLogIn(String user, String pass) {
        return loginPage.login(user, pass);
    }

    public static MainPage chooseItemSauceLabsBackpack() {
        return mainPage.chooseItemSauceLabsBackpack();
    }

    public static MainPage addToCartItemSauceLabsBackpack() {
        return mainPage.addToCartSauceLabsBackpack();
    }




}