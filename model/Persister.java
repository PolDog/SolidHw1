package homework.model;

public class Persister{ // сохраняльщик
    private User user;

    public void setUser(User user) {
        this.user = user;
    }
    public void save(){
        System.out.println("Save user: " + user.getName());
    }
}
