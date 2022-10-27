
public class Ebook extends Livro implements Desconto {
	private String MarcaDagua;
	
	public Ebook(Autor autor) {
		super(autor);
		// TODO Auto-generated constructor stub
	}

	public String getMarcaDagua() {
		return MarcaDagua;
	}
	public void setMarcaDagua(String marcaDagua) {
		MarcaDagua = marcaDagua;
	}
	
	@Override
	public boolean aplicaDescontoDe(double percentual) {
		if(percentual > 0.15) {
			return false;
		}else {
			setPreco(getPreco() - (getPreco() * percentual));
			return true;
		}
	}
}
