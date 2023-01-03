package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DTO.ChapterDto;

import com.example.Repository.ChapterRepo;
@Service
public class ChapterServiceImpl implements ChapterService {

	@Autowired
	private ChapterRepo repo;

	@Override
	public ChapterDto update(ChapterDto chapterDto) {
		
		return repo.save(chapterDto);
	}
	

		
}
