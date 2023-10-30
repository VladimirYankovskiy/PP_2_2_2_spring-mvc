package web.DAO;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao{
    private static final List<Car> CARS = new ArrayList<>();

    static {
        CARS.add(new Car(111,"LADA",10));
        CARS.add(new Car(222,"UAZ",20));
        CARS.add(new Car(333,"LIAZ",30));
        CARS.add(new Car(444,"PAZ",40));
        CARS.add(new Car(555,"URAL",50));
    }

    @Override
    public List<Car> getCars(int curent) {
        if (curent == 0) {
            return CARS;
        }
        return CARS.stream().limit(curent).collect(Collectors.toList());
    }
}
