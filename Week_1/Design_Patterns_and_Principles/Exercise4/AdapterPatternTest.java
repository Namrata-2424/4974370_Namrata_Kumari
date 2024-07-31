package Exercise4;

public class AdapterPatternTest {
    public static void main(String[] args) {
        // Create instances of payment gateways
        PayPal payPal = new PayPal();
        Stripe stripe = new Stripe();

        // Create adapters for the payment gateways
        PaymentProcessor payPalAdapter = new PayPalAdapter(payPal);
        PaymentProcessor stripeAdapter = new StripeAdapter(stripe);

        // Process payments through adapters
        payPalAdapter.processPayment(100.00);
        stripeAdapter.processPayment(200.00);
    }
}
