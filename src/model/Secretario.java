package model;

public class Secretario extends Usuario {

    public Secretario(String nome, int mesAdmissao, int anoAdmissao) {
        super(nome, mesAdmissao, anoAdmissao);
    }

    @Override
    public double getSalario(int ano) {
        int anosTrabalhados = ano - getAnoAdmissao();
        return 7000 + (1000 * anosTrabalhados);
    }

    @Override
    public double calcularBeneficio(int mes, int ano) {
        return getSalario(ano) * 0.2;
    }
}
