package Singelton;

public class Login {
    private static Login login;
    private static String logFile="This is log file.\n\n";
    public static synchronized Login getInstance(){
        if (login==null) {
            login=new Login();
        }
           return login;
    }
    private Login() {
    }
    public void addLoginInfo(String logInfo){
        logFile+=logInfo+"\n";
    }
    public void showLogin(){
        System.out.println(logFile);
    }
}
