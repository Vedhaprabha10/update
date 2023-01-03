package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DTO.ChapterDto;
import com.example.Enitity.ChapterEntity;
@Repository
public interface ChapterRepo extends JpaRepository<ChapterEntity, Integer>{

	ChapterDto save (ChapterDto chapterDto);
}
