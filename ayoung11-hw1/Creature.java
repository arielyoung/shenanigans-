public abstract class Creature extends Thing {
  
  private Thing stm;

  public Creature(String name) {
    super(name);
    stm = null;
  }
  public void eat(Thing thing) {
    this.stm = thing;
    System.out.println(this.toString() + " has just eaten a " + thing.toString());
  }
  public abstract void move();

  public void whatDidYouEat() {
    if (this.stm == null) {
      System.out.println(this.toString() + " has had nothing to eat!");
    } else {
      System.out.println(this.toString() + " has eaten " + (this.stm).toString());
    }
  }
}
