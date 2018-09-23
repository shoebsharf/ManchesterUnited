package com.example.manchesterunited.repositories;
import com.example.manchesterunited.models.AdminLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<AdminLogin, Integer> {


}
