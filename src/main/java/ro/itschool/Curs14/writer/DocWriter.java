package ro.itschool.Curs14.writer;

import ro.itschool.Curs14.Document;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DocWriter {
    private final String path;
    private BufferedWriter writer;
    private boolean opened;

    public DocWriter(String path) throws IOException {
        this.writer = new BufferedWriter(new FileWriter(path));
        this.opened = true;
        this.path = path;
    }

    public void write(Document document) throws IOException {
        if (!opened) {
            writer = openWithAppend();
        }
        writer.write(document.getDocumentId() + "|" + document.getName() + "|" + document.getContent());
        writer.newLine();
        writer.flush();
    }

    public void close() throws IOException {
        opened = false;
        writer.close();
    }

    private BufferedWriter openWithAppend() throws IOException {
        return new BufferedWriter(new FileWriter(path, true));
    }


   /* public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/resources/out.txt"));
        writer.write("Hello my file!");
        //La fiecare scriere trebuie dat close!!!
        writer.close();
        writer.flush();
    }*/
}
