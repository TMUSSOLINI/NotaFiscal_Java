package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Produto> list = new ArrayList<>();
		
		System.out.println("Bem vindo ao Mercado!!");
		System.out.println("Insira suas compras: ");
		
		System.out.print("Nome do produto: ");
		String nome = sc.nextLine();
		System.out.print("Marca do produto: ");
		String marca = sc.nextLine();
		System.out.print("Preco do produto: ");
		Double preco = sc.nextDouble();
		System.out.println("Quantidade: ");
		Integer quantidade = sc.nextInt();
		
		
		Produto produto = new Produto(nome, marca, preco, quantidade);
		list.add(produto);
		
		System.out.println("Deseja encerrar a operação? (y/n): ");
		char options = sc.next().charAt(0);
		
		while (options != 'n') {
			System.out.print("Nome do produto: ");
			nome = sc.nextLine();
			System.out.print("Marca do produto: ");
			marca = sc.nextLine();
			System.out.print("Preco do produto: ");
			preco = sc.nextDouble();
			System.out.println("Quantidade: ");
			quantidade = sc.nextInt();
			
			produto = new Produto(nome, marca, preco, quantidade);
			list.add(produto);
		}
		sc.close();

	}

}
