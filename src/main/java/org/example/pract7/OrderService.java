package org.example.pract7;

import org.example.pract7.exception.OrderProcessingException;
import org.example.pract7.exception.PaymentGatewayException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrderService {

    private static final Logger log = LoggerFactory.getLogger(OrderService.class);

    public void checkout(Order order) {
        /*try {
            processPayment(order);
        } catch (PaymentGatewayException e) {
            String msg = "Checkout failed. orderId=" + order.id() + ", userEmail=" + order.userEmail();
            log.error(msg, e);
            throw new OrderProcessingException(msg, e);
        }*/

        log.info("Checkout started. orderId={}, email={}", order.id(), order.userEmail());
        if (order.id() == 2) {
            log.warn("Checkout declined. orderId={}, email={}", order.id(), order.userEmail());
            return;
        }
        if (order.id() == 3) {
            log.error("Payment gateway timeout. orderId={}, email={}", order.id(), order.userEmail());
            return;
        }
        log.info("Checkout successful. orderId={}, email={}", order.id(), order.userEmail());
     }

    private void processPayment(Order order) throws PaymentGatewayException {
        throw new PaymentGatewayException("Gateway timeout");
    }
}