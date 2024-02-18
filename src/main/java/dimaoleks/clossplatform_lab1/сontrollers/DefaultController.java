package dimaoleks.clossplatform_lab1.сontrollers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class DefaultController {

    @GetMapping
    public String index(Model model) {
        model.addAttribute("cars", List.of("Audi", "BMW", "Bugatti"));
        return "default";
    }
}
