package Application;

import Entities.Contract;
import Entities.Installment;
import Services.ContractService;
import Services.PayPalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato");
        System.out.print("Insira o número do contrato: ");
        int number = sc.nextInt();
        System.out.print("Insira a data do contrato: (DD/MM/AAAA) ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);
        System.out.print("Valor do contrato: ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(number, date, totalValue);

        System.out.print("Número de parcelas: ");
        int installments = sc.nextInt();

        ContractService contractService = new ContractService(new PayPalService());

        contractService.processContract(contract, installments);

        System.out.println("Parcelas: ");
        for(Installment installment : contract.getInstallments()){
            System.out.println(installment);
        }

        sc.close();
    }
}
