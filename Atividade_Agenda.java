class Contato {
    // Atributos
    private String nome;
    private String telefone;

    // Construtor
    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Telefone: " + telefone);
    }
}
import java.util.ArrayList;

class Agenda {
    // Lista de contatos
    private ArrayList<Contato> contatos;

    // Construtor
    public Agenda() {
        contatos = new ArrayList<>();
    }

    // Adicionar contato
    public void adicionarContato(Contato novoContato) {
        contatos.add(novoContato);
    }

    // Exibir todos os contatos
    public void exibirContatos() {
        for (Contato c : contatos) {
            c.exibirInformacoes();
        }
    }

    // Buscar contato pelo nome
    public void buscarContato(String nome) {
        boolean encontrado = false;
        for (Contato c : contatos) {
            if (c != null && c.getNome().equalsIgnoreCase(nome)) {
                c.exibirInformacoes();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Contato não encontrado.");
        }
    }
}
public String getNome() {
    return nome;
}
public class Main {
    public static void main(String[] args) {
        // Criando contatos
        Contato contato1 = new Contato("Alice", "99999-1234");
        Contato contato2 = new Contato("Bruno", "98888-5678");
        Contato contato3 = new Contato("Carlos", "97777-9012");

        // Criando a agenda
        Agenda minhaAgenda = new Agenda();

        // Adicionando contatos
        minhaAgenda.adicionarContato(contato1);
        minhaAgenda.adicionarContato(contato2);
        minhaAgenda.adicionarContato(contato3);

        // Exibindo todos os contatos
        System.out.println("=== Lista de Contatos ===");
        minhaAgenda.exibirContatos();

        // Buscando um contato
        System.out.println("\n=== Buscando Contato: Bruno ===");
        minhaAgenda.buscarContato("Bruno");

        System.out.println("\n=== Buscando Contato: Daniela ===");
        minhaAgenda.buscarContato("Daniela");
    }
}