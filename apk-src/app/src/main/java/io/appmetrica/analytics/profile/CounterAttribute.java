package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C0457rb;
import io.appmetrica.analytics.impl.C0527u6;
import io.appmetrica.analytics.impl.Cdo;
import io.appmetrica.analytics.impl.Hb;
import io.appmetrica.analytics.impl.R5;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class CounterAttribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0527u6 f25382a;

    public CounterAttribute(String str, C0457rb c0457rb, Hb hb2) {
        this.f25382a = new C0527u6(str, c0457rb, hb2);
    }

    @NonNull
    public UserProfileUpdate<? extends Cdo> withDelta(double d10) {
        return new UserProfileUpdate<>(new R5(this.f25382a.f24837c, d10));
    }
}
