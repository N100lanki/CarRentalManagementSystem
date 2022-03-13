package com.example.TravelApplication.Dao;

import java.util.List;

import com.example.TravelApplication.Entity.Car;

public interface CarDao {

	List<Car> findAll();

	void insertCar(Car car);

	void updateCar(int id , Car car);

	void deleteCar(int id);
	
	Car getCar(int id);


//	public String getName (String id,String password);



}
