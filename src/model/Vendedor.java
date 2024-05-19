package model;

import java.util.Map;

public class Vendedor extends Usuario {
    private Map<String, Double> vendasMensais;

    public Vendedor(String nome, int mesAdmissao, int anoAdmissao, Map<String, Double> vendasMensais) {
        super(nome, mesAdmissao, anoAdmissao);
        this.vendasMensais = vendasMensais;
    }

    @Override
    public double getSalario(int ano) {
        int anosTrabalhados = ano - getAnoAdmissao();
        return 12000 + (1800 * anosTrabalhados);
    }

    @Override
    public double calcularBeneficio(int mes, int ano) {
        String chave = String.format("%02d/%04d", mes, ano);
        return vendasMensais.getOrDefault(chave, 0.0) * 0.3;
    }

    public double calcularVendasMes(int mes, int ano) {
        String chave = String.format("%02d/%04d", mes, ano);
        return vendasMensais.getOrDefault(chave, 0.0);
    }
}
