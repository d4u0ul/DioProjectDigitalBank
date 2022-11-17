import java.util.List;

public class ContaInvestimento{

    public IConta conta;
    private List<Aplicacao> listaDeInvestimentos ;

    public ContaInvestimento(IConta conta) {
        this.conta = conta;
    }
    public void imprimirInvestimentos(){
        for(Aplicacao app: listaDeInvestimentos){
            System.out.println(app.name());
        }
    }
    public void addAplicacao(Aplicacao app){
        this.listaDeInvestimentos.add(app);
    }
    public void removeAplicacao(Aplicacao app){
        this.listaDeInvestimentos.remove(listaDeInvestimentos.indexOf(app));
    }

}
