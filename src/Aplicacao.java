import java.util.Objects;

public class Aplicacao {
    private String nomeDaAplicacao;
    private Double taxaDeRendimento;
    private Double tempoMinimoDeResgate;

    public Aplicacao(String nomeDaAplicacao, Double taxaDeRendimento, Double tempoMinimoDeResgate) {
        this.nomeDaAplicacao = nomeDaAplicacao;
        this.taxaDeRendimento = taxaDeRendimento;
        this.tempoMinimoDeResgate = tempoMinimoDeResgate;
    }

    public String getNomeDaAplicacao() {
        return nomeDaAplicacao;
    }

    public Double getTaxaDeRendimento() {
        return taxaDeRendimento;
    }

    public Double getTempoMinimoDeResgate() {
        return tempoMinimoDeResgate;
    }

    public void setTaxaDeRendimento(Double taxaDeRendimento) {
        this.taxaDeRendimento = taxaDeRendimento;
    }

    public void setTempoMinimoDeResgate(Double tempoMinimoDeResgate) {
        this.tempoMinimoDeResgate = tempoMinimoDeResgate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aplicacao aplicacao = (Aplicacao) o;
        return Objects.equals(nomeDaAplicacao, aplicacao.nomeDaAplicacao) && Objects.equals(taxaDeRendimento, aplicacao.taxaDeRendimento) && Objects.equals(tempoMinimoDeResgate, aplicacao.tempoMinimoDeResgate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeDaAplicacao, taxaDeRendimento, tempoMinimoDeResgate);
    }

    @Override
    public String toString() {
        return "Aplicacao{" +
                "nomeDaAplicacao='" + nomeDaAplicacao + '\'' +
                ", taxaDeRendimento=" + taxaDeRendimento +
                ", tempoMinimoDeResgate=" + tempoMinimoDeResgate +
                '}';
    }
}
