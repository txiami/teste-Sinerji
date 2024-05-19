package model;

public abstract class Usuario {
    private String nome;
    private int mesAdmissao;
    private int anoAdmissao;

    public Usuario(String nome, int mesAdmissao, int anoAdmissao) {
        this.nome = nome;
        this.mesAdmissao = mesAdmissao;
        this.anoAdmissao = anoAdmissao;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoAdmissao() {
        return anoAdmissao;
    }

    public abstract double getSalario(int ano);
    public abstract double calcularBeneficio(int mes, int ano);
    public double calcularPagamento(int mes, int ano) {
        return getSalario(ano) + calcularBeneficio(mes, ano);
    }
}
