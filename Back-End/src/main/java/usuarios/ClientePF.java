package usuarios;

public class ClientePF extends Cliente{

    private String nascimento;
    private char sexo;
    private String cpf;

    public ClientePF(String nome, String celular, String dataCadastro, String email, String senha, String nascimento, char sexo, String cpf){
        super(nome, celular, dataCadastro, email, senha);
        this.nascimento = nascimento;
        this.sexo = sexo;
        this.cpf = cpf;
    }

    /**
     * getNascimento
     * @return Retorna o nascimento do cliente.
     */
    public String getNascimento(){return nascimento;}

    /**
     * getSexo
     * @return Retorna o sexo do cliente.
     */
    public char getSexo(){return sexo;}

    /**
     * getCpf
     * @return Retorna o CPF do cliente.
     */
    public String getCpf(){return cpf;}
}
