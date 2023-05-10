package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCarList(int count) {

        List<Car> carList = new ArrayList<>();

        carList.add(new Car("Toyota", "Black", 900000));
        carList.add(new Car("Ferrari", "Red", 2000000));
        carList.add(new Car("Mercedes", "White", 1810000));
        carList.add(new Car("Audi", "Blue", 1700000));
        carList.add(new Car("Ford", "Red", 870000));

        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
