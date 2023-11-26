package delegation.comdelegation;

import delegation.comdelegation.conversor.Conversor;
import delegation.comdelegation.conversor.Factory;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setSaldo(10.0);
        Double valorConvertido = realizarConversaoDeSaldo(conta, Moeda.EURO);
        System.out.println(valorConvertido);
    }
    
    public static Double realizarConversaoDeSaldo(Conta conta, Moeda moeda) {
        Conversor conversor = new Factory().getConversor(moeda);
        return conta.converter(conversor);
        
    }
}
