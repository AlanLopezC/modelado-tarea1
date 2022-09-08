import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Batallas.Batalla;
import Batallas.Batalla1;

public class Programa {
    private static final int NUM_ESPECTADORES = 4;
    private static final ArrayList<Espectador> espectadores = new ArrayList<Espectador>();
    private static final String luchadores[] = { "Korby", "Meganman", "Dittu" };
    private static final Random random = new Random();

    private static Batalla batalla1 = new Batalla1();

    public static void main(String[] args) {
        esperarInput();

        crearEspectadores(NUM_ESPECTADORES);

        final Batalla batalla = seleccionarBatalla();
        batalla.simulation();

        // Outputs personalizados
        for (Integer i = 0; i < NUM_ESPECTADORES; i++) {
            final Espectador espectador = espectadores.get(i);
            final boolean hasWon = batalla.getGanador().compareTo(espectador.getPreferencia()) == 0;

            final String filePath = "espectador" + ((Integer) (i + 1)).toString() + ".txt";

            createFile(filePath);
            writeToFile(filePath, espectador, batalla, hasWon);
        }

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
     * Crea espectadores de manera al azar.
     * 
     * @param numEspectadores es la cantidad de espectadores que se desean crear.
     */
    private static void crearEspectadores(int numEspectadores) {
        for (Integer i = 0; i < numEspectadores; i++) {
            final String luchador = luchadores[random.nextInt(luchadores.length)];
            final Espectador nuevoEspectador = new Espectador(i + 1, luchador);
            espectadores.add(nuevoEspectador);
        }
    }

    /**
     * Selecciona una batalla preestablecida al azar.
     * 
     * @return Batalla Regresa la batalla seleccionada.
     */
    private static Batalla seleccionarBatalla() {
        return batalla1;
        // return batallas[random.nextInt(batallas.length)];
    }

    /**
     * Creates a File in the given route.
     * 
     * @param filePath Route of the file you want to create.
     * @exception IOException On input error.
     */
    private static void createFile(String filePath) {
        try {
            File newFile = new File(filePath);
            if (newFile.createNewFile()) {
                System.out.println("File created: " + newFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    /**
     * Writes in a File of the given route.
     * 
     * @param filePath   Route of the file you want to create.
     * @param espectador Viewer of the given file.
     * @param batalla    Battle choosen randomly.
     * @param hasWon     Variable that states if the preferred fighter has won.
     * @exception IOException On input error.
     */
    private static void writeToFile(String filePath, Espectador espectador, Batalla batalla, boolean hasWon) {
        try {
            FileWriter myWriter = new FileWriter(filePath);

            // Special greeting
            myWriter.write("Hola Espectador" + espectador.getId());
            myWriter.write("Tu luchador estrella es:" + espectador.getPreferencia());

            myWriter.write("\nLa batalla comienza...");
            myWriter.write(batalla.getBattleLog());

            // Costum ending
            if (hasWon) {
                myWriter.write("Felicidades!!!! Tu luchador \"" + espectador.getPreferencia() + "\" ha ganado.");
            } else {
                myWriter.write("Lo sentimos!!!! Tu luchador \"" + espectador.getPreferencia() + "\" ha perdido.");
            }

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
