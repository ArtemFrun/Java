package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	/*
	*   Есть два вида работников на фирме: почасовики и ставочники
	*   Подсчитать общую зарплату за месяц
	*   Кто более выгребает денег
	*   Почасовики или ставочники?
	*   Использовать все навыки и знания Джавы.
	*/

		WorkerFullTime john = new WorkerFullTime("John", 2000);
		WorkerFullTime paul = new WorkerFullTime("Paul", 1760);

		WorkerPertTime george = new WorkerPertTime("George", 10, 150);
		WorkerPertTime ringo = new WorkerPertTime("Ringo", 8, 110);
		WorkerPertTime freddie = new WorkerPertTime("Ringo", 25, 80);

		List<IAccounting> band = new ArrayList<>();

		band.add(john);
		band.add(paul);
		band.add(george);
		band.add(ringo);
		band.add(freddie);

		System.out.println(band.stream().mapToDouble(IAccounting::getSalary).sum());

		double fullWorkerSalary = band.stream()
				.filter(worker -> worker instanceof WorkerFullTime)
				.mapToDouble(IAccounting::getSalary).sum();

		System.out.println(fullWorkerSalary);

		double pertSalary = band.stream()
				.filter(worker -> worker instanceof WorkerPertTime)
				.mapToDouble(IAccounting::getSalary).sum();

		System.out.println(pertSalary);

		System.out.println(band.stream().filter(worker -> worker instanceof WorkerFullTime)
				.mapToDouble(IAccounting::getSalary).sum() > band.stream()
				.filter(worker -> worker instanceof WorkerPertTime)
				.mapToDouble(IAccounting::getSalary).sum() ? "Ставочники" : "Почасовики");


	/*
	*	Есть два вида конфет
	*	на развес(фасованные) и в коробках
	*	Подсчитать общею возможную выручку
	*/

		CandyBox candy1 = new CandyBox("candy1", 200, false, 76);
		CandyBox candy2 = new CandyBox("candy2", 150, true, 95);
		CandyBox candy3 = new CandyBox("candy3", 250, false, 80);
		PackagedCandy candy4 = new PackagedCandy("candy4", 250, 175);
		PackagedCandy candy5 = new PackagedCandy("candy5", 200, 210);
		PackagedCandy candy6 = new PackagedCandy("candy6", 250, 135);

		List<IMarket> candyInStock = new ArrayList<>();

		candyInStock.add(candy1);
		candyInStock.add(candy2);
		candyInStock.add(candy3);
		candyInStock.add(candy4);
		candyInStock.add(candy5);
		candyInStock.add(candy6);

		Random random = new Random();

		List<IMarket> candiesSold = new ArrayList<>();

		for (int i = 0; i < 20; i++) {
			candiesSold.add(candyInStock.get(random.nextInt(5)));
		}

		double allSalesCandy = candiesSold.stream().mapToDouble(IMarket::getPrice).sum();
		System.out.println(allSalesCandy);

		double salesCandyBox = candiesSold.stream().filter(candy -> candy instanceof CandyBox)
				.mapToDouble(IMarket::getPrice).sum();

		System.out.println(salesCandyBox);

		double salesPackagedCandy = candiesSold.stream().filter(candy -> candy instanceof PackagedCandy)
				.mapToDouble(IMarket::getPrice).sum();

		System.out.println(salesPackagedCandy);

		System.out.println(candiesSold.stream().filter(candy -> candy instanceof PackagedCandy)
				.mapToDouble(IMarket::getPrice).sum() > candiesSold.stream().
				filter(candy -> candy instanceof CandyBox)
				.mapToDouble(IMarket::getPrice).sum() ? "PackagedCandy" : "CandyBox");
    }
}
