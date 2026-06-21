package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.StartupParamsCallback;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Ml implements B6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StartupParamsCallback f22698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Nl f22699b;

    public Ml(Nl nl2, StartupParamsCallback startupParamsCallback) {
        this.f22699b = nl2;
        this.f22698a = startupParamsCallback;
    }

    @Override // io.appmetrica.analytics.impl.B6
    public final void a(int i, Bundle bundle) {
        this.f22699b.b(bundle, this.f22698a);
    }
}
