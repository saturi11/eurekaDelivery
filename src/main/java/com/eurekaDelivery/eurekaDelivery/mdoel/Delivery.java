package com.eurekaDelivery.eurekaDelivery.mdoel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "delivery")
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "deliveryid", nullable = false)
    public Long deliveryid;

    @Column(name = "orderid", nullable = false)
    public Long orderid;

    @Column(name = "customerid", nullable = false)
    public long customerid;

    @Column(name = "deliveryaddress", nullable = false)
    public String deliveryaddress;

    @Column(name = "shippintValue", nullable = false)
    public long shippintValue;

    public Delivery() {
    }

    public Delivery(Long deliveryid, Long orderid, long customerid, String deliveryaddress, long shippintValue) {
        this.deliveryid = deliveryid;
        this.orderid = orderid;
        this.customerid = customerid;
        this.deliveryaddress = deliveryaddress;
        this.shippintValue = shippintValue;
    }

    public Long getDeliveryid() {
        return deliveryid;
    }

    public void setDeliveryid(Long deliveryid) {
        this.deliveryid = deliveryid;
    }

    public Long getOrderid() {
        return orderid;
    }

    public void setOrderid(Long orderid) {
        this.orderid = orderid;
    }

    public long getCustomerid() {
        return customerid;
    }

    public void setCustomerid(long customerid) {
        this.customerid = customerid;
    }

    public String getDeliveryaddress() {
        return deliveryaddress;
    }

    public void setDeliveryaddress(String deliveryaddress) {
        this.deliveryaddress = deliveryaddress;
    }

    public long getShippintValue() {
        return shippintValue;
    }

    public void setShippintValue(long shippintValue) {
        this.shippintValue = shippintValue;
    }

    @Override
    public String toString() {
        return "Delivery [deliveryid=" + deliveryid + ", orderid=" + orderid + ", customerid=" + customerid
                + ", deliveryaddress=" + deliveryaddress + ", shippintValue=" + shippintValue + "]";
    }
}
