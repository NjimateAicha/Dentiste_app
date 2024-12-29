package net.javaguides.dentiste.repository;

import net.javaguides.dentiste.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    // Find by cardId (should return unique result since cardId is unique)
    Optional<Patient> findByCardId(String cardId);
    
    // Find by name and/or lastname
    List<Patient> findByName(String name);
    List<Patient> findByLastname(String lastname);
    List<Patient> findByNameAndLastname(String name, String lastname);
    
    // Find by phone number
    Optional<Patient> findByPhoneNumber(String phoneNumber);
    
    // Search patients with containing patterns (case-insensitive)
    List<Patient> findByNameContainingIgnoreCase(String namePattern);
    List<Patient> findByLastnameContainingIgnoreCase(String lastnamePattern);
    List<Patient> findByPhoneNumberContaining(String phoneNumberPattern);
}
