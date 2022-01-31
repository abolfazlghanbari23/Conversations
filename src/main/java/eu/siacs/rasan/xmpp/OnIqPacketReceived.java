package eu.siacs.rasan.xmpp;

import eu.siacs.rasan.entities.Account;
import eu.siacs.rasan.xmpp.stanzas.IqPacket;

public interface OnIqPacketReceived extends PacketReceived {
	void onIqPacketReceived(Account account, IqPacket packet);
}
