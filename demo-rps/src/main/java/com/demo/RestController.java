package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class RestController {

    @GetMapping("/rock")
    public @ResponseBody Answer rockPlayed() {
        String b;
        Random r = new Random();
        int low = 1;
        int high = 3;
        int result = r.nextInt(high-low) + low;

        if(result == 1) {
            b = "Rock";
        } else if (result == 2) {
            b = "Paper";
        } else {
            b = "Scissors";
        }

        Answer ans = new Answer("Rock", b);
        return ans;
    }
}
