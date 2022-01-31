package eu.siacs.rasan.xmpp.jingle;

import eu.siacs.rasan.entities.Account;
import eu.siacs.rasan.xmpp.Jid;

public interface OngoingRtpSession {
    Account getAccount();
    Jid getWith();
    String getSessionId();
}
