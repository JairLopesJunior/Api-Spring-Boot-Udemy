package api.spring.boot.udemy.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/clientes")
public class ClienteController {

    @RequestMapping(value = "/hello/{nome}",
                    method = RequestMethod.GET,
                    consumes = {"application/json","application/xml"},
                    produces = {"application/json","application/xml"})
    @ResponseBody
    public String hello(@PathVariable("nome") String nomeCliente){
        return String.format("Hello %s", nomeCliente);
    }
}
