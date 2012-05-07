package models;

public class StockItem {

  public Long id;

  public Warehouse warehouse;

  public Product product;

  public Long quantity;

  public String toString() {
    return String.format("%d %s", quantity, product);
  }
}
