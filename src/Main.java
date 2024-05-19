import controller.EmpresaController;
import model.Usuario;
import model.Gerente;
import model.Secretario;
import model.Vendedor;
import view.EmpresaView;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Usuario> funcionarios = new ArrayList<>();

        funcionarios.add(new Secretario("Jorge Carvalho", 1, 2018));
        funcionarios.add(new Secretario("Maria Souza", 12, 2015));

        Map<String, Double> vendasAna = new HashMap<>();
        vendasAna.put("12/2021", 5200.0);
        vendasAna.put("01/2022", 4000.0);
        vendasAna.put("02/2022", 4200.0);
        vendasAna.put("03/2022", 5850.0);
        vendasAna.put("04/2022", 7000.0);

        Map<String, Double> vendasJoao = new HashMap<>();
        vendasJoao.put("12/2021", 3400.0);
        vendasJoao.put("01/2022", 7700.0);
        vendasJoao.put("02/2022", 5000.0);
        vendasJoao.put("03/2022", 5900.0);
        vendasJoao.put("04/2022", 6500.0);

        funcionarios.add(new Vendedor("Ana Silva", 12, 2021, vendasAna));
        funcionarios.add(new Vendedor("João Mendes", 12, 2021, vendasJoao));

        funcionarios.add(new Gerente("Juliana Alves", 7, 2017));
        funcionarios.add(new Gerente("Bento Albino", 3, 2014));

        EmpresaController controller = new EmpresaController(funcionarios);
        EmpresaView view = new EmpresaView(controller);

        view.exibirMenu();
    }
}
