package ch.abickerton.spring.stuntdouble;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/")
public class HelloController {
  @GetMapping("/")
  public String greet(){
    return "Hello, I'm sorry, I didn't catch your name.";
  }

  @GetMapping("/{name}")
  public String greet( @PathVariable("name") Optional<String> name ){
    return "Hello, "+ name.orElse( "I'm sorry.");
  }
}
