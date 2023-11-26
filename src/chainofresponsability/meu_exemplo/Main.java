package meu_exemplo;

import meu_exemplo.middleware.Middleware;
import meu_exemplo.middleware.RoleCheckMiddleware;
import meu_exemplo.middleware.ThrottlingMiddleware;
import meu_exemplo.middleware.UserExistsMiddleware;
import meu_exemplo.server.OrderService;

import java.io.IOException;
import java.math.BigDecimal;

/**
 * Demo class. Everything comes together here.
 */
public class Main {

    public static void main(String[] args) {

        Middleware middleware = new ThrottlingMiddleware();
        middleware.linkWith(new UserExistsMiddleware())
                .linkWith(new RoleCheckMiddleware());

        OrderService orderService = new OrderService();
        BigDecimal valor = orderService.obterValorDaCompra(middleware, new BigDecimal("100.00"), new BigDecimal("100.00"));
        System.out.println(valor);
    }
}
