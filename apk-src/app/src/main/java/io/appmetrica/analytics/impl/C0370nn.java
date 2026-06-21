package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.nn, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0370nn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0420pn f24456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0420pn f24457b;

    public C0370nn(Context context) {
        if (new SafePackageManager().hasSystemFeature(context, "android.hardware.telephony")) {
            this.f24456a = new M2(new C0343ml(context));
            this.f24457b = new M2(new Mc(context));
        } else {
            this.f24456a = new Z7();
            this.f24457b = new Z7();
        }
    }
}
