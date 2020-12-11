package Exceptions;

public class ChassiNaoLocalizadoException extends Exception {
    private long chassi; 

    public ChassiNaoLocalizadoException() {
        super("Erro: Chassi não encontrado!");
    }

    public ChassiNaoLocalizadoException(long chassi) {
        this();
        this.chassi = chassi;
    }

    public long getChassi() {
        return this.chassi;
    }
    
}
