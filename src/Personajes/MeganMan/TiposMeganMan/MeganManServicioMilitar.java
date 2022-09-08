package Personajes.MeganMan.TiposMeganMan;

import Personajes.MeganMan.TipoMeganMan;

/**
 * Clase que define al MeganMan Servicio Militar e
 * implementa la interfaz TipoMeganMan para poder ser intercambiable
 * en la clase MeganMan despues.
 */
public class MeganManServicioMilitar implements TipoMeganMan {

	/* Informacion del personaje */
	private String nombre = "MeganMan Servicio Militar";
	private String transformacion = "MeganMan adapta a un robot al cual le salió bola negra."
			+ "\nMeganMan ahora porta una playera del SMN y tiene que asistir los sabados.";
	private int vida = 15;
	private int golpe = 1;
	private int patada = 2;
	private int bloqueo = 1;
	private String especial = "MeganMan lleva un mes asistiendo al SMN: "
			+ "\n* golpe + 2.5 \n* patada + 2.5 \n* bloqueo + 2.5";

	/**
	 * Metodo para obtener el nombre de este tipo de MeganMan
	 * 
	 * @return String El nombre del MeganMan
	 */
	private String getNombre() {
		return nombre;
	}

	/**
	 * Metodo para obtener una descripcion de la
	 * transformacion del MeganMan.
	 * 
	 * @return String Transformacion
	 */
	private String getTransformacion() {
		return transformacion;
	}

	/**
	 * Metodo para obtener el valor de la vida de este tipo de
	 * MeganMan.
	 * 
	 * @return int la vida del MeganMan
	 */
	private int getVida() {
		return vida;
	}

	/**
	 * Metodo para obtener el valor del golpe de este tipo de
	 * MeganMan.
	 * 
	 * @return int el golpe del MeganMan
	 */
	private int getGolpe() {
		return golpe;
	}

	/**
	 * Metodo para obtener el valor de la patada de este tipo de
	 * MeganMan.
	 * 
	 * @return int la patada del MeganMan
	 */
	private int getPatada() {
		return patada;
	}

	/**
	 * Metodo para obtener el valor del bloqueo de este tipo de
	 * MeganMan.
	 * 
	 * @return int el bloqueo del MeganMan
	 */
	private int getBloqueo() {
		return bloqueo;
	}

	/**
	 * Metodo para obtener una descripcion del especial
	 * de este MeganMan
	 * 
	 * @return String Especial que hace este MeganMan.
	 */
	private String getEspecial() {
		return especial;
	}

	/**
	 * Metodo para establecer nuevos valores de las
	 * estadisticas de MeganMan dependiendo de su espcial
	 */
	private void setEspecial() {
		this.golpe += 2.5;
		this.patada += 2.5;
		this.bloqueo += 2.5;
	}

	/**
	 * Metodo que nos dice las estadisticas del tipo de MeganMan.
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
