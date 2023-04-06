package theory.java.source;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * packageName    : theory.java.source
 * fileName       : Ex3
 * author         : caprocoo
 * date           : 2023-04-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-04-06        caprocoo       최초 생성
 */
public class Ex3 {
    public static void main(String[] args) throws IOException {
        String json = "[{\"cnt\":2,\"rezDate\":\"20230407\",\"code\":\"001\",\"name\":\"자율주행 단말기(OBU)\",\"price\":\"100000\"},{\"cnt\":3,\"rezDate\":\"20230407\",\"code\":\"002\",\"name\":\"군집주행 단말기(OBU)\",\"price\":\"100000\"}]";

        ObjectMapper mapper = new ObjectMapper();
        List<Map<String, Object>> list = mapper.readValue(json, List.class);
        
        for (Map<String, Object> map : list) {
            System.out.println("cnt: " + map.get("cnt"));
            System.out.println("rezDate: " + map.get("rezDate"));
            System.out.println("code: " + map.get("code"));
            System.out.println("name: " + map.get("name"));
            System.out.println("price: " + map.get("price"));
            System.out.println();
        }
    }
}
