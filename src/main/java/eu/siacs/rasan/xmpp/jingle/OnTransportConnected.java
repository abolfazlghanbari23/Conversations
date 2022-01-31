package eu.siacs.rasan.xmpp.jingle;

public interface OnTransportConnected {
	void failed();

	void established();
}
