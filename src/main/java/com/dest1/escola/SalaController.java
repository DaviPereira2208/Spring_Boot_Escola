package com.dest1.escola;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class SalaController {

        @GetMapping("sala")
        public Sala mostrar(){
            Sala sala = new Sala("A07", "Front, Back, Banco", 40, 7);
            return sala;
        }
}
