package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f8926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8928c;

    public p5() {
        this.f8926a = true;
        this.f8927b = false;
        this.f8928c = false;
    }

    public u3.c a() {
        if (this.f8926a || !(this.f8927b || this.f8928c)) {
            return new u3.c(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }

    public void b(ArrayList arrayList) {
        if ((this.f8926a || this.f8927b || this.f8928c) && arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((g0.a1) it.next()).a();
            }
            com.google.android.gms.internal.auth.g.e("ForceCloseDeferrableSurface", "deferrableSurface closed");
        }
    }

    public kv1 c() {
        if (this.f8926a || !(this.f8927b || this.f8928c)) {
            return new kv1(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }

    public /* synthetic */ p5(boolean z5, boolean z10, boolean z11) {
        this.f8926a = z5;
        this.f8927b = z10;
        this.f8928c = z11;
    }
}
