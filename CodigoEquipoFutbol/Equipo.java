import java.util.ArrayList;

public class Equipo {

    String nombre;
    ArrayList <Gol> listaGoles;
    ArrayList<Jugador> listaJugadores;

    public Equipo (ArrayList<Jugador> listaJugadores, String nombre){
        this.listaJugadores = listaJugadores;
        this.nombre = nombre;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Gol> getListaGoles() {
        return listaGoles;
    }

    public void setGol(Gol gol) {
        this.listaGoles.add(gol);
    }

    public ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugador(Jugador jugador) {
        this.listaJugadores.add(jugador);
    }
}
