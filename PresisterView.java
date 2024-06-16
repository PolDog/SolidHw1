package homework;

public class PresisterView {
    public void start() {
        User user = createUser();
        PresisterController controller = new PresisterController();
        controller.report(user);
        controller.save(user);
    }

    private User createUser() {
        return new User("Bob");
    }
}
