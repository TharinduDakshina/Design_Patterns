package Behivioral_patterns.Command_Pattern;

public class SellStock implements Order {
  private Stock abcStock;

  public SellStock(Stock abcStock) {
    this.abcStock = abcStock;
  }

  public void execute() {
    abcStock.sell();
  }
}