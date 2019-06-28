package ro.itschool.curs8.LaCurs;

import ro.itschool.curs8.LaCurs.Animals;

public abstract class Pet implements Animals {

    @Override
    public void eat(String food) {
            food="oase";
        System.out.println("Pets eat" + food);
    }

}
