package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImp;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarServiceImp carService;

    public CarController(CarServiceImp carService) {
        this.carService = carService;
    }

    @GetMapping
    public String getCar(@RequestParam(value = "count", required = false) Integer count,
                         Model model) {
        if (count != null && count < 5 && count > 0) {
            model.addAttribute("cars", carService.getLimitCars(count));
        } else {
            model.addAttribute("cars", carService.getAllCars());
        }
        return "cars";
    }

}
