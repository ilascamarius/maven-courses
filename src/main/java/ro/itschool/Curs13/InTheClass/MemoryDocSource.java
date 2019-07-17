package ro.itschool.Curs13.InTheClass;

import java.util.List;

public class MemoryDocSource implements DocSource {
    @Override
    public List<Document> getDocuments() {
        return List.of(
                new Document("1q2", "Ilasca", "Content1"),
                new Document("3b4", "Marius", "Content2"),
                new Document("5c6", "Cornel", "Content3")
        );
    }

}
