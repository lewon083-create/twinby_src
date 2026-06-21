package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q00 f10773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sd0 f10774b;

    public u00(q00 q00Var, sd0 sd0Var) {
        this.f10773a = q00Var;
        this.f10774b = sd0Var;
    }

    public final void a(Context context, u9.a aVar) {
        wk wkVar = al.f3008ff;
        q9.s sVar = q9.s.f31967e;
        yk ykVar = sVar.f31970c;
        yk ykVar2 = sVar.f31970c;
        if (((Boolean) ykVar.a(wkVar)).booleanValue()) {
            Executor threadPoolExecutor = hx.f6279a;
            if (((Boolean) ykVar2.a(al.f3040hf)).booleanValue()) {
                t00 t00Var = new t00(((Integer) ykVar2.a(al.f3085kf)).intValue());
                int iIntValue = ((Integer) ykVar2.a(al.f3069jf)).intValue();
                threadPoolExecutor = new ThreadPoolExecutor(iIntValue, iIntValue, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), t00Var);
            }
            threadPoolExecutor.execute(new d1(this, context, aVar, 5));
        }
    }
}
