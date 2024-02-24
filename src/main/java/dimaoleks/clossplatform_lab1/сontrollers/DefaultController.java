package dimaoleks.clossplatform_lab1.сontrollers;

import dimaoleks.clossplatform_lab1.models.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/", produces = "text/html; charset=utf-8")
public class DefaultController {

    @GetMapping
    public String index(Model model) {
        model.addAttribute("userName", getUserName());
        model.addAttribute("cars", List.of("Audi", "BMW", "Bugatti"));
        model.addAttribute("progLanguages", createAndGetDictionary());
        model.addAttribute("carObjects", createAndGetCarList());
        model.addAttribute("car", new Car("Tesla", 45000, "electricity"));
        model.addAttribute("searchTerm", "Best Car 2024");
        model.addAttribute("index", 5);
        model.addAttribute("followersCount", 0);

        return "default";
    }

    @GetMapping(value = "simple")
    public String simple() {

        return "simple";
    }

    private static String getUserName() {
        return "Dmytro Oleksandryuk";
    }

    private static Map<String, String> createAndGetDictionary() {
        // Here isn't possible to write key with special symbols (C#, C++)
        Map<String, String> carMap = new HashMap<>();
        carMap.put("CSharp", "C# description");
        carMap.put("Java", "Java description");
        carMap.put("JavaScript", "JavaScript description");
        carMap.put("CPlusPlus", "C++ description");
        carMap.put("Python", "Python description");

        return carMap;
    }

    private static List<Car> createAndGetCarList() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Daewoo Lanos", 4500));
        cars.add(new Car("Peugeot 309", 8900));

        return cars;
    }
}
