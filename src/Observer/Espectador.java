package Observer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Espectador implements Observer {
    private Integer id;
    private String preferencia;

    public Espectador(Integer id, String preferencia) {
        this.id = id;
        this.preferencia = preferencia;
    }

    public int getId() {
        return id;
    }

    public String getPreferencia() {
        return preferencia;
    }

    public String toString() {
        return "id: " + id.toString() + ", preferencia: " + preferencia;
    }

    @Override
    public void update(String battleLog, String winner) {

        final String filePath = "../espectador" + id.toString() + ".txt";

        createFile(filePath);
        writeToFile(filePath, battleLog, winner);
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
    private void writeToFile(String filePath, String battleLog, String winner) {
        try {
            FileWriter myWriter = new FileWriter(filePath);

            final boolean hasWon = winner.compareTo(this.preferencia) == 0;

            // Special greeting
            myWriter.write("Hola Espectador " + this.id);
            myWriter.write("\nTu luchador estrella es: " + this.preferencia);

            myWriter.write("\nLa batalla comienza...");
            myWriter.write(battleLog);

            // Costum ending
            if (hasWon) {
                myWriter.write("Felicidades!!!! Tu luchador \"" + this.preferencia + "\" ha ganado.");
            } else {
                myWriter.write("Lo sentimos!!!! Tu luchador \"" + this.preferencia + "\" ha perdido.");
            }

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
