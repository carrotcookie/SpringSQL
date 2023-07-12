package DDakDae.springPrac.repository;

import DDakDae.springPrac.slack.SlackMessage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DBMessageRepository implements MessageRepository {

    private static Map<String, SlackMessage> store = new HashMap<>();
    private static Long sequence = 0L;

    @Override
    public SlackMessage saveMsg(SlackMessage message) {
        store.put(message.getMsgId(), message);
        return message;
    }

    @Override
    public SlackMessage findByMsgId(String msgId) {
        SlackMessage msg = store.get(msgId);
        return msg;
    }

    @Override
    public List<SlackMessage> findAllMsg() {
        return new ArrayList<>(store.values());
    }

    @Override
    public void clearStore() {
        store.clear();
    }
}
