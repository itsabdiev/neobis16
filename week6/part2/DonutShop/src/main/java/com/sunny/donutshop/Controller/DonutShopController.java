package com.sunny.donutshop.Controller;


import com.sunny.donutshop.Entity.Donut;
import com.sunny.donutshop.Repository.DonutShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/donuts")
public class DonutShopController {
    @Autowired
    private DonutShopRepository donutShopRepository;


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
    public Donut getById(@PathVariable Long id) throws Exception{
        return donutShopRepository.findById(id).orElse(null);
    }

    @PatchMapping("/updateDonut")
    public Donut updateDonut(@RequestBody Donut donut) {
        return donutShopRepository.save(donut);
    }
}
