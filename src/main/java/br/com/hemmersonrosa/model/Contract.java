package br.com.hemmersonrosa.model;

import br.com.hemmersonrosa.utils.FormatDate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
    private int number;
    private LocalDate date;
    private double totalValue;
    private List<Installment> installments = new ArrayList<>();

    public Contract() {
    }

    public Contract(int number, LocalDate date, double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public List<Installment> getInstallments() {
        return installments;
    }

    @Override
    public String toString() {
        StringBuilder installmentsString = new StringBuilder();

        for (Installment instalment: installments) {
            installmentsString.append(instalment).append("\n");
        }

        return "Contrato:" +
                "\nNúmero: " + number +
                "\nData de aquisição: " + date.format(FormatDate.FORMATTER) +
                "\nValor total: " + String.format("%.2f", totalValue) +
                "\nParcelas: \n" + installmentsString.toString();
    }
}
