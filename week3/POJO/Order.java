package lab;

import java.util.Arrays;
import java.util.Date;

public class Order {
    private Donut[] allDonuts;
    private OrderState orderState;
    private int orderPrice;
    private Client client;
    private String address;
    private Date createdTime;

    public Order(Donut[] allDonuts, OrderState orderState, int orderPrice, Client client, String address, Date createdTime) {
        this.allDonuts = allDonuts;
        this.orderState = orderState;
        this.orderPrice = orderPrice;
        this.client = client;
        this.address = address;
        this.createdTime = createdTime;
    }

    public Donut[] getAllDonuts() {
        return allDonuts;
    }

    public void setAllDonuts(Donut[] allDonuts) {
        this.allDonuts = allDonuts;
    }

    public OrderState getOrderState() {
        return orderState;
    }

    public void setOrderState(OrderState orderState) {
        this.orderState = orderState;
    }

    public int getOrderPrice() {
        int r = 0;
        for (Donut donut : this.allDonuts) {
            r+=donut.getPrice();
        }
        return (int) (r * client.getClient_role().getDiscount());
    }

    public void setOrderPrice(int orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
}
