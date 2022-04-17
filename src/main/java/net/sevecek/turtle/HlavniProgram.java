package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();

        //nakresliOsmiuhelnik(zofka);

        //zofka.setLocation(300, 100);

        //nakresliKruznici(zofka);

        zofka.setLocation(60, 60);

        zofka.setPenColor(Color.YELLOW);

        nakresliSlunicko (zofka);

        zofka.setLocation(80, 600);

        zofka.setPenColor(Color.ORANGE);

        nakresliDomecek(zofka);

        zofka.setLocation (80, 350);

        nakresliDomecek(zofka);

        zofka.setLocation(300, 350);

        nakresliDomecek(zofka);

        zofka.setLocation(520, 350);

        nakresliDomecek(zofka);

        zofka.setLocation(740, 350);

        nakresliDomecek(zofka);

        zofka.setLocation(740, 600);

        nakresliDomecek(zofka);

        zofka.setLocation(370, 500);

        zofka.setPenColor(Color.PINK);

        nakresliPrasatko(zofka);

        zofka.setLocation(350, 100);

        zofka.setPenColor(Color.CYAN);

        nakresliE(zofka);

        zofka.setLocation(400, 100);

        nakresliL(zofka);

        zofka.setLocation(450, 100);

        nakresliI(zofka);

        zofka.setLocation(470, 100);

        nakresliN(zofka);

        zofka.setLocation(540,100);

        nakresliA(zofka);


    }

    private void nakresliA(Turtle zofka) {
        zofka.turnRight(30);
        zofka.move(90);
        zofka.turnRight(120);
        zofka.move(90);
        zofka.turnLeft(180);
        zofka.move(45);
        zofka.turnLeft(60);
        zofka.move(50);
        zofka.turnRight(180);
        zofka.move(50);
        zofka.turnRight(60);
        zofka.move(45);
        zofka.turnLeft(150);
    }

    private void nakresliN(Turtle zofka) {
        zofka.move(70);
        zofka.turnRight(135);
        zofka.move(90);
        zofka.turnLeft(135);
        zofka.move(70);
        zofka.turnLeft(180);
        zofka.move(70);
        zofka.turnLeft(180);
    }

    private void nakresliI(Turtle zofka) {
        zofka.move(70);
        zofka.turnLeft(180);
        zofka.move(70);
        zofka.turnLeft(180);
    }

    private void nakresliL(Turtle zofka) {
        zofka.move(70);
        zofka.turnLeft(180);
        zofka.move(70);
        zofka.turnLeft(90);
        zofka.move(35);
        zofka.turnLeft(90);
    }

    private void nakresliE(Turtle zofka) {
        zofka.turnLeft(135);
        zofka.move(70);
        zofka.turnRight(90);
        zofka.move(35);
        zofka.turnLeft(180);
        zofka.move(35);
        zofka.turnLeft(90);
        zofka.move(35);
        zofka.turnLeft(90);
        zofka.move(35);
        zofka.turnLeft(180);
        zofka.move(35);
        zofka.turnLeft(90);
        zofka.move(35);
        zofka.turnLeft(90);
        zofka.move(35);
        zofka.turnLeft(90);
    }

    private void nakresliDomecek(Turtle zofka) {
        for(int i = 0; i < 5; i++) {
            zofka.move(120);
            zofka.turnRight(90);
        }
        zofka.turnLeft(45);
        zofka.move(90);
        zofka.turnRight(90);
        zofka.move(90);
        zofka.turnLeft(135);
    }

    private void nakresliSlunicko(Turtle zofka) {
        nakresliKruznici(zofka);

        for (int i = 0; i < 18; i++) {
            zofka.turnLeft(90);
            zofka.move(40);
            zofka.turnLeft(180);
            zofka.move(40);
            zofka.turnLeft(70);
            zofka.move(20);
        }
    }

    private void nakresliKruznici(Turtle zofka) {
        for(int i = 0; i < 18; i++) {
            zofka.turnRight(20);
            zofka.move(20);

        }
    }

    private void nakresliOsmiuhelnik(Turtle zofka) {
        zofka.turnLeft(45);
        zofka.move(50);
        for (int i = 0; i < 7; i++) {
            zofka.turnRight(45);
            zofka.move(60);
        }
    }

    private void nakresliPrasatko(Turtle zofka) {
        zofka.move(110);
        zofka.turnRight(90);
        zofka.move(130);
        zofka.turnRight(90);
        zofka.move(110);
        zofka.turnRight(90);
        zofka.move(130);
        zofka.turnRight(45);
        zofka.move(80);
        zofka.turnRight(90);
        zofka.move(80);
        zofka.turnLeft(225);
        zofka.move(110);
        zofka.turnRight(45);
        zofka.move(60);
        zofka.turnRight(180);
        zofka.move(60);
        zofka.turnRight(90);
        zofka.move(60);
        zofka.turnRight(180);
        zofka.move(60);
        zofka.turnRight(135);
        zofka.move(130);
        zofka.turnRight(45);
        zofka.move(60);
        zofka.turnRight(180);
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.move(60);
        zofka.turnRight(180);
        zofka.move(60);
        zofka.turnLeft(45);
        zofka.move(55);
        zofka.turnRight(90);
        zofka.move(20);
        zofka.turnLeft(45);
        zofka.move(20);
        zofka.turnRight(90);
        zofka.move(20);
    }

}
