package br.com.hemmersonrosa.service;

public class PayPalService implements PaymentService{

    @Override
    public double paymentFee(double amount) {
        return amount * 0.01;
    }

    @Override
    public double interest(double amount, int months) {
        return (amount * 0.02) * months ;
    }
}
