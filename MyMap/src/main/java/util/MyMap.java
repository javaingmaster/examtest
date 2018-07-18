package util;

import java.util.ArrayList;
import java.util.List;

public class MyMap<K,V> {
	private K key;
	private V value;
	private List<K> K_arr;
	private List<V> V_arr;

	public MyMap(){

	}

	public K add(K k){
		System.out.println(k);
		return k;
	}
}
