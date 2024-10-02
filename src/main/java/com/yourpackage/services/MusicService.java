package com.yourpackage.services;

import com.yourpackage.models.Music;
import com.yourpackage.repositories.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicService {

    @Autowired
    private MusicRepository musicRepository;

    public List<Music> searchMusic(String nome) {
        return musicRepository.findByNomeContaining(nome);
    }

    public Music addMusic(Music music) {
        return musicRepository.save(music);
    }

}
