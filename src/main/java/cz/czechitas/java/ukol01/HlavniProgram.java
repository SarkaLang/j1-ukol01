package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

public class HlavniProgram {
  private Turtle zofka;

  public static void main(String[] args) {
    new HlavniProgram().start();
  }

  public void start() {
    zofka = new Turtle();
    nakresliPrasatko();
  }

  public void nozickyJedna() {
    zofka.turnRight(70);
    zofka.move(30);

    zofka.turnLeft(180);
    zofka.move(30);

    zofka.turnRight(150);
    zofka.move(30);

    zofka.turnLeft(180);
    zofka.move(30);
  }

  public void nozickyDva() {
    zofka.turnRight(100);
    zofka.move(30);

    zofka.turnLeft(180);
    zofka.move(30);

    zofka.turnRight(150);
    zofka.move(30);
  }

    public void nakresliPrasatko() {
      for (int i = 0; i < 4; i++) {
        zofka.turnRight(90);
        zofka.move(100);
      }

      for (int i = 0; i < 2; i++) {
        zofka.turnLeft(120);
        zofka.move(100);
      }

      nozickyJedna();

      zofka.turnRight(110);
      zofka.move(100);

      nozickyDva();
  }

}
