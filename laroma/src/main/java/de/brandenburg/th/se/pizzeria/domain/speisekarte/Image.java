package de.brandenburg.th.se.pizzeria.domain.speisekarte;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Image {
    private String dateipfad;

    public Image(String dateipfad) {
        this.dateipfad = dateipfad;
    }

    public byte[] laden() throws IOException {
        Path path = Paths.get(dateipfad);
        return Files.readAllBytes(path);
    }
}
