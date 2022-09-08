package Personajes.Dittu.TiposDittu;

import Personajes.Dittu.TipoDittu;

/**
 * Clase que define al Dittu Normal e
 * implementa la interfaz TipoDittu para poder ser intercambiable
 * en la clase Dittu despues.
 */
public class DittuNormal implements TipoDittu {

	/* Informacion del personaje */
	private String nombre = "Dittu";
	private String tipo = "Chinpokomon";
	private int vida = 21;
	private int golpe = 1;
	private int patada = 1;
	private int bloqueo = 1;

	/**
	 * Metodo para obtener el nombre de este tipo de Dittu
	 * 
	 * @return String El nombre del Dittu
	 */
	private String getNombre() {
		return nombre;
	}

	/**
	 * Metodo para obtener el nombre del tipo personajes ficticios
	 * de a la que pertenece Dittu.
	 * 
	 * @return String El nombre del tipo del personaje
	 */
	private String getTipo() {
		return tipo;
	}

	/**
	 * Metodo para obtener el valor de la vida de este tipo de
	 * Dittu.
	 * 
	 * @return int la vida del Dittu
	 */
	private int getVida() {
		return vida;
	}

	/**
	 * Metodo para obtener el valor del golpe de este tipo de
	 * Dittu.
	 * 
	 * @return int el golpe del Dittu
	 */
	private int getGolpe() {
		return golpe;
	}

	/**
	 * Metodo para obtener el valor de la patada de este tipo de
	 * Dittu.
	 * 
	 * @return int la patada del Dittu
	 */
	private int getPatada() {
		return patada;
	}

	/**
	 * Metodo para obtener el valor del bloqueo de este tipo de
	 * Dittu.
	 * 
	 * @return int el bloqueo del Dittu
	 */
	private int getBloqueo() {
		return bloqueo;
	}

	/**
	 * Metodo que nos dice las estadisticas del tipo de Dittu.
	 * 
	 * @return String con las estadisticas del personaje
	 *         (transformacion/tipo, nombre, vida, golpe,
	 *         patada,bloqueo).
	 */
	@Override
	public String mostrarEstadisticas() {
		return "Nombre: " + getNombre()
				+ "\nTipo: " + getTipo()
				+ "\nVida: " + getVida()
				+ "\nGolpe: " + getGolpe()
				+ "\nPatada: " + getPatada()
				+ "\nBloqueo: " + getBloqueo();
	}

	/**
	 * Metodo que nos da el valor de la vida del personaje.
	 * 
	 * @return int con el valor de la vida del personaje.
	 */
	@Override
	public int life() {
		return getVida();
	}

	/**
	 * Metodo que nos da el valor del golpe del personaje.
	 * 
	 * @return int con el valor del golpe del personaje.
	 */
	@Override
	public int punch() {
		return getGolpe();
	}

	/**
	 * Metodo que nos da el valor de la patada del personaje.
	 * 
	 * @return int con el valor de la patada del personaje.
	 */
	@Override
	public int kick() {
		return getPatada();
	}

	/**
	 * Metodo que nos da el valor del bloqueo del personaje.
	 * 
	 * @return int con el valor del bloqueo del personaje.
	 */
	@Override
	public int block() {
		return getBloqueo();
	}

	/**
	 * Metodo que nos dice cual es su especial y modifica las estadisticas del
	 * personaje
	 * con base a su especial.
	 * 
	 * @return String con la descripcion de su especial.
	 */
	@Override
	public String hacerEspecial() {
		return "Dittu no tiene ningun especial por el momento :(";
	}

	@Override
	/**
	 * Metodo que reduce puntos de vida.
	 * 
	 * @param damage How many lifePoints to remove.
	 * @return int Returns remaining life points.
	 */
	public int damage(int damage) {
		vida -= damage;
		return life();
	}

}
