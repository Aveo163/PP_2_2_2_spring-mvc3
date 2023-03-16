package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private final List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car(1L, "Mercedes", 34556453));
        carList.add(new Car(2L, "BMW", 45221334));
        carList.add(new Car(3L, "Toyota", 453234134));
        carList.add(new Car(4L, "Nissan", 543233423));
        carList.add(new Car(5L, "Chevrolet", 452423423));
    }

    public List<Car> getLimitCars(Integer count) {
        return carList.stream().limit(count).toList();
    }
    public List<Car> getAllCars() {
        return carList;
    }

    @Override
    public void add(Car car) {

    }

    @Override
    public List<Car> listCars() {
        return null;
    }
}
