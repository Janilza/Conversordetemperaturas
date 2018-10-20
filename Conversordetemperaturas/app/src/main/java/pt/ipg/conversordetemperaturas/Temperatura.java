package pt.ipg.conversordetemperaturas;

public abstract class Temperatura {

    protected double valor;

    /**
     * Devolve a temperatura em fahrenheit
     * @return um numero decimal que representa
     */
    public abstract double getFahrenheit ();
    public abstract double getCelsius ();
}
