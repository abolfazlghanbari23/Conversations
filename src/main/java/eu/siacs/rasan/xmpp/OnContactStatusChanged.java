package eu.siacs.rasan.xmpp;

import eu.siacs.rasan.entities.Contact;

public interface OnContactStatusChanged {
	void onContactStatusChanged(final Contact contact, final boolean online);
}
