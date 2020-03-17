public class User {
    String hasło;
    String login;
    Rola rola;
    User(String login,String hasło){
        this.login=login;
        this.hasło=hasło;
        this.rola=Rola.User;
    }
    User(String login,String hasło,Rola rola){
        this.login=login;
        this.hasło=hasło;
        this.rola=rola;
    }
}
