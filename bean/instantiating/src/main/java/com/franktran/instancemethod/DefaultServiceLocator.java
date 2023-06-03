package com.franktran.instancemethod;

public class DefaultServiceLocator {
  private static ClientService clientService = new ClientServiceImpl();

  public ClientService createClientServiceInstance() {
    return clientService;
  }
}
