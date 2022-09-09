
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import Personajes.Personaje;
import Personajes.Dittu.Dittu;
import Personajes.Korby.Korby;
import Personajes.MeganMan.MeganMan;

public class Batalla {
    final private ArrayList<Personaje> fighters = new ArrayList<Personaje>(
            Arrays.asList(new Korby(), new Dittu(),
                    new MeganMan()));

    private String ganador;
    private String battleLog = "";

    /**
     * Simulates a battle until only 1 is standing.
     * All changes are recorded in battleLog.
     * 
     * 
     * They will atack by turns to other players randomly until 1 remains.
     * We will always use punch for this simulation.
     */
    public void simulation() {
        int turn = 0;
        while (fighters.size() != 1) {
            // pick fighter
            final int atackerIndex = turn % fighters.size();
            final Personaje atacker = fighters.get(atackerIndex);

            // pick target
            int targetIndex = atackerIndex;
            while (targetIndex == atackerIndex) {
                targetIndex = new Random().nextInt(fighters.size());
            }
            final Personaje target = fighters.get(targetIndex);

            realizarAtaque(target, atacker);

            turn += 1;
        }
        ganador = fighters.get(0).getNombre();
    }

    /**
     * Registers event in battleLog.
     * 
     * @param target  Personaje which receives the atack.
     * @param atacker Personaje which sends the punch.
     */
    private void realizarAtaque(Personaje target, Personaje atacker) {
        final String message = atacker.getNombre() + " ataca a: " + target.getNombre()
                + "\nLa vida restante de " + target.getNombre() + " es: "
                + ((Integer) (target.getVida() - atacker.golpe())).toString();
        addToLog(message);

        atacker.atack(target);

        final int remiainingLife = target.getVida();
        if (remiainingLife <= 0) {
            fighters.remove(target);
            logDied(target);
        }
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
    private void logDied(Personaje fighter) {
        addToLog(fighter.getNombre() + " just died.\n");
    }

    public String getGanador() {
        return ganador;
    }

    public String getBattleLog() {
        return battleLog;
    }

}
