public class Gol {

    String minuto;
    Jugador jugadorAsociado;

    public Gol(String minuto, Jugador jugadorAsociado){

        this.minuto = minuto;
        this.jugadorAsociado = jugadorAsociado;
    }

    public String getMinuto() {
        return minuto;
    }

    public void setMinuto(String minuto) {
        this.minuto = minuto;
    }

    public Jugador getJugadorAsociado() {
        return jugadorAsociado;
    }

    public void setJugadorAsociado(Jugador jugadorAsociado) {
        this.jugadorAsociado = jugadorAsociado;
    }
}
