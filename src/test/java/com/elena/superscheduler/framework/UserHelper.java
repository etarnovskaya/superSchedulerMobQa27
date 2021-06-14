package com.elena.superscheduler.framework;

import com.elena.superscheduler.model.User;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class UserHelper extends com.elena.superscheduler.framework.HelperBase {


    public UserHelper(AppiumDriver wd) {
        super(wd);
    }

    public void confirmLogin() {
        click(By.cssSelector("#login-submit"));
    }

    public void fillLoginForm(User user) {
        type(By.id("log_email_input"), user.getEmail());
        type(By.id("log_password_input"), user.getPassword());
        wd.hideKeyboard();
    }

    public void tapLoginButton() {
        click(By.id("login_btn"));
    }


    public void logout() {
        //click on avatar
        //click logout
        //confirm logout

    }

    public boolean loginButtonIsNotPresent() throws InterruptedException {
        Thread.sleep(5000);
        return !isElementPresent(By.id("login_btn"));
    }
}
