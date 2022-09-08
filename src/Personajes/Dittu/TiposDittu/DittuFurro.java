package Personajes.Dittu.TiposDittu;

import Personajes.Dittu.TipoDittu;

/**
 * Clase que define al Dittu Furro e
 * implementa la interfaz TipoDittu para poder ser intercambiable
 * en la clase Dittu despues.
 */
public class DittuFurro implements TipoDittu {

	/* Informacion del personaje */
	private String nombre = "Dittu Furro";
	private String transformacion = "Dittu confunde a un furro con un animal y lo copia."
			+ "\nDittu ahora dice 'MIAU', lleva unas orejas de gato y cola.";
	private int vida = 21;
	private int golpe = 4;
	private int patada = 6;
	private int bloqueo = 2;
	private String especial = "Dittu no se ha bañado por una semana: "
			+ "\n* golpe - 0.5 \n* patada - 1 \n* bloqueo + 1";

	/**
	 * Metodo para obtener el nombre de este tipo de Dittu
	 * 
	 * @return String El nombre del Dittu
	 */
	private String getNombre() {
		return nombre;
	}

	/**
	 * Metodo para obtener una descripcion de la
	 * transformacion del Dittu.
	 * 
	 * @return String Transformacion
	 */
	private String getTransformacion() {
		return transformacion;
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
	 * Metodo para obtener una descripcion del especial
	 * de este Dittu
	 * 
	 * @return String Especial que hace este Dittu.
	 */
	private String getEspecial() {
		return especial;
	}

	/**
	 * Metodo para establecer nuevos valores de las
	 * estadisticas de Dittu dependiendo de su espcial
	 */
	private void setEspecial() {
		this.golpe -= 0.5;
		this.patada -= 1;
		this.bloqueo += 1;
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
		return "Transformacion: " + getTransformacion()
				+ "\nNombre: " + getNombre()
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
		setEspecial();
		return getEspecial();
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
