package OnlineShopHomework;

public class LoginForm {
    static String loginemail;
    static String loginpassword;


    LoginForm() {
    }

    // LoginForm(String email, String password) {
    //     this.email = email;
    //     this.password = password;
    // }
    public static String loginTry(String loginemail, String loginpassword) {
        String loginInfo = loginemail + loginpassword;
        return loginInfo;
    }
}
