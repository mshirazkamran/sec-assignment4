package dev.shiraz.secTask.translation;

import jakarta.persistence.*;

@Entity
public class Translation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long translationID;

    private String textToTranslate;
    private boolean culturalSensitive;
    private boolean flagInappropriate;
    private String translatedText;

    public Translation() {

    }

    public Translation(Long translationID, String textToTranslate
            , boolean culturalSensitive, boolean flagInappropriate,
            String translatedText) {
                
        this.translationID = translationID;
        this.textToTranslate = textToTranslate;
        this.culturalSensitive = culturalSensitive;
        this.flagInappropriate = flagInappropriate;
        this.translatedText = translatedText;
    }



    // Getters and setters
    public Long getTranslationID() {
        return translationID;
    }

    public void setTranslationID(Long translationID) {
        this.translationID = translationID;
    }

    public String getTextToTranslate() {
        return textToTranslate;
    }

    public void setTextToTranslate(String textToTranslate) {
        this.textToTranslate = textToTranslate;
    }

    public boolean isCulturalSensitive() {
        return culturalSensitive;
    }

    public void setCulturalSensitive(boolean culturalSensitive) {
        this.culturalSensitive = culturalSensitive;
    }

    public boolean isFlagInappropriate() {
        return flagInappropriate;
    }

    public void setFlagInappropriate(boolean flagInappropriate) {
        this.flagInappropriate = flagInappropriate;
    }

    public String getTranslatedText() {
        return translatedText;
    }

    public void setTranslatedText(String translatedText) {
        this.translatedText = translatedText;
    }
}
