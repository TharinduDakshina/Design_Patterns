package Behivioral_patterns.Visitor_Pattern;

public interface ComputerPart {
  public void accept(ComputerPartVisitor computerPartVisitor);
}