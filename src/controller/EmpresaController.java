package controller;

import model.Usuario;
import model.Vendedor;
import service.EmpresaService;

import java.util.List;
import java.util.stream.Collectors;

public class EmpresaController {

    private List<Usuario> usuarios;
    private EmpresaService service;

    public EmpresaController(List<Usuario> usuarios) {
        this.usuarios = usuarios;
        this.service = new EmpresaService();
    }

    public double calcularTotalPago(int mes, int ano) {
        return service.calcularTotalPago(usuarios, mes, ano);
    }

    public double calcularTotalSalarios(int mes, int ano) {
        return service.calcularTotalSalarios(usuarios, mes, ano);
    }

    public double calcularTotalBeneficios(int mes, int ano) {
        return service.calcularTotalBeneficios(usuarios, mes, ano);
    }

    public String getUsuarioMaiorSalario(int mes, int ano) {
        Usuario user = service.getUsuarioMaiorSalario(usuarios, mes, ano);
        return user != null ? user.getNome() : "Nenhum usuário encontrado.";
    }

    public String getUsuarioMaiorBeneficio(int mes, int ano) {
        Usuario user = service.getUsuarioMaiorBeneficio(usuarios, mes, ano);
        return user != null ? user.getNome() : "Nenhum usuário encontrado.";
    }

    public String getVendedorMaiorVenda(int mes, int ano) {
        List<Vendedor> vendedores = usuarios.stream()
                .filter(user -> user instanceof Vendedor)
                .map(user -> (Vendedor) user)
                .collect(Collectors.toList());
        Vendedor vendedor = service.getVendedorMaiorVenda(vendedores, mes, ano);
        return vendedor != null ? vendedor.getNome() : "Nenhum vendedor encontrado.";
    }
}
