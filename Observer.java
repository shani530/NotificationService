public abstract class Observer{
    String observerName;
    public Observer(String observerName){
        this.observerName = observerName;
    }
    public abstract void sendNotification(NotificationMessage notificationMessage);
}
