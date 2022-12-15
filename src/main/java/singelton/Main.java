package singelton;

public class Main {
    public static void main(String[] arg){
        Login.getInstance().addLoginInfo(FirstClass.class);
        Login.getInstance().addLoginInfo(SecondClass.class);
        Login.getInstance().showLogin();
    }
}
