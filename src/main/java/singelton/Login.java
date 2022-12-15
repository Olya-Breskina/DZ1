package singelton;

public class Login {
    private static Login login;
    private static String logFile = "This is log file.\n\n";
    public static Login getInstance() {
        if (login == null) {
            login = new Login();
        }
        return login;
    }
    private Login() {
    }
    public void addLoginInfo(Object logInfo) {
        //.getClass().toString();
        logFile += logInfo.getClass().toString() + "\n";
    }
    public void showLogin() {
        System.out.println(logFile);
    }
}
