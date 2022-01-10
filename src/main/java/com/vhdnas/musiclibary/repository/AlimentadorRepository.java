package com.vhdnas.musiclibary.repository;

import com.vhdnas.musiclibary.model.Alimentador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlimentadorRepository extends JpaRepository<Alimentador, Long> {

     Alimentador findById(long id);
}
