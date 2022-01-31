package eu.siacs.rasan.xmpp;

import eu.siacs.rasan.entities.Account;

public interface OnAdvancedStreamFeaturesLoaded {
	void onAdvancedStreamFeaturesAvailable(final Account account);
}
