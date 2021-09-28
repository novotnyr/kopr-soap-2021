package sk.upjs.ics.kopr;

import java.util.List;

public class UmbrellaClient {
    public static void main(String[] args) {
        UmbrellaServiceService umbrellaService = new UmbrellaServiceService();
        UmbrellaService servicePort = umbrellaService.getUmbrellaServicePort();
        List<Umbrella> umbrellas = servicePort.list();

        for (Umbrella umbrella : umbrellas) {
            System.out.println(umbrella.getId() + ":" + umbrella.getColor());
        }
    }
}
