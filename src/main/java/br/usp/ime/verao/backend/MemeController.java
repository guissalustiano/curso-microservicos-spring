package br.usp.ime.verao.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class MemeController {

    @Autowired
    private MemeRepository memeRepository;

    @GetMapping
    public List<Meme> findAll() {
        return memeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Meme> findById(@PathVariable("id") Long id) {
        return memeRepository.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Long create(@RequestBody Meme meme){
        return memeRepository.save(meme).getId();
    }

    @PostMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Long update(@PathVariable("id") Long id, @RequestBody Meme meme){
        return memeRepository.save(meme).getId();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Long id) {
        memeRepository.deleteById(id);
    }
}
