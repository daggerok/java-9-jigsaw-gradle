package daggerok;

import daggerok.api.HelloService;
import daggerok.config.HelloFactory;

public class Main {

  public static void main(String[] args) {
    final HelloService service = HelloFactory.createService();
    System.out.println(service.hi("Maksimko"));
  }
}
