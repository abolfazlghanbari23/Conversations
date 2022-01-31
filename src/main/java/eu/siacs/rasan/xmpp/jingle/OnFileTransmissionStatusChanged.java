package eu.siacs.rasan.xmpp.jingle;

import eu.siacs.rasan.entities.DownloadableFile;

public interface OnFileTransmissionStatusChanged {
	void onFileTransmitted(DownloadableFile file);

	void onFileTransferAborted();
}
