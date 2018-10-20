package pt.ipg.conversordetemperaturas;

public class TemperaturaCelsius extends Temperatura {
    public TemperaturaCelsius(double valor){

        this.valor = valor;
    }
    /**
     *
     * @return
     */
    @Override
    public double getFahrenheit() {
        return valor * 9.0/5.0 + 32.0; // todo: corrigir bug
    }

    @Override
    public double getCelsius() {
        return valor;
    }
}
