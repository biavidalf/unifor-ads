
public class LivroFisico extends Livro implements Desconto {
	
	public LivroFisico(Autor autor) {
		super(autor);
		// TODO Auto-generated constructor stub
	}

	public Double getTotalImpressao() {
		return getPreco()*0.05;
	}

	@Override
	public boolean aplicaDescontoDe(double percentual) {
		if(percentual > 0.30) {
			return false;
		}else {
			setPreco(getPreco() - (getPreco() * percentual));
			return true;
		}
	}
	
}
