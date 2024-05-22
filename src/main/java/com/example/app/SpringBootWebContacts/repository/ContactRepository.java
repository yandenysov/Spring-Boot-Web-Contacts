package com.example.app.SpringBootWebContacts.repository;

import com.example.app.SpringBootWebContacts.entity.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// @Repository - варіант @Component,
// який повідомляє Spring, що це компонент,
// яким має керувати контейнер IoC.
// Зокрема, репозиторії призначені визначення
// логіки для шару збереження.
//
// Розширення CrudRepository приймає клас сутності,
// а також тип даних ID, який він повинен використовувати
// для запиту.
//
// CrudRepository оголошує методи, які становлять
// базову функціональність CRUD репозиторію.
// https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/repository/CrudRepository.htmll
@Repository
public interface ContactRepository extends CrudRepository<Contact, Integer> {

}
