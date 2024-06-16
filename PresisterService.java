package homework;

public class PresisterService {
    Persister persister = new Persister();

    public void save(User user) {
        persister.setUser(user);
        persister.save();
    }

    public void report(User user) {
        System.out.println("Report for user: " + user.getName());
    }
}
