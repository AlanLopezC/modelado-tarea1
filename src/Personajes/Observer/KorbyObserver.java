package Personajes.Observer;

import Personajes.Personaje;
import Personajes.Korby.Korby;

public class KorbyObserver implements Observer {
    private Korby korby;

    public KorbyObserver(Korby korby) {
        this.korby = korby;
        this.korby.especialKorby();
    }

    @Override
    public Integer update(int value) {
        return korby.damage(value);
    }

    @Override
    public Personaje getPersonaje() {
        return korby;
    }
}
