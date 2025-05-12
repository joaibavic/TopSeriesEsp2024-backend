
package com.joaibavic.topseriesesp2024;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/series")
@CrossOrigin(origins = "*")
public class SerieControlador {

    @GetMapping
    public List<Serie> obtenerSeries() {
        return List.of(
            new Serie("La Casa de Papel", "Netflix", "https://via.placeholder.com/320x180?text=La+Casa+de+Papel", 1, "https://youtube.com", "Acción", "general"),
            new Serie("Antidisturbios", "Movistar+", "https://via.placeholder.com/320x180?text=Antidisturbios", 2, "https://youtube.com", "Drama", "general"),
            new Serie("El Ministerio del Tiempo", "La 1", "https://via.placeholder.com/320x180?text=Ministerio+del+Tiempo", 3, "https://youtube.com", "Ciencia ficción", "general")
        );
    }
}
