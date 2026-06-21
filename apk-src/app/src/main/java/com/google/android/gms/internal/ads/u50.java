package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u50 implements z60, t60 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xp0 f10841b;

    public u50(xp0 xp0Var) {
        this.f10841b = xp0Var;
    }

    @Override // com.google.android.gms.internal.ads.z60
    public final void k() {
        pt ptVar = this.f10841b.f12234d0;
        if (ptVar == null || !ptVar.f9179a) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        String str = ptVar.f9180b;
        if (str.isEmpty()) {
            return;
        }
        arrayList.add(str);
    }

    @Override // com.google.android.gms.internal.ads.t60
    public final void a(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.t60
    public final void j(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.t60
    public final void r(Context context) {
    }
}
