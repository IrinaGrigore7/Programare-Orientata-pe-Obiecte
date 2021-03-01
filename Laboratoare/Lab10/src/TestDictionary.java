public class TestDictionary {
    public static void main(String[] args) {
        MessageSet messageSet = new MessageSet();
        EnglishDisp englishDisp = new EnglishDisp(messageSet);
        FrenchDisp frenchDisp = new FrenchDisp(messageSet);


        System.out.println("eu am un frate (original message)");
        messageSet.messageReceived("eu am un frate");
        System.out.println();


        System.out.println("tata a plecat cu mama (original message)");
        messageSet.messageReceived("tata a plecat cu mama");
        System.out.println();

        System.out.println("matusa frate sora frate (original message)");
        messageSet.messageReceived("matusa frate sora frate");

    }
}

