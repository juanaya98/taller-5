package co.agenciaviajes.negocio;

/**
 * Pago en efectivo
 *
 * @author Libardo Pantoja, Ricardo Zambrano, Julio A. Hurtado
 */
public class PagoEfectivo extends Pago {

    public PagoEfectivo() {
    }

    public PagoEfectivo(int valor, Cliente cliente) {
        super(valor, cliente);
    }
    
    @Override
    public void registrarPago() {
        System.out.println("------------------------------------------------------");
        Cliente cliente = new Cliente("98393282", "Carlos  ", "Sanchez Londoño ", "M", "car@gmail.com");
        this.setCliente(cliente);
        
        this.setValor(1200000 );
        
        System.out.println("Pago en efectivo registrado en el sistema con éxito.");
        System.out.println("Cliente: " + this.getCliente().toString());
        System.out.println("Valor: "+getValor());
    }


}
