package com.yourpackage.controllers;

import com.yourpackage.models.Music;
import com.yourpackage.services.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/music")
public class MusicController {

    @Autowired
    private MusicService musicService;

    @PostMapping("/add")
    public ResponseEntity<Music> addMusic(@RequestBody Music music) {
        return ResponseEntity.ok(musicService.addMusic(music));
    }

    @GetMapping("/search")
    public ResponseEntity<List<Music>> searchMusic(@RequestParam String nome) {
        return ResponseEntity.ok(musicService.searchMusic(nome));
    }


