package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();

        //nakresliPrasatko(zofka);

        //zofka.setLocation(200,350);

        //nakresliOsmiuhelnik(zofka);

        //zofka.setLocation(300, 100);

        //nakresliKruznici(zofka);

        zofka.setLocation(90, 90);

        nakresliSlunicko (zofka);


    }

    private void nakresliSlunicko(Turtle zofka) {
        nakresliKruznici(zofka);

        for (int i = 0; i < 18; i++) {
            zofka.turnLeft(90);
            zofka.move(40);
            zofka.turnLeft(180);
            zofka.move(40);
            zofka.turnLeft(70);
            zofka.move(30);
        }
    }

    private void nakresliKruznici(Turtle zofka) {
        for(int i = 0; i < 18; i++) {
            zofka.turnRight(20);
            zofka.move(30);

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
