package com.eurekaDelivery.eurekaDelivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eurekaDelivery.eurekaDelivery.mdoel.Delivery;

@Repository
public interface DeliveryRepository extends JpaRepository<Delivery, Long>{
    
}
