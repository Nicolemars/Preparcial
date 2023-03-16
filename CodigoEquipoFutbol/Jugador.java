import java.util.ArrayList;

public class Jugador {

    String nombre;
    String numCamiseta;
    Tarjeta falta;
    ArrayList<Gol> listaGoles;

    public Jugador (String nombre, String numCamiseta){
        this.nombre=nombre;
        this.numCamiseta=numCamiseta;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumCamiseta() {
        return numCamiseta;
    }

    public void setNumCamiseta(String numCamiseta) {
        this.numCamiseta = numCamiseta;
    }

    public Tarjeta getFalta() {
        return falta;
    }

    public void setFalta(Tarjeta falta) {
        this.falta = falta;
    }

    public ArrayList<Gol> getListaGoles() {
        return listaGoles;
    }

    public void setGol(Gol gol) {
        this.listaGoles.add(gol);
    }
}
