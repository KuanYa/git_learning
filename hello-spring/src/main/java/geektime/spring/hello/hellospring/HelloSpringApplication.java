package geektime.spring.hello.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

@SpringBootApplication
@RestController
public class HelloSpringApplication {

	public static void main(String[] args) {
		System.out.println(Math.rint(-15.61));
		"".toString();

//		SpringApplication.run(HelloSpringApplication.class, args);
	}

//	@RequestMapping("/hello")
//	private String hello(){
//		return "Hello Spring";
//	}


}
