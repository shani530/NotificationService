public class EmailObserver extends Observer {
    public EmailObserver(String observerName){
        super(observerName);
    }
    @Override
    public void sendNotification(NotificationMessage notificationMessage){
        System.out.println("Email Notification sent to userId: " + notificationMessage.getUserId() + " with message: " + notificationMessage.getMessage() + " and messageType: " + notificationMessage.getMessageType());
    }
}
