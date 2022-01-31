package eu.siacs.rasan.utils;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

import eu.siacs.rasan.Config;
import eu.siacs.rasan.entities.Account;
import eu.siacs.rasan.ui.ConversationsActivity;
import eu.siacs.rasan.ui.EditAccountActivity;
import eu.siacs.rasan.ui.EnterPhoneNumberActivity;
import eu.siacs.rasan.ui.StartConversationActivity;
import eu.siacs.rasan.ui.TosActivity;
import eu.siacs.rasan.ui.VerifyActivity;
import eu.siacs.rasan.xmpp.Jid;

public class SignupUtils {

    public static Intent getSignUpIntent(Activity activity, boolean ignored) {
        return getSignUpIntent(activity);
    }

    public static Intent getSignUpIntent(Activity activity) {
        return new Intent(activity, EnterPhoneNumberActivity.class);
    }

    public static Intent getRedirectionIntent(ConversationsActivity activity) {
        final Intent intent;
        final Account account = AccountUtils.getFirst(activity.xmppConnectionService);
        if (account != null) {
            if (account.isOptionSet(Account.OPTION_UNVERIFIED)) {
                intent = new Intent(activity, VerifyActivity.class);
            } else {
                intent = new Intent(activity, StartConversationActivity.class);
            }
        } else {
            SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(activity);
            if (preferences.getBoolean("tos",false)) {
                intent = getSignUpIntent(activity);
            } else {
                intent = new Intent(activity, TosActivity.class);
            }

        }
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        return intent;
    }

    public static boolean isSupportTokenRegistry() {
        return false;
    }

    public static Intent getTokenRegistrationIntent(Activity activity, Jid preset, String key) {
        return null;
    }
}