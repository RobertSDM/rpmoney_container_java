package rpmoney.DimMoneyAppRM552520.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {

    @GetMapping
    public String sendMessage() {
        return "Deploy efetuado com sucesso no Servidor Tomcat10";
    }
}
