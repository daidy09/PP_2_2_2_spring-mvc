package Service;

import Model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpl implements CarService{
    private int count;
    List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car("red", 2, 320));
        carList.add(new Car("blue", 4, 260));
        carList.add(new Car("black", 6, 230));
        carList.add(new Car("yellow", 8, 200));
        carList.add(new Car("green", 1, 430));
    }

    @Override
    public List<Car> getListOfCars(int count) {
        return carList.stream().limit(count).toList();
    }
}
