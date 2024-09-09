import br.com.fiap.fintech.modelo.*;

import java.time.LocalDate;

public class Teste {

    public static void main(String[] args) {

        Usuario novoUsuario = new Usuario("Ada Lovelace", "12345678", "adalovelace@fiap.com.br", "admin123");
        System.out.println("Informações do Usuário: " +
                "\n Nome: " + novoUsuario.getNome() +
                "\n CPF: " + novoUsuario.getCpf() +
                "\n Email: " + novoUsuario.getEmail());
        System.out.println();

        CategoriaReceita categoriaReceita = new CategoriaReceita("Salário");
        System.out.println("Categoria do tipo Receita: " + categoriaReceita.getNome());

        CategoriaDespesa categoriaDespesa = new CategoriaDespesa("Farmácia");
        System.out.println("Categoria do tipo Despesa: " + categoriaDespesa.getNome());
        System.out.println();

        Receita receita = new Receita(categoriaReceita, "Salário do mês", 8000.00, LocalDate.now());
        System.out.println(receita);

        Despesa despesa = new Despesa(categoriaDespesa, "Compra de aspirina", 10.46, LocalDate.now());
        System.out.println(despesa);

    }

}
