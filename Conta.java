
import java.util.UUID;

public abstract class Conta {
    private String id = UUID.randomUUID().toString();
    
    protected double saldo = 0;
    protected final Cliente cliente;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new BancoException("D10", "apenas depositos positivos");
        }
        this.saldo += valor;
    }

    public abstract void sacar(double valor);

    public String getId() {
        return id;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

   
    @Override
    public String toString() {
        return "[" + this.cliente + "]: " + this.saldo;
    }

} 
