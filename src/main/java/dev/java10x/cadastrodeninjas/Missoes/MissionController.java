package dev.java10x.cadastrodeninjas.Missoes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MissionController {
    @GetMapping("Welcome")
    public String welcome(){return "Welcome to the mission controller!";}
}
