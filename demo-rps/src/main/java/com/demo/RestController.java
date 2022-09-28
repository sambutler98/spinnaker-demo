package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class RestController {

    @GetMapping("/rock")
    public @ResponseBody String rockPlayed() {
        String b = "Scissors";
        int result = new Random().nextInt(3);

        if(result == 0) {
            b = "Rock";
        } else if (result == 1) {
            b = "Paper";
        } else if (result == 2){
            b = "Scissors";
        }

        Answer ans = new Answer("Rock", b);
        return ans.toString();
    }

    @GetMapping("/paper")
    public @ResponseBody String paperPlayed() {
        String b = "Scissors";
        int result = new Random().nextInt(3);

        if(result == 0) {
            b = "Rock";
        } else if (result == 1) {
            b = "Paper";
        } else if (result == 2){
            b = "Scissors";
        }

        Answer ans = new Answer("Paper", b);
        return ans.toString();
    }

    @GetMapping("/scissors")
    public @ResponseBody String scissorsPlayed() {
        String b = "Scissors";
        int result = new Random().nextInt(3);

        if(result == 0) {
            b = "Rock";
        } else if (result == 1) {
            b = "Paper";
        } else if (result == 2){
            b = "Scissors";
        }

        Answer ans = new Answer("Scissors", b);
        return ans.toString();
    }
}
