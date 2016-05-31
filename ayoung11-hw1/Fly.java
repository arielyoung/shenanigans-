public class Fly extends Creature implements Flyer {
  
  public Fly(String name) {
    super(name + " Fly");
  }
 @Overrides 
  public void eat(Thing aThing) {
    if ( !(aThing instanceof Creature)) {
      super.eat(aThing);
    }
  }
  
  public void move() {
    this.fly();
  }
  
  public void fly() {
    System.out.println(this.toString() + " is buzzing around in flight");
  }
}
