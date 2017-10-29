package hello;

import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello-world")
public class HelloWorldController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(method=RequestMethod.GET)
    public @ResponseBody Greeting sayHello(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
    	System.out.println("Before Loop" + new Date());
    	long startTime = System.nanoTime();
    	for(int i=0; i<10000; i++){
        	
        }	
    	long endTime = System.nanoTime();
    	long duration = (endTime - startTime);
    		System.out.println("After Loop"+ duration);
    		
    		Greeting greet = new Greeting(counter.incrementAndGet(), String.format(template, name));
    		greet.testCall();
    	return greet;
    }

}
