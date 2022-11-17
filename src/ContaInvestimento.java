import java.util.Map;
import java.util.Set;

public class ContaInvestimento{

    public IConta conta;
    private Map< Aplicacao, Boolean> dicionarioDeInvestimentos;

    public ContaInvestimento(IConta conta) {
        this.conta = conta;
    }
    public void addAplicacao(Aplicacao app, Boolean ehRenovacaoAutomatica)
    {
        this.dicionarioDeInvestimentos.put(app, ehRenovacaoAutomatica);
    }
    public void removeAplicacao(Aplicacao app, Boolean ehRenovacaoAutomatica)
    {
        this.dicionarioDeInvestimentos.remove(app,ehRenovacaoAutomatica);
    }
    public void listaAplicacoes()
    {
        Set<Map.Entry<Aplicacao, Boolean>> entries = dicionarioDeInvestimentos.entrySet();
        for(Map.Entry<Aplicacao, Boolean> entry : entries){
            System.out.println("Aplicacao: "+entry.getKey() +" Renovação automática: "+entry.getValue());
        }
    }

}
