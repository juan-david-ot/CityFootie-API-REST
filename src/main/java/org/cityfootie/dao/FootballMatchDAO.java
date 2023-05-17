package org.cityfootie.dao;


import org.cityfootie.entity.FootballMatch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;

@Repository
public interface FootballMatchDAO extends JpaRepository<FootballMatch, Integer> {
    FootballMatch findByStreet(String street);

    FootballMatch getFootballMatchByDate(Timestamp date);
}