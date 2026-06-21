package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.ICrashTransformer;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Ah extends AbstractC0278k6 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Vn f22079d;

    public Ah(@NonNull Context context, @NonNull Vn vn, @NonNull InterfaceC0253j6 interfaceC0253j6, ICrashTransformer iCrashTransformer) {
        this(vn, interfaceC0253j6, iCrashTransformer, new N9(context));
    }

    public Ah(Vn vn, InterfaceC0253j6 interfaceC0253j6, ICrashTransformer iCrashTransformer, N9 n92) {
        super(interfaceC0253j6, iCrashTransformer, n92);
        this.f22079d = vn;
    }
}
