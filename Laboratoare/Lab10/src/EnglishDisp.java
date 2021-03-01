import java.util.HashMap;

public class EnglishDisp implements Observer{
    private Subject messageSet;
    private HashMap<String, String> dictionary;

    public EnglishDisp(Subject messageSet) {
        this.messageSet = messageSet;
        this.messageSet.registerObserver(this);
        setDictionary();
    }

    private void setDictionary() {
        dictionary = new HashMap<String, String>();
        dictionary.put("mama", "mother");
        dictionary.put("tata", "father");
        dictionary.put("frate", "brother");
        dictionary.put("sora", "sister");
        dictionary.put("unchi", "uncle");
        dictionary.put("matusa", "aunt");
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
        System.out.println(translatedMessage + " (english)");
    }
}
