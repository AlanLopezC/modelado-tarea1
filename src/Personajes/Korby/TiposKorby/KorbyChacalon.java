package Personajes.Korby.TiposKorby;

import Personajes.Korby.TipoKorby;

/**
 * Clase que define al Korby Chacalon e
 * implementa la interfaz TipoKorby para poder ser intercambiable
 * en la clase Korby despues.
 */
public class KorbyChacalon implements TipoKorby {

	/* Informacion del personaje */
	private String nombre = "Korby Chacalon";
	private String transformacion = "Korby absorbe a un sujeto que planeaba asaltarlo. "
			+ "\nKorby ahora tiene un tubo.";
	private int vida = 18;
	private int golpe = 4;
	private int patada = 2;
	private int bloqueo = 0;
	private String especial = "Korby se pone un poco erizo: "
			+ "\n* golpe + 2 \n* patada + 1";

	/**
	 * Metodo para obtener el nombre de este tipo de Korby
	 * 
	 * @return String El nombre del Korby
	 */
	private String getNombre() {
		return nombre;
	}

	/**
	 * Metodo para obtener una descripcion de la
	 * transformacion de Korby.
	 * 
	 * @return String Transformacion
	 */
	private String getTransformacion() {
		return transformacion;
	}

	/**
	 * Metodo para obtener el valor de la vida de este tipo de
	 * Korby.
	 * 
	 * @return int la vida del Korby
	 */
	private int getVida() {
		return vida;
	}

	/**
	 * Metodo para obtener el valor del golpe de este tipo de
	 * Korby.
	 * 
	 * @return int el golpe del Korby
	 */
	private int getGolpe() {
		return golpe;
	}

	/**
	 * Metodo para obtener el valor de la patada de este tipo de
	 * Korby.
	 * 
	 * @return int la patada del Korby
	 */
	private int getPatada() {
		return patada;
	}

	/**
	 * Metodo para obtener el valor del bloqueo de este tipo de
	 * Korby.
	 * 
	 * @return int el bloqueo del Korby
	 */
	private int getBloqueo() {
		return bloqueo;
	}

	/**
	 * Metodo para obtener una descripcion del especial
	 * de este Korby
	 * 
	 * @return String Especial que hace este Korby.
	 */
	private String getEspecial() {
		return especial;
	}

	/**
	 * Metodo para establecer nuevos valores de las
	 * estadisticas de Korby dependiendo de su espcial
	 */
	private void setEspecial() {
		this.golpe += 2;
		this.patada += 1;
	}

	/**
	 * Metodo que nos dice las estadisticas del tipo de Korby.
	 * 
	 * @return String con las estadisticas del personaje
	 *         (transformacion/empresa, nombre, vida, golpe,
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
