package co.agenciaviajes.negocio;

/**
 * Clase abstracta de pagos
 *
 * @author Libardo Pantoja, Ricardo Zambrano, Julio A. Hurtado
 */
public abstract class Pago {

    protected int valor;
    protected Cliente cliente;

    public Pago(){}
    
    public Pago(int valor, Cliente cliente) {
        this.valor = valor;
        this.cliente = cliente;
    }
    
    public abstract void registrarPago();

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
}