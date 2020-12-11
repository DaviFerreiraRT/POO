package Exceptions;

public class PlacaNaoLocalizadaException extends Exception {
    private String placa;
    public PlacaNaoLocalizadaException() {
        super("Erro: Placa não encontrado!");
    }

    public PlacaNaoLocalizadaException(String placa) {
        this();
        this.placa = placa;
    }

    public String getPlaca() {
        return this.placa;
    }
    
    
}
