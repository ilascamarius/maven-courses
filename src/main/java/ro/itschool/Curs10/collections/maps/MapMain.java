package ro.itschool.Curs10.collections.maps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMain {

    public static void main(String[] args) {
        Map<String, String> mapString = new HashMap<>();
        mapString.put("host", "localhost");
        mapString.put("username", "testuser");
        mapString.put("password", "pass123");

        System.out.println(mapString);

        for (String key : mapString.keySet()) {
            System.out.println(key + "=" + mapString.get(key));
        }

        for (String value : mapString.values()) {
            System.out.println(value);
        }

        Map<String, List<String>> mapList = new HashMap<>();
        mapList.put("V. Alex", List.of("Ion", "Gheo", "Test"));
        mapList.put("str.Mihai E", List.of("Maria", "Ana", "Adi"));

        System.out.println(mapList);
        System.out.println(mapList.get("V. Alex"));
    }
}
