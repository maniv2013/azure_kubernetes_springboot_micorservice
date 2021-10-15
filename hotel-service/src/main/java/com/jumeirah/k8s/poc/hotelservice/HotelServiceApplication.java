package com.jumeirah.k8s.poc.hotelservice;

import ch.sbb.esta.openshift.gracefullshutdown.GracefulshutdownSpringApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class HotelServiceApplication {

	public static void main(String[] args) {
		GracefulshutdownSpringApplication.run(HotelServiceApplication.class, args);
		//SpringApplication.run(HotelServiceApplication.class, args);
	}


}
