package Behivioral_patterns.Visitor_Pattern;

public class Keyboard implements ComputerPart {

  @Override
  public void accept(ComputerPartVisitor computerPartVisitor) {
    computerPartVisitor.visit(this);
  }
}