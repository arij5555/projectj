package tn.esprit.arctic.project.services;

import tn.esprit.arctic.project.entity.Composant;

import java.util.List;

public interface IComposantService {
    Composant saveComposant(Composant composant);
    Composant getComposantById(Long id);
    List<Composant> getAllComposants();
    Composant updateComposant(Long id, Composant composant);
    void deleteComposant(Long id);
    List<Composant> addComposants(List<Composant> composants);
}
