package Behivioral_patterns.Chain_of_Responsibility;

public interface DispenseChain {

  void setNextChain(DispenseChain nextChain);

  void dispense(Currency cur);
}