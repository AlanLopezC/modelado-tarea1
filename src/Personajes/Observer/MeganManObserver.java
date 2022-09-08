package Personajes.Observer;

import Personajes.Personaje;
import Personajes.MeganMan.MeganMan;

public class MeganManObserver implements Observer {
    private MeganMan meganman;

    public MeganManObserver(MeganMan subject) {
        this.meganman = subject;
        this.meganman.especialMeganMan();
    }

    @Override
    public Integer update(int value) {
        return meganman.damage(value);
    }

    @Override
    public Personaje getPersonaje() {
        return meganman;
    }
}
