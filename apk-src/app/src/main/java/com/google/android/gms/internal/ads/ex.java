package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ex {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r81 f5122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public sd0 f5123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f5124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f5125d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f5126e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f5127f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f5128g = -1;

    public final void a(r81 r81Var, sd0 sd0Var, Context context) {
        if (this.f5125d.getAndSet(true)) {
            return;
        }
        this.f5122a = r81Var;
        this.f5123b = sd0Var;
        wk wkVar = al.Ze;
        q9.s sVar = q9.s.f31967e;
        this.f5127f = ((Long) sVar.f31970c.a(wkVar)).longValue();
        this.f5128g = ((Long) sVar.f31970c.a(al.f2931af)).longValue();
        this.f5124c = context;
    }
}
