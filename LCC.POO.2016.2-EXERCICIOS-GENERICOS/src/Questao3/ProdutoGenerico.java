package Questao3;

public class ProdutoGenerico<T, E> {
	private T codigo;
	private String descricao;
	private E preco;

	public ProdutoGenerico(T cod, String descr, E pr) {
		codigo = cod;
		descricao = descr;
		preco = pr;
	}

	public T getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public E getPreco() {
		return preco;
	}

	@Override
	public String toString() {
		return "ProdutoG{" + "Codigo = " + codigo + ",descricao = " + descricao + ",preco = " + preco + "}";
	}
}