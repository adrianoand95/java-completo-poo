package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {

	public static void main(String[] args) {

		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));

		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));

		System.out.println("Total area: " + totalArea(myCircles));
	}

	// NOTA 1: SOLU??ES IMPR?PRIAS:
	// public static double totalArea(List<Shape> list) {
	// public static double totalArea(List<?> list) {

	public static double totalArea(List<? extends Shape> list) {

		// NOTA 2: N?O CONSEGUIREMOS ADICIONAR ELEMENTOS NA LISTA DO M?TODO
		// list.add(new Rectangle(3.0, 4.0)); // ERRO DE COMPILA??O

		double sum = 0.0;

		for (Shape s : list)
			sum += s.area();

		return sum;
	}
}
