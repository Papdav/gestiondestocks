package com.papdav.gestiondestocks.services;

import com.papdav.gestiondestocks.dtos.UtilisateurDto;

import java.util.List;

public interface UtilisateurService {
    UtilisateurDto save(UtilisateurDto utilisateurDto);

    UtilisateurDto findById(Integer id);

    UtilisateurDto findByNom(String nom);

    List<UtilisateurDto> findAll();

    void delete(Integer id);
}
