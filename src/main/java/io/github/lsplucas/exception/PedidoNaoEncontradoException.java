package io.github.lsplucas.exception;

public class PedidoNaoEncontradoException extends RuntimeException {
    public PedidoNaoEncontradoException() {
        super("Pedido não encontrado");
    }
}
