package ro.itschool.Curs21.HomeworksCurs21;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import static ro.itschool.Curs21.HomeworksCurs21.Urgency.HIGH;
import static ro.itschool.Curs21.HomeworksCurs21.Urgency.MEDIUM;

public class Exercise2Main {
    public static void main(String[] args) {
        List<Document> document = List.of(
                new Document("a1b", "Cornel", Status.NEW),
                new Document("c2d", "Marius", Status.IN_PROGRESS),
                new Document("e3f", "Ilasca", Status.FAILED),
                new Document("g4h", "Andrei", Status.NEW),
                new Document("i5j", "Alex", Status.SUCCESS),
                new Document("k6l", "Maria", Status.NEW),
                new Document("m7n", "Claudia", Status.SUCCESS),
                new Document("o8q", "Claudiu", Status.IN_PROGRESS),
                new Document("r9s", "David", Status.FAILED)

        );

        List<Job> job = List.of(
                new Job("t10u", LocalDateTime.now(), LocalDateTime.of(2019, 10, 14, 15, 10), HIGH),
                new Job("v11z", LocalDateTime.now(), LocalDateTime.of(2019, 11, 21, 10, 15), Urgency.MEDIUM),
                new Job("w12x", LocalDateTime.now(), LocalDateTime.of(2019, 8, 27, 0, 0), Urgency.LOW),
                new Job("a13b", LocalDateTime.now(), LocalDateTime.of(2020, 3, 8, 7, 0), HIGH),
                new Job("c14d", LocalDateTime.now(), LocalDateTime.of(2019, 8, 21, 0, 0), Urgency.MEDIUM),
                new Job("e15f", LocalDateTime.now(), LocalDateTime.of(2019, 12, 21, 15, 10), Urgency.LOW)

        );
        System.out.println(document);
        List<String> idSucceded = document.stream()
                .filter(document1 -> document1.getStatus().equals(Status.SUCCESS))
                .map(document1 -> document1.getDocumentId())
                .collect(Collectors.toList());
        System.out.println(idSucceded);

        List<String> idDueTomorrow = job.stream()
                .filter(job1 -> job1.getDeadline().isBefore(LocalDateTime.now().plusDays(1)))
                .map(job1 -> job1.getDocumentId())
                .collect(Collectors.toList());
        System.out.println(idDueTomorrow);

        List<String> idDueWeek = job.stream()
                .filter(job1 -> job1.getDeadline().isBefore(LocalDateTime.now().plusDays(7)))
                .map(job1 -> job1.getDocumentId())
                .collect(Collectors.toList());
        System.out.println(idDueWeek);

        job.stream()
                .filter(job1 -> job1.getDeadline().isBefore(LocalDateTime.now().plusDays(1)))
                .forEach(job1 -> job1.setUrgency(HIGH));

        job.stream()
                .filter(job1 -> job1.getDeadline().isBefore(LocalDateTime.now().plusDays(7)))
                .forEach(job1 -> job1.setUrgency(MEDIUM));
    }
}
