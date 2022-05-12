package br.com.faixanumerica.entidades;

import java.io.IOException;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//CreateRange create = new CreateRange();
		
		
		String cn = JOptionPane.showInputDialog("Digite CN");
		
		
		if(cn == null) {
			System.out.println("Nulo");
			
			
		}
		
		if(cn.getClass().getSimpleName() == "String") {
			System.out.println("Tipo String");
		}
	
		
		
		System.out.println(cn);

	}

}
