package Personajes.Observer;

import Personajes.Personaje;

public interface Observer {
    public Personaje getPersonaje();

    public abstract Integer update(int value);
}
