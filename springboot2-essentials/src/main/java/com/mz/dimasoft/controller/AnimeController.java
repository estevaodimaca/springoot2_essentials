package com.mz.dimasoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mz.dimasoft.domain.Anime;
import com.mz.dimasoft.service.AnimeService;
import com.mz.dimasoft.util.DateUtil;

import lombok.extern.log4j.Log4j2;

/**
 * @author estevaodimaca
 */

@RestController
@RequestMapping(path = "animes")
@Log4j2
public class AnimeController {

	@Autowired
	private DateUtil dateUtil;

	@Autowired
	private AnimeService animeService;

	@GetMapping
	public List<Anime> list() {
		// log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
		return animeService.listAll();
	}

}
