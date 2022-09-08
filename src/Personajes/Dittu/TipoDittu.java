package Personajes.Dittu;

/**
 * Clase que se encarga de definir una interfaz
 * para implementar strategy con los tipos de Dittu.
 */
public interface TipoDittu {

    /**
     * Metodo que nos dice las estadisticas del tipo de Dittu.
     * 
     * @return String con las estadisticas del personaje
     *         (transformacion/tipo, nombre, vida, golpe,
     *         patada,bloqueo).
     */
    public String mostrarEstadisticas();

    /**
     * Metodo que nos da el valor de la vida del personaje.
     * 
     * @return int con el valor de la vida del personaje.
     */
    public int life();

    /**
     * Metodo que nos da el valor del golpe del personaje.
     * 
     * @return int con el valor del golpe del personaje.
     */
    public int punch();

    /**
     * Metodo que nos da el valor de la patada del personaje.
     * 
     * @return int con el valor de la patada del personaje.
     */
    public int kick();

    /**
     * Metodo que nos da el valor del bloqueo del personaje.
     * 
     * @return int con el valor del bloqueo del personaje.
     */
    public int block();

    /**
     * Metodo que nos dice cual es su especial y modifica las estadisticas del
     * personaje
     * con base a su especial.
     * 
     * @return String con la descripcion de su especial.
     */
    public String hacerEspecial();

    /**
     * Metodo que reduce puntos de vida.
     * 
     * @param damage How many lifePoints to remove.
     * @return int Returns remaining life points.
     */
    public int damage(int damage);
}
