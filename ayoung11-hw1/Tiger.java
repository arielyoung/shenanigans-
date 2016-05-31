public class Tiger extends Creature {

  public Tiger(String name) {
    super(name + " Tiger");
  }
  public void move() {
    System.out.println(this.toString() + " has just pounced");
  }
}
