
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Observer.Espectador;
import Observer.Observer;

public class PlataformaBatalla implements Subject {
    private static final int NUM_ESPECTADORES = 4;
    private static final ArrayList<Observer> observers = new ArrayList<Observer>();
    private static final String luchadores[] = { "Korby", "Meganman", "Dittu" };
    private static final Random random = new Random();

    private static Batalla batalla = new Batalla();

    public static void main(String[] args) {
        esperarInput();

        crearEspectadores(NUM_ESPECTADORES);

        batalla.simulation();

        notifyObservers(batalla);

        System.out.println("El programa ha concluido");
    }

    /**
     * Espera input para iniciar programa.
     */
    private static void esperarInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Presione cualquier tecla para comenzar el programa.");

        scanner.nextLine();
        System.out.println("El programa ha iniciado");
        scanner.close();
    }

    /**
     * Crea observers de manera al azar.
     * 
     * @param numEspectadores es la cantidad de observers que se desean crear.
     */
    private static void crearEspectadores(int numEspectadores) {
        for (Integer i = 0; i < numEspectadores; i++) {
            final String luchador = luchadores[random.nextInt(luchadores.length)];
            final Espectador nuevoEspectador = new Espectador(i + 1, luchador);
            addObserver(nuevoEspectador);
        }
    }

    public static void addObserver(Observer o) {
        observers.add(o);
    }

    public static void removeObserver(Observer o) {
        observers.remove(o);
    }

    public static void notifyObservers(Batalla batalla) {
        for (Observer observer : observers) {
            observer.update(batalla.getBattleLog(), batalla.getGanador());
        }
    }

}
