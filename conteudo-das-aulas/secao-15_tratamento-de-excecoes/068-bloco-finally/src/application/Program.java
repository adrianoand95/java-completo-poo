package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		File file = new File(
				"H:\\GitHub\\java-completo-poo\\conteudo-das-aulas\\secao-15_tratamento-de-excecoes\\068-bloco-finally\\temp\\in.txt");
		Scanner sc = null;

		try {
			sc = new Scanner(file);

			while (sc.hasNextLine())
				System.out.println(sc.nextLine());

		} catch (IOException e) {
			System.out.println("Error opening file: " + e.getMessage());

		} finally {

			if (sc != null)
				sc.close();

			System.out.println("Finally block executed.");
		}
	}
}
