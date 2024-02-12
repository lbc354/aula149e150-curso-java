package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class ReadingDate {
	public static void main(String[] args) throws ParseException {
//		essa classe existe apenas para mostrar maneiras de ler data
//		descomenta pra ver outra forma
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter date: ");
//		String data = sc.nextLine();
		
//		no código comentado pode escrever:
//		10/02/2024
//		ou:
//		10 02 2024

//		String day = data.substring(0, 2);
//		String month = data.substring(3, 5);
//		String year = data.substring(6, 10);
//
//		System.out.println("Day: " + day);
//		System.out.println("Month: " + month);
//		System.out.println("Year: " + year);
//		
//		LocalDate contractDate = LocalDate.parse(year + "-" + month + "-" + day);
//		System.out.println("Type 1: " + contractDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = sdf.parse(sc.nextLine());
		System.out.println("Type 2: " + date);
		
//		para conversões:
//		https://dicasdeprogramacao.com.br/java-como-converter-localdate-e-localdatetime-em-date-e-vice-versa/
		System.out.println("Type 3: (Date to LocalDate) " + date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
		
		sc.close();
	}
}