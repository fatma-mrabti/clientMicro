package com.ms.services;

import com.ms.entities.Client;

public interface ClientService {
    Client save(Client client);
    Client getById(Long id);

}