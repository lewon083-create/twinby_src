package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class kg0 implements q70 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f7213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fw f7214c;

    public kg0(Context context, fw fwVar) {
        this.f7213b = context;
        this.f7214c = fwVar;
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void l(eq0 eq0Var) {
        String str = ((zp0) eq0Var.f5033b.f4348d).f13059e;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        fw fwVar = this.f7214c;
        Context context = this.f7213b;
        fwVar.getClass();
        if (((Boolean) q9.s.f31967e.f31970c.a(al.P0)).booleanValue() && fwVar.a(context) && fw.g(context)) {
            synchronized (fwVar.i) {
            }
        }
        fwVar.h(context, "_aq", str, null);
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void E(ku kuVar) {
    }
}
