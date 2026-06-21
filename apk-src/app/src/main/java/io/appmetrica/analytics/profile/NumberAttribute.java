package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.Ai;
import io.appmetrica.analytics.impl.C0158fe;
import io.appmetrica.analytics.impl.C0351n4;
import io.appmetrica.analytics.impl.C0457rb;
import io.appmetrica.analytics.impl.C0500t4;
import io.appmetrica.analytics.impl.C0527u6;
import io.appmetrica.analytics.impl.Cdo;
import io.appmetrica.analytics.impl.Hb;
import io.appmetrica.analytics.impl.Wk;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class NumberAttribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0527u6 f25392a;

    public NumberAttribute(String str, C0457rb c0457rb, Hb hb2) {
        this.f25392a = new C0527u6(str, c0457rb, hb2);
    }

    @NonNull
    public UserProfileUpdate<? extends Cdo> withValue(double d10) {
        return new UserProfileUpdate<>(new C0158fe(this.f25392a.f24837c, d10, new C0457rb(), new C0500t4(new Hb(new C0351n4(100)))));
    }

    @NonNull
    public UserProfileUpdate<? extends Cdo> withValueIfUndefined(double d10) {
        return new UserProfileUpdate<>(new C0158fe(this.f25392a.f24837c, d10, new C0457rb(), new Wk(new Hb(new C0351n4(100)))));
    }

    @NonNull
    public UserProfileUpdate<? extends Cdo> withValueReset() {
        return new UserProfileUpdate<>(new Ai(1, this.f25392a.f24837c, new C0457rb(), new Hb(new C0351n4(100))));
    }
}
