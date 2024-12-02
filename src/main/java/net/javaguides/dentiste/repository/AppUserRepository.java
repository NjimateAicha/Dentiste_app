package net.javaguides.dentiste.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.dentiste.model.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, Integer>{
     public AppUser findByUsername(String username);
     public  AppUser findByEmail(String email);


}
