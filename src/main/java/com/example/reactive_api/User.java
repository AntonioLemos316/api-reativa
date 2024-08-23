package com.example.reactive_api;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

// @Table nome da tabela na DB
@Table("users")
// @Id é o id dentro da tabela
public record User(@Id Long id, String username, String password, String email) {

}
