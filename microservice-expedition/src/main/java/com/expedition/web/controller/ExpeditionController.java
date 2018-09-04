package com.expedition.web.controller;

import com.expedition.dao.ExpeditionDAO;
import com.expedition.exception.ImpossibleAjouterException;
import com.expedition.model.Expedition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpeditionController {
    @Autowired
    ExpeditionDAO expeditionDAO;

    @PostMapping(value = "/expedition")
    public ResponseEntity<Expedition> ajouterCommande(@RequestBody Expedition expedition){

        Expedition nouvelleExpedition = expeditionDAO.save(expedition);

        if(nouvelleExpedition == null) throw new ImpossibleAjouterException("Impossible d'ajouter cette expedition");

        return new ResponseEntity<Expedition>(expedition, HttpStatus.CREATED);
    }

}
