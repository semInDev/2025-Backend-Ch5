package kr.co.hanbit.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FormController {
    @RequestMapping("/article")
    public String article(@RequestParam("title") String t,
                          @RequestParam("content") String c) {
        return t+": "+c;
    }
}
