package TDD_oct21_ASKAR;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private String Name;
    Map<String,String> Translations;
    public Dictionary(String Name)
    {
        this.Name=Name;
        Translations=new HashMap<String,String>();
    }
    public String getName()
    {
        return Name;
    }
    public String getTranslation(String totranslate)
    {
        System.out.println( totranslate);

        System.out.println( Translations.get(totranslate));
        return Translations.get(totranslate);
    }
    public void addTranslation(String toTranslate,String Translated)
    {
        Translations.put(toTranslate,Translated);
    }
    public Map<String,String> getTranslations()
    {
        return Translations;
    }
}
