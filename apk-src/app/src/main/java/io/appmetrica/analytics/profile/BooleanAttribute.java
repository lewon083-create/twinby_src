package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.Ai;
import io.appmetrica.analytics.impl.C0500t4;
import io.appmetrica.analytics.impl.C0527u6;
import io.appmetrica.analytics.impl.Cdo;
import io.appmetrica.analytics.impl.InterfaceC0274k2;
import io.appmetrica.analytics.impl.Wk;
import io.appmetrica.analytics.impl.Y2;
import io.appmetrica.analytics.impl.ro;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class BooleanAttribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0527u6 f25381a;

    public BooleanAttribute(String str, ro roVar, InterfaceC0274k2 interfaceC0274k2) {
        this.f25381a = new C0527u6(str, roVar, interfaceC0274k2);
    }

    @NonNull
    public UserProfileUpdate<? extends Cdo> withValue(boolean z5) {
        C0527u6 c0527u6 = this.f25381a;
        return new UserProfileUpdate<>(new Y2(c0527u6.f24837c, z5, c0527u6.f24835a, new C0500t4(c0527u6.f24836b)));
    }

    @NonNull
    public UserProfileUpdate<? extends Cdo> withValueIfUndefined(boolean z5) {
        C0527u6 c0527u6 = this.f25381a;
        return new UserProfileUpdate<>(new Y2(c0527u6.f24837c, z5, c0527u6.f24835a, new Wk(c0527u6.f24836b)));
    }

    @NonNull
    public UserProfileUpdate<? extends Cdo> withValueReset() {
        C0527u6 c0527u6 = this.f25381a;
        return new UserProfileUpdate<>(new Ai(3, c0527u6.f24837c, c0527u6.f24835a, c0527u6.f24836b));
    }
}
