package br.dev.joaquim.exceptions;

/**
 * Exceção personalizada para indicar que uma operação bancária falhou devido a fundos insuficientes.
 */
public class InsufficientFoundsException extends Exception {
    
    /**
     * Construtor da exceção que recebe uma mensagem descritiva do erro.
     * 
     * @param message Mensagem explicativa sobre a exceção.
     */
    public InsufficientFoundsException(String message) {
        super(message);
    }
}