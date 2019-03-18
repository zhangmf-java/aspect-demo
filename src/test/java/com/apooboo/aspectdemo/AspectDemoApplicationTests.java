package com.apooboo.aspectdemo;

import com.apooboo.aspectdemo.domain.Product;
import com.apooboo.aspectdemo.security.CurrentUserHolder;
import com.apooboo.aspectdemo.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AspectDemoApplicationTests {

	@Autowired
	ProductService productService;

	@Test
	public void contextLoads() {
	}

	@Test(expected = Exception.class)
	public void annoInsertTest(){
		CurrentUserHolder.set("Tom");
		productService.insert(new Product());
	}

	@Test
	public void adminInsertTest(){
		CurrentUserHolder.set("admin");
		productService.insert(new Product());
	}

}
