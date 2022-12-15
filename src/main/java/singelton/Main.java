package singelton;

public class Main {
    public static void main(String[] arg){
        FirstClass firstClass=new FirstClass();
        SecondClass secondClass=new SecondClass();
        Login.getInstance().addLoginInfo(firstClass);
        Login.getInstance().addLoginInfo(secondClass);
        Login.getInstance().addLoginInfo("nnnn");
        Login.getInstance().showLogin();
    }
}
