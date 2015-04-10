package org.syntel1;

import javax.xml.ws.Endpoint;

public class Publish {

	public static void main(String[] args) {
		System.out.println("before");
		Endpoint.publish("http://localhost:6633/Cal.com/calc", new Calcu());
System.out.println("after");
	}

}
