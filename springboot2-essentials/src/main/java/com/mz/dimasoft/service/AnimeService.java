package com.mz.dimasoft.service;

import java.util.List;

import com.mz.dimasoft.domain.Anime;

public class AnimeService {
	
	public List<Anime> listAll(){
		return List.of(new Anime(1L,"DB2"), new Anime(2L, "Berseck"));
	}

}
