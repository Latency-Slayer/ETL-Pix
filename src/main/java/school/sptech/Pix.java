package school.sptech;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Pix {

    @JsonProperty("AnoMes")
    private Integer anoMes;

    @JsonProperty("PAG_PFPJ")
    private String PAG_PFPJ;

    @JsonProperty("REC_PFPJ")
    private String REC_PFPJ;

    @JsonProperty("PAG_REGIAO")
    private String PAG_REGIAO;

    @JsonProperty("REC_REGIAO")
    private String REC_REGIAO;

    @JsonProperty("PAG_IDADE")
    private String PAG_IDADE;

    @JsonProperty("REC_IDADE")
    private String REC_IDADE;

    @JsonProperty("FORMAINICIACAO")
    private String FORMA_INICIACAO;

    @JsonProperty("NATUREZA")
    private String NATUREZA;

    @JsonProperty("FINALIDADE")
    private String FINALIDADE;

    @JsonProperty("VALOR")
    private Double VALOR;

    @JsonProperty("QUANTIDADE")
    private Integer QUANTIDADE;

    public Pix(){}
    public Pix(Integer ano, String PAG_PFPJ, String REC_PFPJ, String PAG_REGIAO, String REC_REGIAO, String PAG_IDADE, String REC_IDADE, String FORMA_INICIACAO, String NATUREZA, String FINALIDADE, Double VALOR, Integer QUANTIDADE) {
        this.anoMes = ano;
        this.PAG_PFPJ = PAG_PFPJ;
        this.REC_PFPJ = REC_PFPJ;
        this.PAG_REGIAO = PAG_REGIAO;
        this.REC_REGIAO = REC_REGIAO;
        this.PAG_IDADE = PAG_IDADE;
        this.REC_IDADE = REC_IDADE;
        this.FORMA_INICIACAO = FORMA_INICIACAO;
        this.NATUREZA = NATUREZA;
        this.FINALIDADE = FINALIDADE;
        this.VALOR = VALOR;
        this.QUANTIDADE = QUANTIDADE;
    }

    public Integer getAno() {
        return anoMes;
    }

    public String anoMes(){
        String anoMesString = String.valueOf(anoMes);
        String ano = anoMesString.substring(0,4);
        String mes = anoMesString.substring(4,6);

        return ano + "-" + mes;
    }

    public String getPAG_PFPJ() {
        return PAG_PFPJ;
    }

    public String getREC_PFPJ() {
        return REC_PFPJ;
    }

    public String getPAG_REGIAO() {
        return PAG_REGIAO;
    }

    public String getREC_REGIAO() {
        return REC_REGIAO;
    }

    public String getPAG_IDADE() {
        return PAG_IDADE;
    }

    public String getREC_IDADE() {
        return REC_IDADE;
    }

    public String getFORMA_INICIACAO() {
        return FORMA_INICIACAO;
    }

    public String getNATUREZA() {
        return NATUREZA;
    }

    public String getFINALIDADE() {
        return FINALIDADE;
    }

    public Double getVALOR() {
        return VALOR;
    }

    public Integer getQUANTIDADE() {
        return QUANTIDADE;
    }

    @Override
    public String toString() {
        return "Pix{" +
                "ano=" + anoMes +
                ", PAG_PFPJ='" + PAG_PFPJ + '\'' +
                ", REC_PFPJ='" + REC_PFPJ + '\'' +
                ", PAG_REGIAO='" + PAG_REGIAO + '\'' +
                ", REC_REGIAO='" + REC_REGIAO + '\'' +
                ", PAG_IDADE='" + PAG_IDADE + '\'' +
                ", REC_IDADE='" + REC_IDADE + '\'' +
                ", FORMA_INICIACAO='" + FORMA_INICIACAO + '\'' +
                ", NATUREZA='" + NATUREZA + '\'' +
                ", FINALIDADE='" + FINALIDADE + '\'' +
                ", VALOR=" + VALOR +
                ", QUANTIDADE=" + QUANTIDADE +
                '}';
    }
}
