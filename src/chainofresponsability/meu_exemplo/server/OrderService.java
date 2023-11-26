package meu_exemplo.server;

import meu_exemplo.middleware.Middleware;

import java.math.BigDecimal;

/**
 * Server class.
 */
public class OrderService {

    public BigDecimal obterValorDaCompra(Middleware middleware, BigDecimal payloadPrice, BigDecimal offerPrice) {
        return middleware.getPurchaseValue(payloadPrice, offerPrice);
    }

}
