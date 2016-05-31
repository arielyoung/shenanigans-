public class Thing {
  
  private final name;

  public Thing(String name) {
    this.name = name;
  }

@Override
  public String toString() {
    return this.name;
  }
}
