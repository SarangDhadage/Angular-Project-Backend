package com.crick.CrickInfomerBackend.services;

import java.util.List;

import com.crick.CrickInfomerBackend.model.Match;

public interface MatchService 
{
	List<Match> getLiveMatchScores();
    List<List<String>> getCWC2023PointTable();

    List<Match> getAllMatches();

}
