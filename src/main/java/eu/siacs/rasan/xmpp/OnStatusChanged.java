package eu.siacs.rasan.xmpp;

import eu.siacs.rasan.entities.Account;

public interface OnStatusChanged {
	void onStatusChanged(Account account);
}
