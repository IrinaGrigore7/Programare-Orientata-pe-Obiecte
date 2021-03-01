import java.util.HashMap;

public class FrenchDisp implements Observer{

    private Subject messageSet;
    private HashMap<String, String> dictionary;

    public FrenchDisp(Subject messageSet) {
        this.messageSet = messageSet;
        this.messageSet.registerObserver(this);
        setDictionary();
    }

    private void setDictionary() {
        dictionary = new HashMap<String, String>();
        dictionary.put("mama", "mere");
        dictionary.put("tata", "pere");
        dictionary.put("frate", "frere");
        dictionary.put("sora", "soeur");
        dictionary.put("unchi", "oncle");
        dictionary.put("matusa", "tante");
    }

    @Override
    public void update(String newMessage) {
        String[] words = newMessage.split(" ");
        String translatedMessage = "";
        for(String word : words) {
            if(dictionary.containsKey(word)) {
                translatedMessage = translatedMessage + dictionary.get(word) + " ";
            } else {
                translatedMessage = translatedMessage + word + " ";
            }
        }
        System.out.println(translatedMessage + " (spanish)");
    }
}
