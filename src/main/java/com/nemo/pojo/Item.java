package com.nemo.pojo;


public class Item {

  private String name;
  private double price;
  private long count;


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  public long getCount() {
    return count;
  }

  public void setCount(long count) {
    this.count = count;
  }

  @Override
  public String toString() {
    return "Item{" +
            "name='" + name + '\'' +
            ", price=" + price +
            ", count=" + count +
            '}';
  }
}
