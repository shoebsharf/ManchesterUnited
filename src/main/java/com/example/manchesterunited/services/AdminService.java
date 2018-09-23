package com.example.manchesterunited.services;
import com.example.manchesterunited.models.AdminLogin;
import com.example.manchesterunited.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@Service
public class AdminService {
    @Autowired
    AdminRepository adminRepository;
    public AdminLogin createAdmin(AdminLogin login){
        return adminRepository.save(login);
    }
    public AdminLogin updateAdmin(AdminLogin login){
        return adminRepository.save(login);
    }
    public void deleteAdmin(AdminLogin login){
        adminRepository.delete(login);

    }
   /* public AdminLogin getadmin(AdminLogin login) {
        return (AdminLogin) adminRepository.toString(login.getUserName() + login.getPassword());
    }*/
    public List<AdminLogin> getAllLogins(){
        List<AdminLogin> list = new ArrayList<>();
        adminRepository.findAll().forEach(new Consumer<AdminLogin>() {
            @Override
            public void accept(AdminLogin login) {
                list.add(login);
            }
        });
        return list;
    }
}
