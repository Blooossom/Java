package toyProject1;

import java.util.Objects;

public class Customer {
    private String customerName;
    private String customerID;
    private int shopingTime;
    private int price;
    private String customeNo;

    public Customer(){

    }

    public Customer(String customerName, String customerID, int shopingTime, int price, String customeNo) {
        this.customerName = customerName;
        this.customerID = customerID;
        this.shopingTime = shopingTime;
        this.price = price;
        this.customeNo = customeNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public int getShopingTime() {
        return shopingTime;
    }

    public void setShopingTime(int shopingTime) {
        this.shopingTime = shopingTime;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCustomeNo() {
        return customeNo;
    }

    public void setCustomeNo(String customeNo) {
        this.customeNo = customeNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return shopingTime == customer.shopingTime && price == customer.price && Objects.equals(customerName, customer.customerName) && Objects.equals(customerID, customer.customerID) && Objects.equals(customeNo, customer.customeNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerName, customerID, shopingTime, price, customeNo);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", customerID='" + customerID + '\'' +
                ", shopingTime=" + shopingTime +
                ", price=" + price +
                ", customeNo='" + customeNo + '\'' +
                '}';
    }

}
