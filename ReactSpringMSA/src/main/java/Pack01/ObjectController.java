package Pack01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Setter
@Getter
class Person{
	String name;
	int age;
}


@RestController
@RequestMapping("/Object")
public class ObjectController {
	@GetMapping("/{objectN}") //받을 때 get axios는 보낼 때 기준>? RestTemplate는 함수에 따라 다름
	public String f1(@PathVariable String objectN) {
		System.out.println(objectN);
		
		
		RestTemplate rt = new RestTemplate();
		Person person = rt.getForObject( //객체를 결과로
				"http://localhost:8082/ObjectGet/2000" ,
				Person.class
				);//리턴 값이 String
		
		return "BppController" + objectN;
	}
}
