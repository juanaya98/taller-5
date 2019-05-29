package co.agenciaviajes.negocio;

/**
 * Pago con tarjeta débito
 *
 * @author Libardo Pantoja, Ricardo Zambrano, Julio A. Hurtado
 */
public class PagoTarjetaDebito extends Pago {
    
    private String codigo;
    private String banco;
    private String numeroCuenta;

    public PagoTarjetaDebito(){}
    
    public PagoTarjetaDebito(String codigo, String banco, String numeroCuenta, int valor, Cliente cliente) {
        super(valor, cliente);
        this.codigo = codigo;
        this.banco = banco;
        this.numeroCuenta = numeroCuenta;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public void registrarPago() {
        //Aqui vendria la logica para grabar en la base de datos
        System.out.println("------------------------------------------------------");
        Cliente cliente = new Cliente("98123458", "Manuel ", "Lara", "M", "manu@gmail.com");
        this.setCliente(cliente);

        this.setValor(2650000); // Cualquier valor de una logica de negocio que aun no se tiene
        this.setCodigo("1254578");
        this.setBanco("Bancolombia ");
        this.setNumeroCuenta(" 5125-6645-1245 ");
   

        System.out.println("Pago con tarjeta de débito registrado en el sistema con éxito.");
        System.out.println("Cliente: " + this.getCliente().toString());
        System.out.println("Código Cliente: "+getCodigo());
        System.out.println("Banco: "+getBanco());
        System.out.println("Número Cuenta: "+getNumeroCuenta());
        System.out.println("Valor: " + this.getValor());
    }


}