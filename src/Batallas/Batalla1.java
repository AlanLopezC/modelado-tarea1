package Batallas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import Personajes.Dittu.Dittu;
import Personajes.Korby.Korby;
import Personajes.MeganMan.MeganMan;
import Personajes.Observer.DittuObserver;
import Personajes.Observer.KorbyObserver;
import Personajes.Observer.MeganManObserver;
import Personajes.Observer.Observer;

public class Batalla1 implements Batalla {
    final private ArrayList<Observer> observers = new ArrayList<Observer>(
            Arrays.asList(new KorbyObserver(new Korby()), new DittuObserver(new Dittu()),
                    new MeganManObserver(new MeganMan())));

    private String ganador;
    private String battleLog;

    /**
     * Simulates a battle until only 1 is standing.
     * All changes are recorded in battleLog.
     * 
     * 
     * They will atack by turns to other players randomly until 1 remains.
     * We will always use punch for this simulation.
     */
    @Override
    public void simulation() {
        int turn = 0;
        while (observers.size() != 1) {
            // pick fighter
            final int atackerIndex = turn % observers.size();
            final Observer atacker = observers.get(atackerIndex);

            // pick target
            int targetIndex = atackerIndex;
            while (targetIndex == atackerIndex) {
                targetIndex = new Random().nextInt(observers.size());
            }
            final Observer target = observers.get(targetIndex);

            realizarAtaque(target, atacker);

            turn += 1;
        }
        ganador = observers.get(0).getPersonaje().getNombre();
    }

    /**
     * Registers event in battleLog.
     * 
     * @param target  Observer which receives the atack.
     * @param atacker Observer which sends the punch.
     */
    private void realizarAtaque(Observer target, Observer atacker) {
        final String message = atacker.getPersonaje().getNombre() + " ataca a: " + target.getPersonaje().getNombre()
                + "\nLa vida restante de " + target.getPersonaje().getNombre() + " es: "
                + ((Integer) (target.update(0) - atacker.getPersonaje().golpe())).toString();
        addToLog(message);
        notifyObserver(target, atacker.getPersonaje().golpe());
    }

    /**
     * Registers event in battleLog.
     * 
     * @param s Message to register.
     */
    private void addToLog(String s) {
        battleLog += "\n ****************************\n";
        battleLog += s;
    }

    /**
     * Registers event in battleLog.
     * 
     * @param s Message to register.
     */
    private void logDied(Observer o) {
        addToLog(o.getPersonaje().getNombre() + " just died.\n");
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    /**
     * Notifiers observer and if life <= 0, means is dead, so we remove it from our
     * observers.
     */
    @Override
    public void notifyObserver(Observer o, int lifePoints) {
        final int remiainingLife = o.update(lifePoints);
        if (remiainingLife <= 0) {
            observers.remove(o);
            logDied(o);
        }
    }

    @Override
    public String getGanador() {
        return ganador;
    }

    @Override
    public String getBattleLog() {
        return battleLog;
    }

}
