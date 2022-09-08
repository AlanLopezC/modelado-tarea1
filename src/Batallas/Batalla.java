package Batallas;

import Personajes.Observer.Observer;

public interface Batalla {

    /**
     * addObserver método que registra observers en Batalla
     * 
     * @param o
     */
    public void addObserver(Observer o);

    /**
     * removeObserver método para de-subscribirse de oBatalla
     * 
     * @param o
     */
    public void removeObserver(Observer o);

    /**
     * notifyObserver método que actualiza los observers
     * 
     * @param o
     * @param lifePoints Remove lifePoints
     */
    public void notifyObserver(Observer o, int lifePoints);

    public String getGanador();

    public String getBattleLog();

    /**
     * Simulates a battle until only 1 is standing.
     * All changes are recorded in battleLog.
     */
    public void simulation();

}