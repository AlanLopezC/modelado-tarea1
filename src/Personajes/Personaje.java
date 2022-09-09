package Personajes;

public interface Personaje {
    public int golpe();

    public String getNombre();

    public int getVida();

    // Reduce vida y regresa vida restante
    public int damage(int i);

    public void atack(Personaje target);

}
