package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.yi, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0639yi extends B4 {
    public C0639yi(C0625y4 c0625y4) {
        super(c0625y4);
    }

    @Override // io.appmetrica.analytics.impl.B4
    public final boolean a(@NonNull Q5 q5, @NonNull C0550v4 c0550v4) {
        Bundle bundle = q5.f22871m;
        this.f22125a.f25080k.a(new C0600x4(bundle != null ? (ResultReceiver) bundle.getParcelable("io.appmetrica.analytics.impl.referrer.common.ReferrerResultReceiver") : null));
        return false;
    }
}
