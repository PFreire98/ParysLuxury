package usuarios;

public class ClientePJ extends Cliente {
    private String inscriEstadual;
    private String responsavelCompra;
    private String cnpj;

    public ClientePJ(String nome, String celular, String dataCadastro, String email, String senha, String inscriEstadual, String responsavelCompra, String cnpj){
        super(nome, celular, dataCadastro, email, senha);
        this.inscriEstadual = inscriEstadual;
        this.responsavelCompra = responsavelCompra;
        this.cnpj = cnpj;
    }

    /**
     * getInscriEstadual
     * @return Retorna a inscrição estadual do cliente.
     */
    public String getInscriEstadual(){return inscriEstadual;}

    /**
     * getResponsavelCompra
     * @return Retorna o responsável pela compra.
     */
    public String getResponsavelCompra(){return responsavelCompra;}

    /**
     * getCnpj
     * @return Retorna o CNPJ do cliente.
     */
    public String getCnpj(){return cnpj;}
}
