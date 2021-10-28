package TDD_oct21_ASKAR;

import java.util.Map;

public class Dictionary {
    private String Name;
    Map<String,String> Translations;
    public Dictionary(String Name)
    {
        this.Name=Name;
        }
    }
    public String getName()
    {
        return Name;
    }
    public String getTranslation(String totranslate)
    {
        return Translations.get(totranslate);    }
    public void addTranslation(String toTranslate,String Translated)
    {
        Translations.put(toTranslate,Translated);
    }
}
