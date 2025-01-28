package kr.co.hanbit.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloByeController {
    @RequestMapping("/")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/bye")
    public String bye() {
        return "<strong>bye</strong>";
    }
}
