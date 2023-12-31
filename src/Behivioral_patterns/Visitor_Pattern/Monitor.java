package Behivioral_patterns.Visitor_Pattern;

public class Monitor implements ComputerPart {

  @Override
  public void accept(ComputerPartVisitor computerPartVisitor) {
    computerPartVisitor.visit(this);
  }
}