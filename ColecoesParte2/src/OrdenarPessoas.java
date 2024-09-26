import java.util.*;

public class OrdenarPessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos nomes separados por vírgula
        System.out.println("Digite os nomes separados por vírgula: ");
        String entradaNomes = scanner.nextLine();

        // Dividir os nomes usando split
        String[] nomes = entradaNomes.split(",");

        // Ordenar os nomes em ordem alfabética
        Arrays.sort(nomes);

        // Imprimir os nomes ordenados
        System.out.println("Nomes em ordem alfabética: " + Arrays.toString(nomes));

        // Criar Map para armazenar pessoas e sexo
        Map<String, String> pessoas = new HashMap<>();

        // Ler nome - sexo
        System.out.println("Digite os nomes com o sexo (Nome - Sexo). Exemplo: Ana - F");
        System.out.println("Digite 'sair' para finalizar.");

        while (true) {
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }

            // Dividir entrada em nome e sexo
            String[] pessoa = entrada.split(" - ");
            if (pessoa.length == 2) {
                String nome = pessoa[0].trim();
                String sexo = pessoa[1].trim().toUpperCase();

                // Adicionar ao Map
                pessoas.put(nome, sexo);
            } else {
                System.out.println("Entrada inválida, digite no formato: Nome - Sexo");
            }
        }

        // Separar por sexo
        List<String> grupoMasculino = new ArrayList<>();
        List<String> grupoFeminino = new ArrayList<>();

        for (Map.Entry<String, String> entry : pessoas.entrySet()) {
            if (entry.getValue().equals("M")) {
                grupoMasculino.add(entry.getKey());
            } else if (entry.getValue().equals("F")) {
                grupoFeminino.add(entry.getKey());
            }
        }

        // Imprimir os grupos separados
        System.out.println("Grupo Masculino: " + grupoMasculino);
        System.out.println("Grupo Feminino: " + grupoFeminino);

        scanner.close();
    }
}
