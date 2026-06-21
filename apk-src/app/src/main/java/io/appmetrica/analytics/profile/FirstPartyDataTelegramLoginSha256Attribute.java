package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import com.vk.api.sdk.exceptions.VKApiCodes;
import io.appmetrica.analytics.impl.C0049b8;
import io.appmetrica.analytics.impl.C0351n4;
import io.appmetrica.analytics.impl.C0500t4;
import io.appmetrica.analytics.impl.C0527u6;
import io.appmetrica.analytics.impl.Cdo;
import io.appmetrica.analytics.impl.Hb;
import io.appmetrica.analytics.impl.Vm;
import io.appmetrica.analytics.impl.Wm;
import io.appmetrica.analytics.impl.Xk;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class FirstPartyDataTelegramLoginSha256Attribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0527u6 f25387a = new C0527u6("appmetrica_1pd_telegram_sha256", new C0049b8(), new Hb(new C0351n4(100)));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Xk f25388b;

    public FirstPartyDataTelegramLoginSha256Attribute(Xk xk2) {
        this.f25388b = xk2;
    }

    @NonNull
    public UserProfileUpdate<? extends Cdo> withTelegramLoginValues(@NonNull String... strArr) {
        return withTelegramLoginValues(Arrays.asList(strArr));
    }

    @NonNull
    public UserProfileUpdate<? extends Cdo> withTelegramLoginValues(@NonNull Iterable<String> iterable) {
        String str = this.f25387a.f24837c;
        ArrayList arrayListA = this.f25388b.a(iterable);
        Wm wm = new Wm(VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM, "First party data telegram logins attribute", PublicLogger.getAnonymousInstance());
        C0527u6 c0527u6 = this.f25387a;
        return new UserProfileUpdate<>(new Vm(str, arrayListA, 10, wm, c0527u6.f24835a, new C0500t4(c0527u6.f24836b)));
    }
}
