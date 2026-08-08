class NotificationMessage{
    private long userId;
    private String message;
    private String messageType;

    public NotificationMessage(long userId , String message, String messageType){
        this.userId = userId;
        this.message = message;
        this.messageType = messageType;
    }

    public long getUserId() {
        return userId;
    }

    public String getMessage() {
        return message;
    }

    public String getMessageType() {
        return messageType;
    }

}