package service;

import model.Secretario;
import model.Usuario;
import model.Vendedor;

import java.util.List;

public class EmpresaService {

    public double calcularTotalPago(List<Usuario> usuarios, int mes, int ano) {
        double total = 0;
        for (Usuario usuario : usuarios) {
            total += usuario.calcularPagamento(mes, ano);
        }
        return total;
    }

    public double calcularTotalSalarios(List<Usuario> usuarios, int mes, int ano) {
        double total = 0;
        for (Usuario usuario : usuarios) {
            total += usuario.getSalario(ano);
        }
        return total;
    }

    public double calcularTotalBeneficios(List<Usuario> usuarios, int mes, int ano) {
        double total = 0;
        for (Usuario usuario : usuarios) {
            if (usuario instanceof Secretario || usuario instanceof Vendedor) {
                total += usuario.calcularBeneficio(mes, ano);
            }
        }
        return total;
    }

    public Usuario getUsuarioMaiorSalario(List<Usuario> usuarios, int mes, int ano) {
        Usuario maiorUsuario = null;
        double maiorValor = 0;
        for (Usuario usuario : usuarios) {
            double valor = usuario.calcularPagamento(mes, ano);
            if (valor > maiorValor) {
                maiorValor = valor;
                maiorUsuario = usuario;
            }
        }
        return maiorUsuario;
    }

    public Usuario getUsuarioMaiorBeneficio(List<Usuario> usuarios, int mes, int ano) {
        Usuario maiorUsuario = null;
        double maiorValor = 0;
        for (Usuario usuario : usuarios) {
            if (usuario instanceof Secretario || usuario instanceof Vendedor) {
                double valor = usuario.calcularBeneficio(mes, ano);
                if (valor > maiorValor) {
                    maiorValor = valor;
                    maiorUsuario = usuario;
                }
            }
        }
        return maiorUsuario;
    }

    public Vendedor getVendedorMaiorVenda(List<Vendedor> vendedores, int mes, int ano) {
        Vendedor maiorVendedor = null;
        double maiorVenda = 0;
        for (Vendedor vendedor : vendedores) {
            double venda = vendedor.calcularVendasMes(mes, ano);
            if (venda > maiorVenda) {
                maiorVenda = venda;
                maiorVendedor = vendedor;
            }
        }
        return maiorVendedor;
    }
}
