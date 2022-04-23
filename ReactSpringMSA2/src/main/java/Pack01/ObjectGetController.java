package Pack01;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@Setter
@Getter
class Person{
	String name;
	int age;
}

@RestController
@RequestMapping("/Object")
public class ObjectGetController {
	@PostMapping("/objectN")
	public Person f1(@PathVariable String objectN) {
		System.out.println(objectN);
		
		
			System.out.println("Dpp Controller");
			Person person = new Person();
			person.setName("홍길동");
			person.setAge(99);
			return person;
		}
		
		
	}

