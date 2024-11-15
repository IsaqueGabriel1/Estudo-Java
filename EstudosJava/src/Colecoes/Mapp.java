package Colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapp {
	public static void main(String[] args) {
		Map<Integer,String> usuario = new HashMap<>();
		
		usuario.put(1, "Roberto");
		usuario.put(2, "Gabriel");
		usuario.put(3, "REis");
		
		
		System.out.println(usuario);
		System.out.println(usuario.size());
	}
}
