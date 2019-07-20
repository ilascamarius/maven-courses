package ro.itschool.Curs14.reader;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import ro.itschool.Curs14.DocSource;
import ro.itschool.Curs14.Document;

import java.util.List;

public class RestDocSource implements DocSource {

    @Override
    public List<Document> getDocuments() {
        //return null;
        return new RestTemplate().exchange(
                "http://10.0.0.101:8080/documents",
                HttpMethod.GET, new HttpEntity<>(null),
                new ParameterizedTypeReference<List<Document>>() {
                }).getBody();
    }
}
