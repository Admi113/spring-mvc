package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiseImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarController {
    @Autowired
    private CarServiseImpl carServise;

    @GetMapping(value = "/Cars")
    public String printWelcome(@RequestParam int id, Model model) {
        model.addAttribute("messages", carServise.getCarList(id));
        return "carView";
    }

}
