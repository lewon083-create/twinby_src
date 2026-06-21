package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class gg extends ig {
    public final uf i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f5792j;

    public gg(qf qfVar, jd jdVar, int i, uf ufVar) {
        super(qfVar, "X3d3ekEggpPfZcTTuZPSKX+MUCnQGNsbyccHnkW7iVTfczCTjKoxcgVjpAE8Uhyz", "I4rncSeVGoKv0gEJ8Xd0rq9G0kL2Ky2ley3iuTG83Dg=", jdVar, i, 53);
        this.i = ufVar;
        if (ufVar != null) {
            if (ufVar.f10938m <= -2) {
                WeakReference weakReference = ufVar.i;
                if ((weakReference != null ? (View) weakReference.get() : null) == null) {
                    ufVar.f10938m = -3L;
                }
            }
            this.f5792j = ufVar.f10938m;
        }
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final void a() {
        if (this.i != null) {
            long jLongValue = ((Long) this.f6485f.invoke(null, Long.valueOf(this.f5792j))).longValue();
            jd jdVar = this.f6484e;
            jdVar.b();
            ((wd) jdVar.f9560c).R(jLongValue);
        }
    }
}
