public class PhoneObserver extends Observer {
    public PhoneObserver(String observerName){
        super(observerName);
    }
    @Override
    public void sendNotification(NotificationMessage notificationMessage){
        System.out.println("Phone Notification sent to userId: " + notificationMessage.getUserId() + " with message: " + notificationMessage.getMessage() + " and messageType: " + notificationMessage.getMessageType());
    }
    
}
