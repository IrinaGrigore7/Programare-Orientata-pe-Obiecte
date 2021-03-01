import java.util.ArrayList;

    public class MessageSet implements Subject {

        private ArrayList<Observer> observers;
        private ArrayList<String> messages;

        public MessageSet() {
            observers = new ArrayList<Observer>();
            messages = new ArrayList<String>();
        }

        @Override
        public void registerObserver(Observer o) {
            observers.add(o);
        }

        @Override
        public void removeObserver(Observer o) {
            int i = observers.indexOf(o);
            if (i >= 0) {
                observers.remove(i);
            }
        }

        @Override
        public void notifyObservers() {
            for (int i = 0; i < observers.size(); i++) {
                Observer observer = observers.get(i);
                observer.update(messages.get(messages.size() - 1));
            }
        }

        public void messageReceived(String newMessage) {
            messages.add(newMessage);
            notifyObservers();
        }

    }

