package delegation.temphotmartexemplo;

import delegation.temphotmartexemplo.conversor.Action;
import delegation.temphotmartexemplo.conversor.Factory;
import delegation.temphotmartexemplo.vo.OfferVO;

public class Main {
    public static void main(String[] args) {
        ProductPayment paymentService = new ProductPayment();
        Double valorConvertido = atualizar(paymentService, "update");
        System.out.println(valorConvertido);
    }
    
    public static Double atualizar(ProductPayment paymentService, String actionEnum) {
        Action action = new Factory().getAction(actionEnum);
        if(action != null) {
            paymentService.setAction(action);
            return paymentService.execute(new OfferVO());
        } else {
            System.out.println("Action não encontrado");
            return null;
        }
    }
}
