package com.google.android.gms.internal.consent_sdk;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13453d;

    public /* synthetic */ l(int i, Object obj, Object obj2) {
        this.f13451b = i;
        this.f13452c = obj;
        this.f13453d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        switch (this.f13451b) {
            case 0:
                o oVar = (o) this.f13452c;
                k kVar = (k) this.f13453d;
                AtomicReference atomicReference = oVar.f13503d;
                Objects.requireNonNull(atomicReference);
                kVar.b(new d6(1, atomicReference), new m4(22));
                return;
            default:
                r rVar = (r) this.f13452c;
                String str = (String) this.f13453d;
                synchronized (h0.class) {
                    if (h0.f13400a == null) {
                        try {
                            rVar.evaluateJavascript("(function(){})()", null);
                            h0.f13400a = Boolean.TRUE;
                        } catch (IllegalStateException unused) {
                            h0.f13400a = Boolean.FALSE;
                        }
                        zBooleanValue = h0.f13400a.booleanValue();
                        break;
                    } else {
                        zBooleanValue = h0.f13400a.booleanValue();
                        break;
                    }
                }
                if (zBooleanValue) {
                    rVar.evaluateJavascript(str, null);
                    return;
                } else {
                    rVar.loadUrl("javascript:".concat(str));
                    return;
                }
        }
    }
}
