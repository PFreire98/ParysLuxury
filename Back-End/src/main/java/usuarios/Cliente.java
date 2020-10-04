package usuarios;
/**
 @Entity
 @Table(name=Cliente)
 */
public class Cliente {

    private String nome;
    private String celular;
    private String dataCadastro;
    private String email;
    private String senha;

    /**
     * Metodo Construtor.
     *
     */
    public Cliente(String nome, String celular, String dataCadastro, String email, String senha){
        this.nome = nome;
        this.celular = celular;
        this.dataCadastro = dataCadastro;
        this.email = email;
        this.senha = senha;
    }

    /**
     * getNome
     * @return Retorna o nome do cliente.
     */
    public String getNome(){return nome;}

    /**
     * getCelular
     * @return Retorna o celular do cliente.
     */
    public String getCelular(){return celular;}

    /**
     * getDataCadastro
     * @return Retorna a data de cadastro do cliente.
     */
    public String getDataCadastro(){return dataCadastro;}

    /**
     * getEmail
     * @return Retorna o email do cliente.
     */
    public String getEmail(){return email;}

    /**
     * login
     * @return Retorna True se o login foi confirmado e False se houve divergencia de informação.
     */
    public boolean login(String senha) {
        if (this.senha == senha) {
            System.out.println("[!] Acesso Permitido!");
            return true;
        } else {
            System.out.println("[!] Acesso Negado!");
            return false;
        }
    }
}
