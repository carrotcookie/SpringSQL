package DDakDae.springPrac.repository;

import DDakDae.springPrac.slack.SlackMessage;

import java.lang.reflect.Member;
import java.util.List;

public interface MessageRepository {

    SlackMessage saveMsg(SlackMessage message);
    SlackMessage findByMsgId(String msgId);
    List<SlackMessage> findAllMsg();
    void clearStore();
}
