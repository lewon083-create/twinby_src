package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class dg extends ig {
    public final Map i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f4562j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Context f4563k;

    public dg(qf qfVar, jd jdVar, int i, HashMap map, View view, Context context) {
        super(qfVar, "mWKvHkCTlhia7UFG1tX8rmkp9AizD6H5C2Y+fxk0U+Y2fZze528QNyV6FTMftwOj", "NhSpQvE4PaXaFqOsSIcuQESqMAyvT+VdhFhpwrR61iU=", jdVar, i, 85);
        this.i = map;
        this.f4562j = view;
        this.f4563k = context;
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final void a() {
        Map map = this.i;
        long jLongValue = map.containsKey(1) ? ((Long) map.get(1)).longValue() : Long.MIN_VALUE;
        Map map2 = this.i;
        long[] jArr = {jLongValue, map2.containsKey(2) ? ((Long) map2.get(2)).longValue() : Long.MIN_VALUE};
        Context context = this.f4563k;
        if (context == null) {
            context = this.f6481b.f9475a;
        }
        long[] jArr2 = (long[]) this.f6485f.invoke(null, jArr, context, this.f4562j);
        long j10 = jArr2[0];
        Map map3 = this.i;
        map3.put(1, Long.valueOf(jArr2[1]));
        long j11 = jArr2[2];
        map3.put(2, Long.valueOf(jArr2[3]));
        jd jdVar = this.f6484e;
        synchronized (jdVar) {
            jdVar.b();
            ((wd) jdVar.f9560c).i0(j10);
            jdVar.b();
            ((wd) jdVar.f9560c).j0(j11);
        }
    }
}
