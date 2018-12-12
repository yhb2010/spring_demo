//表演者：抛豆子
package com.chapter2.constructor;

public class Juggler implements Performer {
  private int beanBags = 3;

  public Juggler() {
  }

  public Juggler(int beanBags) {
    this.beanBags = beanBags;
  }

  public void perform() throws PerformanceException {
    System.out.println("JUGGLING " + beanBags + " BEANBAGS");
  }
}
