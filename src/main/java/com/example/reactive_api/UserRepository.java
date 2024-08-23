package com.example.reactive_api;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

// Repository para criar e consultar os dados na DB
// Na interface passamos um generic com a entidade User e seu tipo Long
// Modificamos para a versão reativa
public interface UserRepository extends ReactiveCrudRepository<User, Long>{
    
}
