package com.expedition.dao;

import com.expedition.model.Expedition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpeditionDAO extends JpaRepository<Expedition, Integer> {



}
