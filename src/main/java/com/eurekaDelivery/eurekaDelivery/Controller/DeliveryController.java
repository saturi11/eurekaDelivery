package com.eurekaDelivery.eurekaDelivery.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eurekaDelivery.eurekaDelivery.exception.ResourceNotFoundException;
import com.eurekaDelivery.eurekaDelivery.mdoel.Delivery;
import com.eurekaDelivery.eurekaDelivery.repository.DeliveryRepository;

@RestController
@RequestMapping("/api/v1")
public class DeliveryController {

    @Autowired
    private DeliveryRepository deliveryRepository;

    @GetMapping("/deliveries")
    public List<Delivery> getAllDeliveries() {
        return deliveryRepository.findAll();
    }

    @GetMapping("/deliveries/{id}")
    public ResponseEntity<Delivery> getDeliveryById(@PathVariable(value = "id") Long deliveryId)
            throws ResourceNotFoundException {
        Delivery delivery = deliveryRepository.findById(deliveryId)
                .orElseThrow(() -> new ResourceNotFoundException("Delivery not found for this id :: " + deliveryId));
        return ResponseEntity.ok().body(delivery);
    }

    @PostMapping("/deliveries")
    public Delivery createDelivery(@Valid @RequestBody Delivery delivery) {
        return deliveryRepository.save(delivery);
    }

    @PutMapping("/deliveries/{id}")
    public ResponseEntity<Delivery> updateDelivery(@PathVariable(value = "id") Long deliveryId,
                                                   @Valid @RequestBody Delivery deliveryDetails) throws ResourceNotFoundException {
        Delivery delivery = deliveryRepository.findById(deliveryId)
                .orElseThrow(() -> new ResourceNotFoundException("Delivery not found for this id :: " + deliveryId));

        delivery.setCustomerid(deliveryDetails.getCustomerid());
        delivery.setDeliveryaddress(deliveryDetails.getDeliveryaddress());
        delivery.setOrderid(deliveryDetails.getOrderid());
        delivery.setDeliveryaddress(deliveryDetails.getDeliveryaddress());
        final Delivery updatedDelivery = deliveryRepository.save(delivery);
        return ResponseEntity.ok(updatedDelivery);
    }

    @DeleteMapping("/deliveries/{id}")
    public Map<String, Boolean> deleteDelivery(@PathVariable(value = "id") Long deliveryId)
            throws ResourceNotFoundException {
        Delivery delivery = deliveryRepository.findById(deliveryId)
                .orElseThrow(() -> new ResourceNotFoundException("Delivery not found for this id :: " + deliveryId));

        deliveryRepository.delete(delivery);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}