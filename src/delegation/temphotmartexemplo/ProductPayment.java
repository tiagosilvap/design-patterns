package delegation.temphotmartexemplo;

import delegation.temphotmartexemplo.conversor.Action;
import delegation.temphotmartexemplo.vo.OfferVO;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class ProductPayment {
    
    Action action;
    
    public void setAction(Action action) {
        this.action = action;
    }
    
    public Double execute(OfferVO offerVO) {
        return action.execute(offerVO);
    }
}
