package dev.shiraz.secTask.translation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/translations")
public class TranslationController {

    @Autowired
    private TranslationRepo translationRepository;

    
    @PostMapping
    public Translation addTranslation(@RequestBody Translation translation) {
        // Simulate translation logic
        String translated = translation.getTextToTranslate() + " (Translated)";
        translation.setTranslatedText(translated);
        return translationRepository.save(translation);
    }


    @GetMapping("/{id}")
    public Optional<Translation> getTranslation(@PathVariable Long id) {
        return translationRepository.findById(id);
    }
}
