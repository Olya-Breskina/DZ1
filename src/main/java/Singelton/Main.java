package Singelton;

public class Main {
    public static void main(String[] arg){
        //System.out.println(Login.getInstance().toString());
        Login.getInstance().addLoginInfo("FirstClass");
        Login.getInstance().addLoginInfo("SecondClass");
        Login.getInstance().showLogin();
    }
}
