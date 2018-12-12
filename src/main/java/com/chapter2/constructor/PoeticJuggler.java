//表演者2：在抛豆子的同时可以念诗
package com.chapter2.constructor;

public class PoeticJuggler extends Juggler {
  private Poem poem;

  public PoeticJuggler(Poem poem) { //<co id="co_injectPoem"/>
    super();
    this.poem = poem;
  }

  public PoeticJuggler(int beanBags, Poem poem) { // <co id="co_injectPoemBeanBags"/>
    super(beanBags);
    this.poem = poem;
  }

  public void perform() throws PerformanceException {
    super.perform();
    System.out.println("While reciting...");
    poem.recite();
  }
}
