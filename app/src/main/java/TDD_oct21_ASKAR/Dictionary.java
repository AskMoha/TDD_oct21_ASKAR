package TDD_oct21_ASKAR;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private String Name;
    Map<String, ArrayList<String>> Translations;
    public Dictionary(String Name)
    {
        this.Name=Name;
        Translations=new HashMap<String,ArrayList<String>>();
    }
    public String getName()
    {
        return Name;
    }
    public ArrayList<String> getTranslation(String totranslate)
    {
        return Translations.get(totranslate);
    }
    public void addTranslation(String toTranslate,String Translated)
    {
        if(getTranslation(toTranslate)==null)
        {
            ArrayList<String> traduit=new ArrayList<>();
            traduit.add(Translated);
            Translations.put(toTranslate,traduit);
        }
        else
        {
            Translations.get(toTranslate).add(toTranslate);
        }
    }
    public Map<String,ArrayList<String>> getTranslations()
    {
        return Translations;
    }
}
