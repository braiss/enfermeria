package com.example.enfermeria.controladores;

import com.example.enfermeria.modelos.CarModelo;
import com.example.enfermeria.servicios.CarServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CarControlador {

    @Autowired
    CarServicio carServicio;
    @GetMapping("/car")
    public Optional<CarModelo> obtenerCarPorId(@RequestParam int id){
        return carServicio.obtenerCarPorId(id);

    }
    @GetMapping("/car-todos")
    public List<CarModelo> obtenerTodosCar(){
        return carServicio.obtenerTodosCar();

    }
    @DeleteMapping("/car")
    public void eliminarCarPorId(@RequestParam int id){
        carServicio.eliminarCarPorId(id);

    }
    @PostMapping("/car")
    public void crearCar(@RequestBody CarModelo carModelo){
        carServicio.crearCar(carModelo);
    }
    @PutMapping("/car")
    public void actualizarCar(@RequestBody CarModelo carModelo){
        carServicio.actualizarCar(carModelo);
    }

}
