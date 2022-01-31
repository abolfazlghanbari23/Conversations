package eu.siacs.rasan.xmpp;

import eu.siacs.rasan.entities.Account;
import eu.siacs.rasan.xmpp.stanzas.MessagePacket;

public interface OnMessagePacketReceived extends PacketReceived {
	void onMessagePacketReceived(Account account, MessagePacket packet);
}
