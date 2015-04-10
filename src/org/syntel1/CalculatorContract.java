package org.syntel1;

import javax.jws.WebMethod;
import javax.jws.WebService;
@WebService
public interface CalculatorContract {
	
	@WebMethod
	public int addition(int number1, int number2);
	@WebMethod
	public int substraction(int number1, int number2);
	@WebMethod
	public int multiplication(int number1, int number2);
	@WebMethod
	public int division(int number1, int number2);


}
