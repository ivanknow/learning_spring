package main;

import org.springframework.stereotype.Component;

@Component
public class GoodLifeService implements HiInterface{

	public void hello() {
		System.out.println("Hello Life");
	}
}
