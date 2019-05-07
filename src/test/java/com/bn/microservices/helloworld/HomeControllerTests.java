package com.bn.microservices.helloworld;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.core.env.Environment;

import com.bn.microservices.helloworld.controller.HomeController;

public class HomeControllerTests {
	
	String serverPort= "9501";
	
	@InjectMocks
	private HomeController sc;
	
	@Mock
	private Environment environment;
	
	@Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
	
	@Test
	public void testindex() {
    	
		when(environment.getProperty("local.server.port")).thenReturn(serverPort);		
		assertEquals("Hello World! "+serverPort,sc.index());
	}

}
