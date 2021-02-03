package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarController {


    @GetMapping(value = "/Cars")
    public String printWelcome( @RequestParam int id, Model model) {
        List<Car>cars = new ArrayList<>();
        cars.add(new Car("owner1","model1",100));
        cars.add(new Car("owner2","model2",200));
        cars.add(new Car("owner3","model3",300));
        cars.add(new Car("owner4","model4",400));
        cars.add(new Car("owner4","model4",400));
        List<Car>result =cars.stream().limit(id).collect(Collectors.toList());
        model.addAttribute("messages", result);
        return "index";
    }

}
