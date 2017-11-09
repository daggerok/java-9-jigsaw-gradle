package daggerok.config;

import daggerok.api.HelloService;
import daggerok.impl.HelloServiceImpl;

public class HelloFactory {

  private static final HelloService SERVICE_INSTANCE = new HelloServiceImpl();

  public static HelloService createService() {
    return SERVICE_INSTANCE;
  }
}
