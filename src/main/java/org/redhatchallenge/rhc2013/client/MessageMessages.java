package org.redhatchallenge.rhc2013.client;

import com.google.gwt.i18n.client.Messages;

import javax.mail.Message;

/**
 * @author: Terry Chia (terrycwk1994@gmail.com)
 */
public interface MessageMessages extends Messages {
    @Messages.DefaultMessage("Hello")
    String hello();

    @Messages.DefaultMessage("Oops, are you sure you are logged in?")
    String loginError();

    @Messages.DefaultMessage("Take the Challenge Now")
    String takeChallenge();

    @Messages.DefaultMessage("Oops, something went wrong...")
    String somethingWrong();

    @Messages.DefaultMessage("Error with your confirmation token")
    String confirmationTokenError();

    @Messages.DefaultMessage("Thank you for confirming your account!")
    String confirmedAccount();

    @Messages.DefaultMessage("An unexpected error has occurred, please try again later!")
    String unexpectedError();

    @Messages.DefaultMessage("Your login attempt was unsuccessful, please double check your inputs.")
    String loginUnsuccessful();

    @Messages.DefaultMessage("You are probably not logged in")
    String probablyNotLoginIn();

    @Messages.DefaultMessage("Profile update successful!")
    String profileUpdated();

    @Messages.DefaultMessage("Profile update failed! Please double check your inputs!")
    String profileUpdateFail();

    @Messages.DefaultMessage("Invalid email format!")
    String invalidEmailFormat();

    @Messages.DefaultMessage("Someone has already used this email/contact. Try another?")
    String emailTaken();

    @Messages.DefaultMessage("<p><FONT SIZE=5>Hi <B><I>{0}</I></B>! Almost there!</FONT></p>" +
            "<br><FONT SIZE=4>Go to <B>{1}</B> and confirm your registration.</FONT></br>" +
            "<p><FONT SIZE=4>Share with your friends that you have registered for Red Hat Challenge 2013.</FONT></p>" +
            "<FONT SIZE=5 COLOR=\"red\"><B>Get them to join as well!</B></FONT>")
    String verifyMailMessage(String firstname, String email);

    @Messages.DefaultMessage("Error with password reset token")
    String passwordTokenError();

    @Messages.DefaultMessage("<h1>Password reset is successful!</h1>")
    String passwordResetSuccess();

    @Messages.DefaultMessage("<h1>An unexpected error has occurred, please try resetting your password again.</h1>")
    String errorResetPassword();

    @Messages.DefaultMessage("Please check your email for instructions to reset your password.")
    String passwordResetInstruction();

    @Messages.DefaultMessage("Error with password reset, please check that your email and contact is correct.")
    String passwordResetError();

    @Messages.DefaultMessage("Days")
    String days();

    @Messages.DefaultMessage("Please check the box for the Terms of Use and Privacy Policy before proceeding!")
    String termsCheck();

    @Messages.DefaultMessage("Email field cannot be empty.")
    String emailEmpty();

    @Messages.DefaultMessage("You have entered an invalid email format.")
    String emailInvalidFormat();

    @Messages.DefaultMessage("Password field cannot be empty.")
    String emptyPassword();

    @Messages.DefaultMessage("Your password is not valid. Password should contain at least 8 characters with at least 1 uppercase letter, 1 lowercase letter and 1 numeric character.")
    String passwordInvalidFormat();

    @Messages.DefaultMessage("Confirm password field cannot be empty.")
    String emptyConfirmPassword();

    @Messages.DefaultMessage("Password does not match.")
    String passwordNotMatch();

    @Messages.DefaultMessage("First Name field cannot be empty.")
    String emptyFirstName();

    @Messages.DefaultMessage("Last name cannot be empty.")
    String emptyLastName();

    @Messages.DefaultMessage("Contact field cannot be empty.")
    String emptyContact();

    @Messages.DefaultMessage("You have entered an invalid contact number.")
    String contactInvalid();

    @Messages.DefaultMessage("School field cannot be empty.")
    String emptySchool();

    @Messages.DefaultMessage("Please enter a new password")
    String enterNewPassword();

    @Messages.DefaultMessage("Current password field cannot be empty.")
    String currentPasswordEmpty();

    @Messages.DefaultMessage("Password Changed Successfully!")
    String passwordChangeSuccessful();





}
