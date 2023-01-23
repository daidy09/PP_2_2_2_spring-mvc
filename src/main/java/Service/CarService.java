package Service;

import Model.Car;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CarService {
    List<Car> getListOfCars(int count);
}
