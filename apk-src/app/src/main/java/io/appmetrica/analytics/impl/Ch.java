package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Ch extends Y4 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f22214w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final F6 f22215x;

    public Ch(@NonNull Context context, @NonNull R4 r42, @NonNull C0401p4 c0401p4, @NonNull F6 f62, @NonNull C0140em c0140em, @NonNull W4 w42, @NonNull InterfaceC0505t9 interfaceC0505t9) {
        this(context, r42, new C0272k0(), new TimePassedChecker(), new C0098d5(context, r42, c0401p4, w42, c0140em, new C0613xh(f62), C0382oa.k().w().c(), PackageManagerUtils.getAppVersionCodeInt(context), C0382oa.k().l(), interfaceC0505t9), f62, c0401p4);
    }

    @Override // io.appmetrica.analytics.impl.Y4, io.appmetrica.analytics.impl.Qa, io.appmetrica.analytics.impl.Fa
    public final synchronized void a(@NonNull C0401p4 c0401p4) {
        super.a(c0401p4);
        this.f22215x.a(this.f22214w, c0401p4.i);
    }

    public Ch(Context context, R4 r42, C0272k0 c0272k0, TimePassedChecker timePassedChecker, C0098d5 c0098d5, F6 f62, C0401p4 c0401p4) {
        super(context, r42, c0272k0, timePassedChecker, c0098d5, c0401p4);
        this.f22214w = r42.b();
        this.f22215x = f62;
    }
}
