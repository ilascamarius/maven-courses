package ro.itschool.Curs14;

import ro.itschool.Curs14.writer.DocWriter;

import java.io.IOException;
import java.util.UUID;

public class Main {
    public static void main(String[] args) throws IOException {
        DocWriter writer = new DocWriter("src/main/resources/docs.out");
        for (int i = 0; i < 1000; i++) {
            writer.write(new Document(UUID.randomUUID().toString(), "content" + i, "name" + i));
            writer.close();
        }
        writer.close();
    }

}
