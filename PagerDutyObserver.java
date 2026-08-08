public class PagerDutyObserver extends Observer {
    public PagerDutyObserver(String observerName) {
        super(observerName);        
    }

    @Override
    public void sendNotification(NotificationMessage notificationMessage) {
        
        System.out.println("PagerDuty Notification sent to userId: " + notificationMessage.getUserId() + " with message: " + notificationMessage.getMessage() + " and messageType: " + notificationMessage.getMessageType());
        
    }
    
}
