package com.sunny.donutshop.Repository;

import com.sunny.donutshop.Entity.Donut;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonutShopRepository  extends JpaRepository<Donut,Long> {

}
