package tech.kikutaro.hello;

import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloApplication {

	@CrossOrigin
	@GetMapping
	public List<Hello> hello() {
		Hello hello1 = new Hello("hello");
		Hello hello2 = new Hello("こんにちは");
		List<Hello> listHello = new ArrayList<>();
		listHello.add(hello1);
		listHello.add(hello2);
		return listHello;
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}
}
