package org.syntel1;

import javax.jws.WebMethod;
import javax.jws.WebService;
@WebService(endpointInterface="org.syntel1.CalculatorContract")
public class Calcu implements CalculatorContract {
	@Override
	@WebMethod
	public int addition(int number1 , int number2)
	{
		System.out.println("Addition");
		return number1 + number2;
	}
	
	@Override
	@WebMethod
	public int substraction(int number1 , int number2)
	{
		System.out.println("Substraction");
		return number1 - number2;

	}

	@Override
	public int multiplication(int number1, int number2) {
	System.out.println("hello");
		return number1 * number2;
	}

	@Override
	public int division(int number1, int number2) {
		return number1 / number2;
	}
}
