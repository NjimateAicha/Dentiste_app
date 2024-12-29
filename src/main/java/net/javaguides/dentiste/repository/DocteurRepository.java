package net.javaguides.dentiste.repository;

import net.javaguides.dentiste.model.Docteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface DocteurRepository extends JpaRepository<Docteur, Integer>{



}
