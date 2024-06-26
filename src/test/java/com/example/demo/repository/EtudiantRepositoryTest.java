package com.example.demo.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.demo.model.Etudiant.Etudiant;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class EtudiantRepositoryTest {

    @Autowired
    private EtudiantRepository repository;

    @Test
    public void testCreateReadDelete() {
        Etudiant etudiant = new Etudiant();
        etudiant.setName("Test Name");
        etudiant.setAge(25);

        repository.save(etudiant);

        Iterable<Etudiant> etudiants = repository.findAll();
        assertTrue(etudiants.iterator().hasNext());

        repository.deleteAll();
        assertFalse(repository.findAll().iterator().hasNext());
    }
}
