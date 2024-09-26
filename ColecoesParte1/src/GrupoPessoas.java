import java.util.ArrayList;
import java.util.Scanner;

public class GrupoPessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> grupoMasculino = new ArrayList<>();
        ArrayList<String> grupoFeminino = new ArrayList<>();

        // Leitura do console
        System.out.println("Digite o nome e sexo (M ou F) separados por vírgula. Exemplo: João,M");
        System.out.println("Digite 'sair' para finalizar.");

        while (true) {
            System.out.print("Entrada: ");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }

            // Dividir a entrada em nome e sexo
            String[] pessoa = entrada.split(",");

            if (pessoa.length == 2) {
                String nome = pessoa[0].trim();
                String sexo = pessoa[1].trim().toUpperCase();

                // Verifica o sexo e adiciona ao grupo correspondente
                if (sexo.equals("M")) {
                    grupoMasculino.add(nome);
                } else if (sexo.equals("F")) {
                    grupoFeminino.add(nome);
                } else {
                    System.out.println("Sexo inválido! Use 'M' ou 'F'.");
                }
            } else {
                System.out.println("Formato inválido. Digite no formato 'Nome,Sexo'");
            }
        }

        // Exibir os grupos
        System.out.println("Grupo Masculino: " + grupoMasculino);
        System.out.println("Grupo Feminino: " + grupoFeminino);

        scanner.close();
    }
}
