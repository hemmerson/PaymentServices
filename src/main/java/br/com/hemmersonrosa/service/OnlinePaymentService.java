package br.com.hemmersonrosa.service;

public interface PaymentService {
    public double paymentFee(double amount);
    public double interest(double amount, int months);
}
