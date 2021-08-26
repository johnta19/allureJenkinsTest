import org.testng.annotations.Test;

/*@Listeners(ListenersTest.class)*/
public class LoginTest extends BaseTest {
    public static String correctUser = "standard_user";
    public static String lockedUser = "locked_out_user";
    public static String incorrectUser = "bla";
    public static String password = "secret_sauce";

    /*@Description("Standard user should be able to login")*/
    @Test
    public void correctLogin() {
        BayerSteps.correctLogIn(correctUser, password).logOut();
    }

   /* @Description("User should not be able to login with incorrect credentials")*/
    @Test
    public void incorrectLogin() {
        BayerSteps.incorrectLogIn(incorrectUser, password).assertionForIncorrectLogin();
    }

   /* @Description("Locked user should not be able to login")*/
    @Test
    public void lockedLogin() {
        BayerSteps.lockedLogIn(lockedUser, password).assertionForLockedLogin();
    }
}
