public class Espectador {
    private Integer id;
    private String preferencia;

    public Espectador(Integer id, String preferencia){
        this.id = id;
        this.preferencia = preferencia;
    }

    public int getId(){
        return id;
    }
    public String getPreferencia(){
        return preferencia;
    }

    public String toString(){
        return "id: " + id.toString() + ", preferencia: " + preferencia;
    }
}
