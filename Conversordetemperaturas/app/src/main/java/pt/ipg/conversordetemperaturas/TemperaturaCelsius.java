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
        return valor * 9/5 + 32; // todo: corrigir bug
    }

    @Override
    public double getCelsius() {
        return valor;
    }
}
