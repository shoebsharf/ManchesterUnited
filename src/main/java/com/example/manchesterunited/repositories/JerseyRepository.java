package com.example.manchesterunited.repositories;
import com.example.manchesterunited.models.Jersey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JerseyRepository extends JpaRepository<Jersey, Integer> {
}
