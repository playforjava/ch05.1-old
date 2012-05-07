package models;

import java.util.List;

public class Product {

  public Long id;

  public Long ean;
  public String name;
  public String description;

  public List<StockItem> stockItems;

  public String toString() {
    return name;
  }
}
