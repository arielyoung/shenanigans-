public class Bat extends Creature implements Flyer { 

  public Bat(String name) {
    super(name + " Bat");
  }
  
  public void move() {
    this.fly();
  }
  public void fly() {
    System.out.println(this.toString() + " is swooping through the dark.");
  }
@Override  
  public void eat(Thing aThing) {
    if (aThing instanceof Creature) {
      super.eat(aThing);
     }
  }

}
