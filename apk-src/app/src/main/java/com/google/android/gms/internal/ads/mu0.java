package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class mu0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final mu0 f8023d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f8024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8026c;

    static {
        mu0 mu0Var = new mu0();
        mu0Var.f8025b = false;
        mu0Var.f8026c = false;
        f8023d = mu0Var;
    }

    public final void a(boolean z5, boolean z10) {
        if ((z10 || z5) == (this.f8026c || this.f8025b)) {
            return;
        }
        Iterator it = Collections.unmodifiableCollection(fu0.f5441c.f5442a).iterator();
        while (it.hasNext()) {
            ou0 ou0Var = ((ut0) it.next()).f11066d;
            boolean z11 = z10 || z5;
            if (ou0Var.f8803b.get() != 0) {
                c6.f4048h.A(ou0Var.c(), "setDeviceLockState", true != z11 ? "unlocked" : "locked");
            }
        }
    }
}
