package view;

import controller.EmpresaController;

import java.util.Scanner;

public class EmpresaView {

    private EmpresaController controller;
    private Scanner scanner;

    public EmpresaView(EmpresaController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Calcular total pago");
            System.out.println("2. Calcular total salários");
            System.out.println("3. Calcular total benefícios");
            System.out.println("4. Funcionário com maior salário");
            System.out.println("5. Funcionário com maior benefício");
            System.out.println("6. Vendedor com maior venda");
            System.out.println("7. LISTAR TODOS");
            System.out.println("8. Sair");

            int opcao = scanner.nextInt();
            if (opcao == 8) break;

            System.out.println("Digite o mês:");
            int mes = scanner.nextInt();
            System.out.println("Digite o ano:");
            int ano = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Total pago: " + controller.calcularTotalPago(mes, ano));
                    break;
                case 2:
                    System.out.println("Total salários: " + controller.calcularTotalSalarios(mes, ano));
                    break;
                case 3:
                    System.out.println("Total benefícios: " + controller.calcularTotalBeneficios(mes, ano));
                    break;
                case 4:
                    System.out.println("Funcionário com maior salário: " + controller.getUsuarioMaiorSalario(mes, ano));
                    break;
                case 5:
                    System.out.println("Funcionário com maior benefício: " + controller.getUsuarioMaiorBeneficio(mes, ano));
                    break;
                case 6:
                    System.out.println("Vendedor com maior venda: " + controller.getVendedorMaiorVenda(mes, ano));
                    break;
                case 7:
                    System.out.println("\n---------------------------------------\n");
                    System.out.println("Total pago: " + controller.calcularTotalPago(mes, ano));
                    System.out.println("Total salários: " + controller.calcularTotalSalarios(mes, ano));
                    System.out.println("Total benefícios: " + controller.calcularTotalBeneficios(mes, ano));
                    System.out.println("Funcionário com maior salário: " + controller.getUsuarioMaiorSalario(mes, ano));
                    System.out.println("Funcionário com maior benefício: " + controller.getUsuarioMaiorBeneficio(mes, ano));
                    System.out.println("Vendedor com maior venda: " + controller.getVendedorMaiorVenda(mes, ano));
                    System.out.println("\n---------------------------------------\n");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
