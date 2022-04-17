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

        zofka.setLocation(60, 60);

        nakresliSlunicko (zofka);

        zofka.setLocation(80, 600);

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

        nakresliPrasatko(zofka);








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
