package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t80 extends ip1 implements fh {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakHashMap f10524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f10525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final xp0 f10526f;

    public t80(Context context, Set set, xp0 xp0Var) {
        super(set);
        this.f10524d = new WeakHashMap(1);
        this.f10525e = context;
        this.f10526f = xp0Var;
    }

    public final synchronized void F1(View view) {
        gh ghVar;
        try {
            WeakHashMap weakHashMap = this.f10524d;
            ghVar = (gh) weakHashMap.get(view);
            if (ghVar == null) {
                gh ghVar2 = new gh(this.f10525e, view);
                ghVar2.f5806m.add(this);
                ghVar2.d(3);
                weakHashMap.put(view, ghVar2);
                ghVar = ghVar2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        if (this.f10526f.X) {
            wk wkVar = al.M1;
            q9.s sVar = q9.s.f31967e;
            if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
                long jLongValue = ((Long) sVar.f31970c.a(al.L1)).longValue();
                ba baVar = ghVar.f5803j;
                synchronized (baVar.f3690d) {
                    baVar.f3688b = jLongValue;
                }
                return;
            }
            throw th2;
        }
        ba baVar2 = ghVar.f5803j;
        long j10 = gh.f5795p;
        synchronized (baVar2.f3690d) {
            baVar2.f3688b = j10;
        }
    }

    @Override // com.google.android.gms.internal.ads.fh
    public final synchronized void I(eh ehVar) {
        A1(new cf(20, ehVar));
    }
}
