package eu.siacs.rasan.xmpp.stanzas.csi;

import eu.siacs.rasan.xmpp.stanzas.AbstractStanza;

public class ActivePacket extends AbstractStanza {
	public ActivePacket() {
		super("active");
		setAttribute("xmlns", "urn:xmpp:csi:0");
	}
}