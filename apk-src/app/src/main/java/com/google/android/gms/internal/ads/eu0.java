package com.google.android.gms.internal.ads;

import android.view.View;
import io.sentry.ProfilingTraceData;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class eu0 extends hu0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final eu0 f5068e = new eu0();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.hu0
    public final boolean a() {
        Iterator it = Collections.unmodifiableCollection(fu0.f5441c.f5443b).iterator();
        while (it.hasNext()) {
            View view = (View) ((ut0) it.next()).f11065c.get();
            if (view != null && view.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.hu0
    public final void b(boolean z5) {
        Iterator it = Collections.unmodifiableCollection(fu0.f5441c.f5442a).iterator();
        while (it.hasNext()) {
            ou0 ou0Var = ((ut0) it.next()).f11066d;
            if (ou0Var.f8803b.get() != 0) {
                c6.f4048h.A(ou0Var.c(), "setState", true != z5 ? ProfilingTraceData.TRUNCATION_REASON_BACKGROUNDED : "foregrounded", ou0Var.f8802a);
            }
        }
    }
}
