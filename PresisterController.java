package homework;

public class PresisterController {
    PresisterService service= new PresisterService();


    public void save(User user) {
        service.save(user);
    }

    public void report(User user) {
        service.report(user);
    }
}
