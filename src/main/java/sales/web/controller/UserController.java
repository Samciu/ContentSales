package sales.web.controller;

import org.springframework.stereotype.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    
    @RequestMapping(path = { "/index"})
    public String userList(Model model) {
        // model.addAttribute("userList", this.userService.getUserList());

        return "show";
    }
}