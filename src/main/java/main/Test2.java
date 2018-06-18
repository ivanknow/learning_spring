package main;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@Configuration
@ComponentScan(basePackages="main")
class JavaScan{
	
}

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=JavaScan.class)
public class Test2 {
	@Autowired
	GoodLifeService service;
	
	@Autowired
	@Qualifier(value="goodTimeService")
	HiInterface goodTimeService;
		
 @Test
 public  void  testMain() {
	 service.hello();
}
}
