/*criação pacote*/
//package lista;
 
/*declarando uma classe chamada Contato*/
public class Contato{
    private String nome;
    private String telefone;


/*construtor*/
    public Contato (String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

/*uso de getter para ler o valor de um atributo privado de forma controlada*/
    public String getNome(){
        return nome;
    }
    
    public String getTelefone(){
        return telefone;
    }
    
/*exibir as informações*/
    public void exibirInf(){
        System.out.println("Nome: "+ nome + " Telefone: "+ telefone);
    }
    
    
/*main*/

//import lista.Contato

public static void main (String[] args) {
    /*criando objeto*/
    
    Contato c1 = new Contato("Maria", "988798546");
    Contato c2 = new Contato("Pedro", "8746878");
    Contato c3 = new Contato("Nico", "988798546");
    Contato c4 = new Contato("Mica", "988798546");
    Contato c5 = new Contato("Lukas", "988798546");
    Contato c6 = new Contato("João Vitor", "988798546");
    
   
    c1.exibirInf();
}

}
git push origin main
