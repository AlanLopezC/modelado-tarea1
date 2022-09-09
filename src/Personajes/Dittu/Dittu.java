package Personajes.Dittu;

import Personajes.Personaje;
import Personajes.Dittu.TiposDittu.DittuNormal;

/**
 * Clase que nos permite usar todos los tipos de Dittus,
 * aqui es donde se encuentra nuestro objeto de contexto para Strategy.
 */
public class Dittu implements Personaje {

	/*
	 * Objeto de contexto.
	 * Comenzamos siendo un Dittu Normal.
	 */
	private TipoDittu dittu = new DittuNormal();

	/**
	 * Metodo que cambia a nuestro objeto de contexto (Dittu)
	 * al tipo que queramos de los definidos.
	 * 
	 * @param cambio Tipo de Dittu por cual cambiaremos el actual.
	 * @return String Nos muestra las estadisticas de nuestro Dittu transformado.
	 */
	public String copiar(TipoDittu copia) {
		dittu = copia;
		return "Dittu ha tenido una transformacion: \n" + dittu.mostrarEstadisticas();
	}

	/**
	 * Metodo que nos dice las estadisticas del tipo de Dittu.
	 * 
	 * @return String con las estadisticas del personaje
	 *         (transformacion/tipo, nombre, vida, golpe,
	 *         patada,bloqueo).
	 */
	public String dittuStats() {
		return dittu.mostrarEstadisticas();
	}

	/**
	 * Metodo que nos da el valor de la vida del personaje.
	 * 
	 * @return int con el valor de la vida del personaje.
	 */
	@Override
	public int getVida() {
		return dittu.life();
	}

	/**
	 * Metodo que nos da el valor del golpe del personaje.
	 * 
	 * @return int con el valor del golpe del personaje.
	 */
	@Override
	public int golpe() {
		return dittu.punch();
	}

	/**
	 * Metodo que nos da el nombre del personaje.
	 * 
	 * @return String con el nombre del personaje.
	 */
	@Override
	public String getNombre() {
		return "Dittu";
	}

	/**
	 * Metodo que nos da el valor de la patada del personaje.
	 * 
	 * @return int con el valor de la patada del personaje.
	 */
	public int patadaDittu() {
		return dittu.kick();
	}

	/**
	 * Metodo que nos da el valor del bloqueo del personaje.
	 * 
	 * @return int con el valor del bloqueo del personaje.
	 */
	public int bloqueoDittu() {
		return dittu.block();
	}

	/**
	 * Metodo que nos dice cual es su especial y modifica las estadisticas del
	 * personaje
	 * con base a su especial.
	 * 
	 * @return String con la descripcion de su especial.
	 */
	public String especialDittu() {
		return dittu.hacerEspecial();
	}

	/**
	 * Metodo que reduce puntos de vida.
	 * 
	 * @param damage How many lifePoints to remove.
	 * @return int Returns remaining life points.
	 */
	public int damage(int damage) {
		return dittu.damage(damage);
	}

	@Override
	public void atack(Personaje target) {
		target.damage(this.golpe());
	}

}
