package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.fiap.beans.Cargo;

public class TesteList {

	public static void main(String[] args) {
		List<Cargo> cargos = new ArrayList<Cargo>();
		cargos.add(new Cargo("DBA","JUNIOR",3000));
		cargos.add(new Cargo("ESTAGIARIO", "SENIOR",2000));
		cargos.add(new Cargo("FRONT","PLENO",5000));
		cargos.add(new Cargo("ESTAGIARIO", "JUNIOR",0));
		
		
		// Busca por índice:
		System.out.println(cargos.get(2));
		// Ordenar uma lista:
		Collections.sort(cargos);
		for(Cargo c : cargos) {
		System.out.println(c.getNome());
		System.out.println(c.getNivel());
		System.out.println(c.getSalario());
		}
		}

}
