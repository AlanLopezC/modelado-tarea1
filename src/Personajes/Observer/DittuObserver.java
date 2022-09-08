package Personajes.Observer;

import Personajes.Personaje;
import Personajes.Dittu.Dittu;

public class DittuObserver implements Observer {

    private Dittu dittu;

    public DittuObserver(Dittu dittu) {
        this.dittu = dittu;
        this.dittu.especialDittu();
    }

    @Override
    public Integer update(int value) {
        return dittu.damage(value);
    }

    @Override
    public Personaje getPersonaje() {
        return dittu;
    }

}
