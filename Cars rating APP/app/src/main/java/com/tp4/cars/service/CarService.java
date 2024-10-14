package com.tp4.cars.service;

import com.tp4.cars.beans.Car;
import com.tp4.cars.dao.IDao;

import java.util.ArrayList;
import java.util.List;

public class CarService implements IDao<Car> {
    List<Car> cars;
    private static CarService instance;

    private CarService() {
        this.cars = new ArrayList<>();
    }

    public static CarService getInstance(){
        if(instance == null){
            instance = new CarService();
        }
        return instance;
    }
    @Override
    public boolean create(Car o) {
        return cars.add(o);
    }

    @Override
    public boolean delete(Car o) {
        return cars.remove(o);
    }

    @Override
    public boolean update(Car o) {
        for (Car c: cars){
            if (c.getId() == o.getId()){
                c.setImg(o.getImg());
                c.setName(o.getName());
                c.setStar(o.getStar());
            }
        }
        return true;
    }

    @Override
    public List<Car> findAll() {
        return cars;
    }

    @Override
    public Car findById(int id) {
        for (Car c: cars){
            if (c.getId() == id)
                return c;
        }
        return null;
    }
}
