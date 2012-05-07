package models;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {

  public Long id;

  public String name;

  public List<StockItem> stock = new ArrayList<StockItem>();

  public String toString() {
    return name;
  }
}
