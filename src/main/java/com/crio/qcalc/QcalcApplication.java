package com.crio.qcalc;

// import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		//SpringApplication.run(QcalcApplication.class, args);
		// System.out.println("Hello world");
		StandardCalculator calc = new StandardCalculator();
		calc.multiply(Double.MAX_VALUE, Double.NEGATIVE_INFINITY);
		calc.printResult();
		// LogicCalculator calc = new LogicCalculator();
		// calc.AND(5,7);
		// calc.printResult();


	}

}
