package ro.itschool.Curs13.Homeworks.Exercise30;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExamResultReader {
    private final List<ExamResult> examResults;

    public ExamResultReader(String file) throws IOException {
        this.examResults = fetchDocument(file);
        File file = new File("src/main/resources/exam-result.in");
    }

    private List<ExamResult> fetchDocument(String file) throws IOException {
        List<ExamResult> result = new ArrayList<>();
        BufferedReader bfr = new BufferedReader(new FileReader(file));
    }

}
