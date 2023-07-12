package DDakDae.springPrac.slack;

public class SlackMessage {
    private String msgId;
    private String channelId;
    private String userId;
    private String content;
    private String timeStamp;
    private Boolean doHaveThread;

    public SlackMessage(String msgId, String channelId, String userId, String content, String timeStamp, Boolean doHaveThread) {
        this.msgId = msgId;
        this.channelId = channelId;
        this.userId = userId;
        this.content = content;
        this.timeStamp = timeStamp;
        this.doHaveThread = doHaveThread;
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Boolean getDoHaveThread() {
        return doHaveThread;
    }

    public void setDoHaveThread(Boolean doHaveThread) {
        this.doHaveThread = doHaveThread;
    }
}
