package Questao1;

public class Par<Obj1, Obj2> {
	private Obj1 r;
	private Obj2 t;

	public Par(Obj1 r, Obj2 t) {
		this.r = r;
		this.t = t;
	}
	
	public String toString(){
		return this.r+"\n"+this.t;
	}
	
	public Obj1 getObj1(){
		return r;
	}
	
	public void setObj1(Obj1 r){
		this.r = r;
	}
	
	public Obj2 getObj2(){
		return t;
	}
	
	public void setObj2(Obj2 t){
		this.t = t;
	}

}
