package sprboot.MyPP.Controller;

import sprboot.MyPP.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import sprboot.MyPP.service.UserDaoService;

@Controller
@RequestMapping("/")
public class UserController {
    private final UserDaoService userService;
    @Autowired
    public UserController(UserDaoService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public String getUser(ModelMap model) {
        model.addAttribute("users", userService.getUsersList());
        return "users";
    }

    @GetMapping(value = "/editUser/{id}")
    public String editUser(@PathVariable int id, ModelMap model) {
        model.addAttribute("user", userService.getById(id));
        return "editUser";
    }

    @GetMapping(value = "/addUser")
    public String addUser(ModelMap model) {
        model.addAttribute("user", new User());
        return "addUser";
    }

    @GetMapping(value="/deleteUser/{id}")
    public String deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
        return "redirect:/users";
    }

    @PostMapping(value="/editUser/{getId}")
    public String saveEditUser(@PathVariable int getId, @ModelAttribute("user") User user){
        user.setId(getId);
        userService.updateUser(user);
        return "redirect:/users";
    }

    @PostMapping(value="/addUser")
    public String saveUser(@ModelAttribute("user") User user){
        userService.addUser(user);
        return "redirect:/users";
    }
}
