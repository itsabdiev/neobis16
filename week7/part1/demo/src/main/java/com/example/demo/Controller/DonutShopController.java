package com.example.demo.Controller;


import com.example.demo.Entity.Donut;
import com.example.demo.Repository.DonutShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/donuts")
public class DonutShopController {
    private final DonutShopRepository donutShopRepository;

    @Autowired
    public DonutShopController(DonutShopRepository donutShopRepository) {
        this.donutShopRepository = donutShopRepository;
    }


    @GetMapping("/getAll")
    public List<Donut> getThemAll() {
        return donutShopRepository.findAll();
    }

    @PostMapping("/saveDonut")
    public Donut saveDonut(@RequestBody Donut donut) {
        return donutShopRepository.save(donut);
    }

    @DeleteMapping("/removeDonut/{id}")
    public String deleteDonut(@PathVariable Long id)  throws EmptyResultDataAccessException {
        donutShopRepository.deleteById(id);
        return "Donut with id " + id +" has been deleted";
    }

    @GetMapping("/getById/{id}")
    public Donut getById(@PathVariable Long id) {
        return donutShopRepository.findById(id).orElse(null);
    }

    @PatchMapping("/updateDonut")
    public Donut updateDonut(@RequestBody Donut donut) {
        return donutShopRepository.save(donut);
    }
}
