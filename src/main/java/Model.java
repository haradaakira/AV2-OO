public class Model {

    private String nome;
    private Integer idagencia;
    private Integer idcontacorrente;
    private Double saldoatualizado;

    public Model() {
    }

    public Model(String nome, Integer idagencia, Integer idcontacorrente, Double saldoatualizado) {
        this.nome = nome;
        this.idagencia = idagencia;
        this.idcontacorrente = idcontacorrente;
        this.saldoatualizado = saldoatualizado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdagencia() {
        return idagencia;
    }

    public void setIdagencia(Integer idagencia) {
        this.idagencia = idagencia;
    }

    public Integer getIdcontacorrente() {
        return idcontacorrente;
    }

    public void setIdcontacorrente(Integer idcontacorrente) {
        this.idcontacorrente = idcontacorrente;
    }

    public Double getSaldoatualizado() {
        return saldoatualizado;
    }

    public void setSaldoatualizado(Double saldoatualizado) {
        this.saldoatualizado = saldoatualizado;
    }
}
