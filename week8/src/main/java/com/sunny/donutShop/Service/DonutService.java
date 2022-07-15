package com.sunny.donutShop.Service;

import com.sunny.donutShop.Entity.Donut;
import com.sunny.donutShop.Entity.ExtraDonut;
import com.sunny.donutShop.Repository.DonutShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DonutService {

    private  DonutShopRepository donutShopRepository;

    @Autowired
    public DonutService(DonutShopRepository donutShopRepository) {
        this.donutShopRepository = donutShopRepository;
    }


    public List<Donut> findDonuts() {
        return donutShopRepository.findAll();
    }

    public ResponseEntity<String> save(ExtraDonut extraDonut) {
        try {
            donutShopRepository.save(new Donut(extraDonut.getName(), extraDonut.getDescription(), extraDonut.getPrice(), extraDonut.getPicture()));
            return new ResponseEntity<>("Donut has been saved", HttpStatus.OK);
        }catch (Exception e) {
            return  new ResponseEntity<>("Something went wrong. Donut has not been saved",HttpStatus.BAD_REQUEST);
        }
    }

    public ResponseEntity<String> deleteById(Long id) {
        try {
            donutShopRepository.deleteById(id);
            return new ResponseEntity<>("Donut with id " + id + " has been removed",HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>("Donut with id " + id + " has been removed",HttpStatus.BAD_REQUEST);
        }
    }

    public ResponseEntity<?> findById(Long id) {
        try{
            return new ResponseEntity<>(donutShopRepository.findById(id),HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>("Donut with id " + id + " not found",HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<String> update(Donut donut) {
        return donutShopRepository.findById(donut.getId()).map(donut1 -> {
                donut1.setDescription(donut.getDescription());
                donut1.setName(donut.getName());
                donut1.setPicture(donut.getPicture());
                donut1.setPrice(donut.getPrice());
                donutShopRepository.save(donut1);
                return new ResponseEntity<>("Donut has been updated", HttpStatus.OK);
            }).orElse(new ResponseEntity<>("Donut has not been updated", HttpStatus.BAD_REQUEST));
        }
}

