package homework.controller;

import homework.service.PresisterService;
import homework.model.User;

public class PresisterController {
    PresisterService service= new PresisterService();


    public void save(User user) {
        service.save(user);
    }

    public void report(User user) {
        service.report(user);
    }
}
