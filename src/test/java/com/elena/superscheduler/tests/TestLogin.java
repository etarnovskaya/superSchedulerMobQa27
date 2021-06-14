package com.elena.superscheduler.tests;

import com.elena.superscheduler.model.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin extends TestBase{
    @Test
    public void testLogin() throws InterruptedException {
        app.getUser().fillLoginForm(new User().withEmail("qwerty@dd.com").withPassword("Aa1234567"));

        app.getUser().tapLoginButton();
        Assert.assertTrue(app.getUser().loginButtonIsNotPresent());
    }
}
