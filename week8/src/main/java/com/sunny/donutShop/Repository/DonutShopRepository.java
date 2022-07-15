package com.sunny.donutShop.Repository;


import com.sunny.donutShop.Entity.Donut;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonutShopRepository  extends JpaRepository<Donut,Long> {

}
