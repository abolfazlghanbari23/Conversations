package eu.siacs.rasan.xmpp.jingle;

import eu.siacs.rasan.entities.Account;
import eu.siacs.rasan.xmpp.PacketReceived;
import eu.siacs.rasan.xmpp.jingle.stanzas.JinglePacket;

public interface OnJinglePacketReceived extends PacketReceived {
	void onJinglePacketReceived(Account account, JinglePacket packet);
}
