package br.com.hemmersonrosa;

import br.com.hemmersonrosa.model.Contract;
import br.com.hemmersonrosa.service.ContractService;
import br.com.hemmersonrosa.service.PayPalServiceOnline;
import br.com.hemmersonrosa.utils.FormatDate;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre os dados do contrato:");
        System.out.print("Numero: ");
        int number = scanner.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(scanner.next(), FormatDate.FORMATTER);
        System.out.print("Valor do contrato: ");
        Double totalValue = scanner.nextDouble();

        Contract contract = new Contract(number, date, totalValue);

        System.out.print("Entre com o número de parcelas: ");
        int months = scanner.nextInt();

        ContractService contractService = new ContractService(new PayPalServiceOnline());
        contractService.processContract(contract, months);

        System.out.println(contract);


        scanner.close();
    }
}