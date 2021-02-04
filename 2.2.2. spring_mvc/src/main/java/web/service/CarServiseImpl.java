package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class CarServiseImpl implements CarService {
    @Override
    public List<Car> getCarList(int number) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("owner1", "model1", 100));
        cars.add(new Car("owner2", "model2", 200));
        cars.add(new Car("owner3", "model3", 300));
        cars.add(new Car("owner4", "model4", 400));
        cars.add(new Car("owner5", "model5", 500));
        return cars.stream().limit(number).collect(Collectors.toList());
    }
}


