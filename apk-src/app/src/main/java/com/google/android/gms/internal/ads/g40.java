package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g40 implements fh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sz f5652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f5653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f5654d = new AtomicReference();

    public g40(sz szVar, Executor executor) {
        this.f5652b = szVar;
        this.f5653c = executor;
    }

    @Override // com.google.android.gms.internal.ads.fh
    public final synchronized void I(eh ehVar) {
        sz szVar = this.f5652b;
        if (szVar != null) {
            if (((Boolean) q9.s.f31967e.f31970c.a(al.Pd)).booleanValue()) {
                if (ehVar.f4951j) {
                    AtomicReference atomicReference = this.f5654d;
                    Boolean bool = Boolean.TRUE;
                    if (!bool.equals(atomicReference.getAndSet(bool))) {
                        this.f5653c.execute(new c00(szVar, 3));
                    }
                } else {
                    AtomicReference atomicReference2 = this.f5654d;
                    Boolean bool2 = Boolean.FALSE;
                    if (!bool2.equals(atomicReference2.getAndSet(bool2))) {
                        this.f5653c.execute(new c00(szVar, 2));
                    }
                }
            }
        }
    }
}
