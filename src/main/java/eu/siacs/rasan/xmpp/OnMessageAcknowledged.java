package eu.siacs.rasan.xmpp;

import eu.siacs.rasan.entities.Account;

public interface OnMessageAcknowledged {
    boolean onMessageAcknowledged(Account account, Jid to, String id);
}
