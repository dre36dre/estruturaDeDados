//continuar aula 9 -- remover elemento de qualquer posi��o do vetor
//data 20/01/2021


package com.anderson.estruturadados.vetor;

import java.util.Arrays;

public class Vetor {
private String[] elementos;
private int  tamanho;
public Vetor(int capacidade) {
	this.elementos= new String[capacidade];
	this.tamanho=0;
}

public boolean adiciona(String elemento) {
	this.aumentaCapacidade();
	if(this.tamanho < this.elementos.length) {
		this.elementos[this.tamanho]=elemento ;
		this.tamanho++;
	return true;
	}
	return false;	
	}//Adiciona


private void aumentaCapacidade() {
	if(this.tamanho == this.elementos.length) {
		String[] elementosNovos=new String[this.elementos.length * 2];
		for(int i=0;i<this.elementos.length;i++) {
			elementosNovos[i]=elementos[i];
			}
		this.elementos=elementosNovos;
	}
}

public boolean adiciona(int posicao,String elemento) {
	this.aumentaCapacidade();
	if(!(posicao >=0 && posicao <this.tamanho)) {
		throw new IllegalArgumentException("Posi��o invalida");
	}
	for(int i=this.tamanho-1;i>=posicao;i--) {
		this.elementos[i+1]=this.elementos[i];
	}
	this.elementos[posicao]=elemento;
	this.tamanho++;
	return true;
}

	public int tamanho() {
		return this.tamanho;
	}
	@Override
	public String toString() {
		
		StringBuilder s=new StringBuilder();
		s.append("[");
		
		for(int i=0;i <this.tamanho-1;i++) {
			s.append(this.elementos[i]);
			s.append(",");
			}
		if(this.tamanho >0) {
			s.append(this.elementos[this.tamanho-1]);
		}
		s.append("]");
			
		
		return s.toString();
	}
	public String busca(int posicao) {
		if(!(posicao >=0 && posicao < this.tamanho)) {
			throw new IllegalArgumentException("Posi��o inv�lida");
		}
		return this.elementos[posicao];
		}
	
	public int busca(String elemento) {
		for(int i=0;i <this.tamanho;i++) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}
			
	}
		return -1;
	
}
}
