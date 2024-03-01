package com.crick.CrickInfomerBackend.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crick.CrickInfomerBackend.model.Match;
import com.crick.CrickInfomerBackend.services.MatchService;

@RestController
@RequestMapping("/match")
@CrossOrigin("*")
public class MatchController 
{
	private MatchService matchService;

	public MatchController(MatchService matchService) {
		super();
		this.matchService = matchService;
	}
	 @GetMapping("/live")
	    public ResponseEntity<List<Match>> getLiveMatch() throws InterruptedException {
	        System.out.println("getting live match");
	        return new ResponseEntity<>(this.matchService.getLiveMatchScores(), HttpStatus.OK);
	    }
	 
	 @GetMapping
	    public ResponseEntity<List<Match>> getAllMatches() {
	        return new ResponseEntity<>(this.matchService.getAllMatches(), HttpStatus.OK);
	    }
	 
	 @GetMapping("/pointtable")
	    public ResponseEntity<?> getCWC2023PointTable() {
	        return new ResponseEntity<>(this.matchService.getCWC2023PointTable(), HttpStatus.OK);
	    }

}
