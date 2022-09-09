package Personajes.Korby;

import Personajes.Personaje;
import Personajes.Korby.TiposKorby.KorbyNormal;

/**
 * Clase que nos permite usar todos los tipos de Korby,
 * aqui es donde se encuentra nuestro objeto de contexto para Strategy.
 */
public class Korby implements Personaje {

	/*
	 * Objeto de contexto.
	 * Comenzamos siendo un Korby Normal.
	 */
	private TipoKorby korby = new KorbyNormal();

	/**
	 * Metodo que cambia a nuestro objeto de contexto (Korby)
	 * al tipo que queramos de los definidos.
	 * 
	 * @param nuevoLook Tipo de Korby por cual cambiaremos el actual.
	 * @return String Nos muestra las estadisticas de nuestro Korby transformado.
	 */
	public String absorber(TipoKorby nuevoLook) {
		korby = nuevoLook;
		return "Korby ha tenido una transformacion: \n" + korby.mostrarEstadisticas();
	}

	/**
	 * Metodo que nos dice las estadisticas del tipo de Korby.
	 * 
	 * @return String con las estadisticas del personaje
	 *         (transformacion/empresa, nombre, vida, golpe,
	 *         patada,bloqueo).
	 */
	public String korbyStats() {
		return korby.mostrarEstadisticas();
	}

	/**
	 * Metodo que nos da el valor de la vida del personaje.
	 * 
	 * @return int con el valor de la vida del personaje.
	 */
	@Override
	public int getVida() {
		return korby.life();
	}

	/**
	 * Metodo que nos da el valor del golpe del personaje.
	 * 
	 * @return int con el valor del golpe del personaje.
	 */
	@Override
	public int golpe() {
		return korby.punch();
	}

	/**
	 * Metodo que nos da el nombre del personaje.
	 * 
	 * @return String con el nombre del personaje.
	 */
	@Override
	public String getNombre() {
		return "Korby";
	}

	/**
	 * Metodo que nos da el valor de la patada del personaje.
	 * 
	 * @return int con el valor de la patada del personaje.
	 */
	public int patadaKorby() {
		return korby.kick();
	}

	/**
	 * Metodo que nos da el valor del bloqueo del personaje.
	 * 
	 * @return int con el valor del bloqueo del personaje.
	 */
	public int bloqueoKorby() {
		return korby.block();
	}

	/**
	 * Metodo que nos dice cual es su especial y modifica las estadisticas del
	 * personaje
	 * con base a su especial.
	 * 
	 * @return String con la descripcion de su especial.
	 */
	public String especialKorby() {
		return korby.hacerEspecial();
	}

	/**
	 * Metodo que reduce puntos de vida.
	 * 
	 * @param damage How many lifePoints to remove.
	 * @return int Returns remaining life points.
	 */
	@Override
	public int damage(int damage) {
		return korby.damage(damage);
	}

	@Override
	public void atack(Personaje target) {
		target.damage(this.golpe());
	}

}
