package com.example.demo.Repository;


import com.example.demo.Entity.Donut;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonutShopRepository  extends JpaRepository<Donut,Long> {

}
