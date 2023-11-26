package delegation.comdelegation;

import delegation.comdelegation.conversor.Conversor;

public class Conta {
    public Double saldo;
    
    public Double converter(Conversor conversor){
        return conversor.converter(saldo);
    }
    
    public Double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
