package sk.upjs.ics.kopr;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.util.Arrays;
import java.util.List;

@WebService
public class UmbrellaService {
    public List<Umbrella> list() {
        Umbrella umbrella = new Umbrella(1L, "zelená");
        Umbrella umbrella2 = new Umbrella(2L, "žltá");

        return Arrays.asList(umbrella, umbrella2);
    }

    public static void main(String[] args) {
        UmbrellaService service = new UmbrellaService();

        System.out.println("Server bezi");

        Endpoint.publish("http://localhost:8888/umbrellas", service);
    }
}
