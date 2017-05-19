package Questao4;

public class codigo<T, M> {

	private T codigo1;
	private M codigo2;

	public codigo(T cod1, M cod2) {
		this.codigo1 = cod1;
		this.codigo2 = cod2;
	}

	public codigo<T, M> getCodigo() {
		return new codigo<T, M>(codigo1, codigo2);
	}

	public void setCodigo(T cod1, M cod2) {
		this.codigo1 = cod1;
		this.codigo2 = cod2;
	}

	public String toString() {
		return this.codigo1 + "" + this.codigo2;
	}
}
