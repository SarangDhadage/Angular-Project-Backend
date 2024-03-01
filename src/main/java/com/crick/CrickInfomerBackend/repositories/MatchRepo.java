package com.crick.CrickInfomerBackend.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crick.CrickInfomerBackend.model.Match;

public interface MatchRepo extends JpaRepository<Match,Integer>
{
	Optional<Match> findByTeamHeading(String teamHeading);
}
