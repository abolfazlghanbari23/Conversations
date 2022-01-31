package eu.siacs.rasan.xmpp;

import eu.siacs.rasan.entities.Account;
import eu.siacs.rasan.xmpp.stanzas.PresencePacket;

public interface OnPresencePacketReceived extends PacketReceived {
	void onPresencePacketReceived(Account account, PresencePacket packet);
}
