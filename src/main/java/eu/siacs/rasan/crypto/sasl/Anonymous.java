package eu.siacs.rasan.crypto.sasl;

import java.security.SecureRandom;

import eu.siacs.rasan.entities.Account;
import eu.siacs.rasan.xml.TagWriter;

public class Anonymous extends SaslMechanism {

    public static final String MECHANISM = "ANONYMOUS";

    public Anonymous(TagWriter tagWriter, Account account, SecureRandom rng) {
        super(tagWriter, account, rng);
    }

    @Override
    public int getPriority() {
        return 0;
    }

    @Override
    public String getMechanism() {
        return MECHANISM;
    }

    @Override
    public String getClientFirstMessage() {
        return "";
    }
}
