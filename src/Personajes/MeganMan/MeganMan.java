package Personajes.MeganMan;

import Personajes.Personaje;
import Personajes.MeganMan.TiposMeganMan.MeganManNormal;

/**
 * Clase que nos permite usar todos los tipos de MeganMan,
 * aqui es donde se encuentra nuestro objeto de contexto para Strategy.
 */
public class MeganMan implements Personaje {

	/*
	 * Objeto de contexto.
	 * Comenzamos siendo un MeganMan Normal.
	 */
	private TipoMeganMan meganMan = new MeganManNormal();

	/**
	 * Metodo que cambia a nuestro objeto de contexto (MeganMan)
	 * al tipo que queramos de los definidos.
	 * 
	 * @param cambio Tipo de MeganMan por cual cambiaremos el actual.
	 * @return String Nos muestra las estadisticas de nuestro MeganMan transformado.
	 */
	public String adaptar(TipoMeganMan cambio) {
		meganMan = cambio;
		return "MeganMan ha tenido una transformacion: \n" + meganMan.mostrarEstadisticas();
	}

	/**
	 * Metodo que nos dice las estadisticas del tipo de MeganMan.
	 * 
	 * @return String con las estadisticas del personaje
	 *         (transformacion/empresa, nombre, vida, golpe,
	 *         patada,bloqueo).
	 */
	public String meganManStats() {
		return meganMan.mostrarEstadisticas();
	}

	/**
	 * Metodo que nos da el valor de la vida del personaje.
	 * 
	 * @return double con el valor de la vida del personaje.
	 */
	public double vidaMegaMan() {
		return meganMan.life();
	}

	/**
	 * Metodo que nos da el valor del golpe del personaje.
	 * 
	 * @return int con el valor del golpe del personaje.
	 */
	@Override
	public int golpe() {
		return meganMan.punch();
	}

	/**
	 * Metodo que nos da el nombre del personaje.
	 * 
	 * @return String con el nombre del personaje.
	 */
	@Override
	public String getNombre() {
		return "Meganman";
	}

	/**
	 * Metodo que nos da el valor de la patada del personaje.
	 * 
	 * @return double con el valor de la patada del personaje.
	 */
	public double patadaMeganMan() {
		return meganMan.kick();
	}

	/**
	 * Metodo que nos da el valor del bloqueo del personaje.
	 * 
	 * @return double con el valor del bloqueo del personaje.
	 */
	public double bloqueoMeganMan() {
		return meganMan.block();
	}

	/**
	 * Metodo que nos dice cual es su especial y modifica las estadisticas del
	 * personaje
	 * con base a su especial.
	 * 
	 * @return String con la descripcion de su especial.
	 */
	public String especialMeganMan() {
		return meganMan.hacerEspecial();
	}

	/**
	 * Metodo que reduce puntos de vida.
	 * 
	 * @param damage How many lifePoints to remove.
	 * @return int Returns remaining life points.
	 */
	public int damage(int damage) {
		return meganMan.damage(damage);
	}
}
