package DS.aula0603;
/*
rm 
nome 
email 
telefone
endereço
*/
public class Professor{

    
    private int rm;
    private String nome; 
    private String email;
    private Endereco endereco;
    private String telefone;

    public Professor(){}

      public Professor(int rm, String nome, String email){
        this.rm = rm;   
        this.nome = nome;
        this.email = email;
        }

      public int getRm() {
        return rm;
      }

      public void setRm(int rm) {
        this.rm = rm;
      }

      public String getNome() {
        return nome;
      }

      public void setNome(String nome) {
        this.nome = nome;
      }

      public String getEmail() {
        return email;
      }

      public void setEmail(String email) {
        this.email = email;
      }

      public String getTelefone() {
        return telefone;
      }

      public void setTelefone(String telefone) {
        this.telefone = telefone;
      }

      public Endereco getEndereco() {
        return endereco;
      }

      public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
      }

    
}

