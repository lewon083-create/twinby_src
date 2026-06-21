package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d21 implements a21 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f4424b = new ArrayList();

    @Override // com.google.android.gms.internal.ads.a21
    public final synchronized void c(HashMap map, Context context, View view) {
        ArrayList arrayList = this.f4424b;
        map.put("vst", new ArrayList(arrayList));
        arrayList.clear();
    }

    @Override // com.google.android.gms.internal.ads.a21
    public final void a(HashMap map) {
    }

    @Override // com.google.android.gms.internal.ads.a21
    public final void b(HashMap map) {
    }
}
