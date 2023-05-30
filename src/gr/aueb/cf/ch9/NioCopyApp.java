package gr.aueb.cf.ch9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioCopyApp {
    public static void main(String[] args) {
        byte [] videoBytes;
        Path sourcePath = Paths.get("C:/tmp/trailer(2).mp4") ;
        Path targetFile = Paths.get("C:/tmp/trailerout.mp4") ;

        try {
            videoBytes = Files.readAllBytes(sourcePath);
            Files.write(targetFile, videoBytes);

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
