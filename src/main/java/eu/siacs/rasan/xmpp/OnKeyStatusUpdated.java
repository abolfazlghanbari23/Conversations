package eu.siacs.rasan.xmpp;

import eu.siacs.rasan.crypto.axolotl.AxolotlService;

public interface OnKeyStatusUpdated {
	void onKeyStatusUpdated(AxolotlService.FetchStatus report);
}
