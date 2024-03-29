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
    nakresliDomecek();
    nakresliJmeno();
  }

  // nozicky
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

  // prasatko
  public void nozickyDva() {
    zofka.turnRight(100);
    zofka.move(30);

    zofka.turnLeft(180);
    zofka.move(30);

    zofka.turnRight(150);
    zofka.move(30);
  }


  // obrazce
  public void ctverecek() {
    for (int i = 0; i < 4; i++) {
      zofka.turnRight(90);
      zofka.move(100);
    }
  }

  public void strecha() {
    for (int i = 0; i < 2; i++) {
      zofka.turnLeft(120);
      zofka.move(100);
    }
  }

  public void slunicko() {
    for (int i = 0; i < 5; i++) {
      zofka.move(15);
      zofka.turnRight(30);
      zofka.turnLeft(90);
      zofka.move(10);
      zofka.turnRight(180);
      zofka.move(10);
      zofka.turnLeft(45);
      zofka.move(5);
    }
  }

    /* zkouseka obrazcu
  public void slunicko() {
    for (int i = 0; i < 20; i++) {
      zofka.move(5);
      zofka.turnRight(20);
      zofka.move(5);
    }
    mezera();
  }

  public void slunickoDva() {
    for (int i = 0; i < 20; i++) {
      zofka.move(10);
      zofka.turnRight(30);
      zofka.move(10);
    }
  }
   */

  // mezery
  public void mezeraVLevo() {
    zofka.penUp();
    zofka.turnLeft(160);
    zofka.turnLeft(90);
    zofka.move(300);
    zofka.turnRight(180);
    zofka.penDown();
  }

  public void mezeraNahoru() {
    zofka.penUp();
    zofka.turnRight(150);
    zofka.move(250);
    zofka.turnRight(90);
    zofka.move(80);
    zofka.penDown();
  }

  public void mezeraMezeDomecky() {
    zofka.turnLeft(120);
    zofka.penUp();
    zofka.move(250);
    zofka.penDown();
  }

  public void mezeraDolu() {
    zofka.penUp();
    zofka.turnLeft(30);
    zofka.move(250);
    zofka.turnLeft(90);
    zofka.move(50);
    zofka.penDown();
  }

  public void mezeraSlunce() {
    zofka.penUp();
    zofka.turnRight(100);
    zofka.move(550);
    zofka.penDown();
  }

  public void mezeraJmeno() {
    zofka.penUp();
    zofka.turnLeft(150);
    zofka.move(500);
    zofka.penDown();
    zofka.turnLeft(90);
  }

  // prasatko
  public void nakresliPrasatko() {
    ctverecek();
    strecha();

    nozickyJedna();

    zofka.turnRight(110);
    zofka.move(100);

    nozickyDva();

    mezeraVLevo();
  }

    // domecky a slunicko
    public void nakresliDomecek() {
      ctverecek();
      strecha();

      mezeraNahoru();

      ctverecek();
      strecha();

      for (int i = 0; i < 4; i++) {
        mezeraMezeDomecky();
        ctverecek();
        strecha();
      }

      mezeraDolu();
      ctverecek();
      strecha();

      mezeraSlunce();
      slunicko();
      mezeraJmeno();
    }

    // pismena

  public void nakresliS() {
    for (int i = 0; i < 2; i++) {
      zofka.move(30);
      zofka.turnLeft(90);
    }

    zofka.move(30);

    for (int i = 0; i < 2; i++) {
      zofka.turnRight(90);
      zofka.move(30);
    }

    zofka.penUp();
    zofka.turnRight(90);
    zofka.move(60);
    zofka.turnLeft(90);
    zofka.move(30);
    zofka.penDown();
  }

  public void nakresliA() {
    zofka.turnLeft(70);
    zofka.move(60);
    zofka.turnRight(140);
    zofka.move(60);
    zofka.turnLeft(180);
    zofka.move(30);
    zofka.turnLeft(60);
    zofka.move(20);
    zofka.turnLeft(180);
    zofka.move(20);
    zofka.turnRight(65);
    zofka.move(30);

    zofka.penUp();
    zofka.turnRight(20);
    zofka.turnLeft(90);
    zofka.move(30);
    zofka.penDown();
  }

  public void nakresliK() {
    zofka.turnLeft(90);
    zofka.move(60);
    zofka.turnRight(180);
    zofka.move(30);
    zofka.turnLeft(120);
    zofka.move(30);
    zofka.turnLeft(180);
    zofka.move(30);
    zofka.turnLeft(110);
    zofka.move(40);

    zofka.penUp();
    zofka.turnRight(50);
    zofka.turnLeft(90);
    zofka.move(30);
    zofka.penDown();
  }

  public void nakresliR() {
    zofka.turnLeft(90);
    zofka.move(60);

    for (int i = 0; i < 3; i++) {
      zofka.turnRight(90);
      zofka.move(30);
    }

    zofka.turnLeft(120);
    zofka.move(30);

    zofka.penUp();
    zofka.turnRight(30);
    zofka.turnLeft(90);
    zofka.move(30);
    zofka.penDown();
  }

  // jmeno
    public void nakresliJmeno() {
    nakresliS();
    nakresliA();
    nakresliR();
    nakresliK();
    nakresliA();
    }

  }

