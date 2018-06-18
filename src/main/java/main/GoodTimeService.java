package main;

import org.springframework.stereotype.Component;

@Component
public class GoodTimeService implements HiInterface{

	public void hello() {
		System.out.println("Hello Time");
	}
}
