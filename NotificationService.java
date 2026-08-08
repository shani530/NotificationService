
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class NotificationService {
    private List<Observer> observers;
     public NotificationService(){
      // Using CopyOnWriteArrayList to handle concurrent modifications
        observers = new CopyOnWriteArrayList<>();
     }
     public void addObserver(Observer observer){
         // add null check
         if(observer == null){
             throw new IllegalArgumentException("Observer cannot be null");
         }
         observers.add(observer);
     }
     public void removeObserver(Observer observer){
         // add null check
         if(observer == null){
             throw new IllegalArgumentException("Observer cannot be null");
         }
         observers.remove(observer);
     }
     
     public void notifyObservers(NotificationMessage notificationMessage){
         for(Observer observer : observers){
               observer.sendNotification(notificationMessage);
         }
     }
}
