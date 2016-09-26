package actions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pharmacy.Actions.*;

import static junit.framework.Assert.assertEquals;

public class AdminSignUpTest {
    private AdminSignUp controller;
    private Developers developers;
    private Login login;
    private PhReg phreg;
    private PhSignUp phSignUp;
    private TryAuthorise tryAuthorise;
    private UserInfo userInfo;

    @Before
    public void setUp() throws Exception {
        controller = new AdminSignUp();
        controller.setSelNetw("da");
        controller.setPassword("da");
        controller.setName("da");
        controller.setSurname("da");
        controller.setUsername("da");
        developers = new Developers();
        login = new Login();
        phreg = new PhReg();
        phSignUp = new PhSignUp();
        tryAuthorise = new TryAuthorise();
        userInfo = new UserInfo();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void execute() throws Exception {
        assertEquals("SUCCESS", controller.execute());
    }

    @Test
    public void validate() throws Exception {
        controller.validate();
    }

    @Test
    public void devExecute() throws Exception {
        assertEquals("SUCCESS", developers.execute());
    }

    @Test
    public void logExecute() throws Exception {
        assertEquals("SUCCESS", login.execute());
    }

    @Test
    public void phrExecute() throws Exception {
        assertEquals("SUCCESS", phreg.execute());
    }

    @Test
    public void phsExecute() throws Exception {
        assertEquals("SUCCESS", phSignUp.execute());
    }

    @Test
    public void taExecute() throws Exception {
        assertEquals("SUCCESS", tryAuthorise.execute());
    }

    @Test
    public void userExecute() throws Exception {
        assertEquals("SUCCESS", userInfo.execute());
    }

    @Test
    public void logout() throws Exception {
        assertEquals("SUCCESS", login.logout());
    }

    @Test
    public void phreg() throws Exception {
        phreg.validate();
    }

    @Test
    public void phSignUp() throws Exception {
        phSignUp.validate();
    }

    @Test
    public void tryAuth() throws Exception {
        tryAuthorise.validate();
    }

}
