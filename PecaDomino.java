public class PecaDomino {
  private int v1;
  private int v2;

  public PecaDomino(int v1, int v2) {
    this.v1 = v1;
    this.v2 = v2;
  }

  public String toString() {
    return "[" + this.v1 + "|" + this.v2 + "]";
  }
}
