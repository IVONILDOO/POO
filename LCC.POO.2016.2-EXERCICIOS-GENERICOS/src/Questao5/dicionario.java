package Questao5;

import java.util.ArrayList;
import java.util.List;

public class dicionario<K,V> {
	
	private List<K> list1;
	private List<V> list2;

	public dicionario(){
		list1 = new ArrayList<K>();
		list2 = new ArrayList<V>();
	}
	public void add(K chav, V valor){
		list1.add(chav);
		list2.add(valor);
	}
	
	public V getValor(K chav){
		for(int k=0;k<list1.size();k++){
			if(chav==list1.get(k)){
				return list2.get(k);
			}
		}
		return null;
	}
	public int getQuantidade(){
		return list2.size();
	}
}