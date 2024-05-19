package model;

public class Gerente extends Usuario {

    public Gerente(String nome, int mesAdmissao, int anoAdmissao) {
        super(nome, mesAdmissao, anoAdmissao);
    }

    @Override
    public double getSalario(int ano) {
        int anosTrabalhados = ano - getAnoAdmissao();
        return 20000 + (3000 * anosTrabalhados);
    }

    @Override
    public double calcularBeneficio(int mes, int ano) {
        return 0; // Gerente não recebe benefícios
    }
}
