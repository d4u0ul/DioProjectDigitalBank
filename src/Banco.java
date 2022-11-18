import java.util.ArrayList;
import java.util.List;

public class Banco {

	private final String nome;
	private List<Conta> contas = new ArrayList<>();

	public static int qtdeDeContas ;

	public Banco(String nome, List<Conta> contas) {
		this.nome = nome;
		this.contas = contas;
		Banco.qtdeDeContas = contas.size();
	}

	public Banco(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	public void addConta(Conta conta)
	{
		this.contas.add(conta);
	}
	public void removaConta(Conta conta)
	{
		this.contas.remove(conta);
	}


}
