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
		System.out.print("Quantidade: ");
		Integer quantidade = sc.nextInt();
		
		
		Produto produto = new Produto(nome, marca, preco, quantidade);
		list.add(produto);
		
		System.out.print("Deseja encerrar a operação? (y/n): ");
		char options = sc.next().charAt(0);
		sc.nextLine();
		
		while (options != 'y') {
			System.out.print("Nome do produto: ");
			nome = sc.nextLine();
			System.out.print("Marca do produto: ");
			marca = sc.nextLine();
			System.out.print("Preco do produto: ");
			preco = sc.nextDouble();
			System.out.print("Quantidade: ");
			quantidade = sc.nextInt();
			
			produto = new Produto(nome, marca, preco, quantidade);
			list.add(produto);
			System.out.print("Deseja encerrar a operação? (y/n): ");
			options = sc.next().charAt(0);
			sc.nextLine();
		}
		
		double total = 0;
		double valorQuantidade = 0;
		int i =0;
		
		for (Produto prod:list) {
			System.out.printf(i + " -- " + prod.getNome() + " -- " + prod.getQuantidade() + "un -- R$: %.2f%n", prod.getPreco());
			System.out.println("------------------------");
			valorQuantidade = prod.getPreco() * prod.getQuantidade();
			total += valorQuantidade;
			i ++;
		}
		System.out.printf("Total:      R$: %.2f%n", total);
		sc.close();

	}

}
