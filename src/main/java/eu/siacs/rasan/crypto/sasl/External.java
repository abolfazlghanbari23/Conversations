package eu.siacs.rasan.crypto.sasl;

import android.util.Base64;

import java.security.SecureRandom;

import eu.siacs.rasan.entities.Account;
import eu.siacs.rasan.xml.TagWriter;

public class External extends SaslMechanism {

    public static final String MECHANISM = "EXTERNAL";

    public External(TagWriter tagWriter, Account account, SecureRandom rng) {
        super(tagWriter, account, rng);
    }

    @Override
    public int getPriority() {
        return 25;
    }

    @Override
    public String getMechanism() {
        return MECHANISM;
    }

    @Override
    public String getClientFirstMessage() {
        return Base64.encodeToString(account.getJid().asBareJid().toEscapedString().getBytes(), Base64.NO_WRAP);
    }
}
