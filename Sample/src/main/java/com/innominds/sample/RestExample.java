package com.innominds.sample;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestExample {

	@RequestMapping("/hello")
	public String welcome(){
		return "welcome to innnominds";
	}
	
	@RequestMapping("/hello/{person}")
	public Message message(@PathVariable String person){
		
		Message msg=new Message(person,"hello"+person);
		return msg;
		
		
		
	}
}
