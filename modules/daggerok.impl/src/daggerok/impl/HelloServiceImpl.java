package daggerok.impl;

import daggerok.api.HelloService;
import static java.lang.String.format;

public class HelloServiceImpl implements HelloService {

  @Override
  public String hi(final String name) {
    return format("hello, %s", name);
  }
}
