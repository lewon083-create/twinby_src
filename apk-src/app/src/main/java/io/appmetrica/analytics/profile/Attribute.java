package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import com.vk.api.sdk.exceptions.VKApiCodes;
import io.appmetrica.analytics.impl.Be;
import io.appmetrica.analytics.impl.C0345mn;
import io.appmetrica.analytics.impl.C0351n4;
import io.appmetrica.analytics.impl.C0457rb;
import io.appmetrica.analytics.impl.C0579w8;
import io.appmetrica.analytics.impl.Hb;
import io.appmetrica.analytics.impl.Wm;
import io.appmetrica.analytics.impl.Xk;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import pe.a;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Attribute {
    @NonNull
    public static BirthDateAttribute birthDate() {
        return new BirthDateAttribute();
    }

    @NonNull
    public static BooleanAttribute customBoolean(@NonNull String str) {
        return new BooleanAttribute(str, new C0457rb(), new Hb(new C0351n4(100)));
    }

    @NonNull
    public static CounterAttribute customCounter(@NonNull String str) {
        return new CounterAttribute(str, new C0457rb(), new Hb(new C0351n4(100)));
    }

    @NonNull
    public static NumberAttribute customNumber(@NonNull String str) {
        return new NumberAttribute(str, new C0457rb(), new Hb(new C0351n4(100)));
    }

    @NonNull
    public static StringAttribute customString(@NonNull String str) {
        return new StringAttribute(str, new Wm(VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM, a.f("String attribute \"", str, "\""), PublicLogger.getAnonymousInstance()), new C0457rb(), new Hb(new C0351n4(100)));
    }

    @NonNull
    public static FirstPartyDataEmailSha256Attribute emailHash() {
        return new FirstPartyDataEmailSha256Attribute(new Xk(new C0579w8()));
    }

    @NonNull
    public static GenderAttribute gender() {
        return new GenderAttribute();
    }

    @NonNull
    public static NameAttribute name() {
        return new NameAttribute();
    }

    @NonNull
    public static NotificationsEnabledAttribute notificationsEnabled() {
        return new NotificationsEnabledAttribute();
    }

    @NonNull
    public static FirstPartyDataPhoneSha256Attribute phoneHash() {
        return new FirstPartyDataPhoneSha256Attribute(new Xk(new Be()));
    }

    @NonNull
    public static FirstPartyDataTelegramLoginSha256Attribute telegramLoginHash() {
        return new FirstPartyDataTelegramLoginSha256Attribute(new Xk(new C0345mn()));
    }
}
