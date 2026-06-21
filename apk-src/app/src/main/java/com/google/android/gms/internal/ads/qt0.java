package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.ClientApi;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class qt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u9.a f9581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f9582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mr0 f9583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ClientApi f9584e = new ClientApi();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final oq0 f9585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ua.a f9586g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dt0 f9587h;

    public qt0(Context context, u9.a aVar, ScheduledExecutorService scheduledExecutorService, mr0 mr0Var, oq0 oq0Var, ua.a aVar2, dt0 dt0Var) {
        this.f9580a = context;
        this.f9581b = aVar;
        this.f9582c = scheduledExecutorService;
        this.f9583d = mr0Var;
        this.f9586g = aVar2;
        this.f9585f = oq0Var;
        this.f9587h = dt0Var;
    }

    public final ht0 a(q9.x2 x2Var, q9.p0 p0Var) {
        k9.a aVarA = k9.a.a(x2Var.f31982c);
        if (aVarA == null) {
            return null;
        }
        int iOrdinal = aVarA.ordinal();
        Context context = this.f9580a;
        u9.a aVar = this.f9581b;
        if (iOrdinal == 1) {
            return new ht0(this.f9584e, context, aVar.f34367d, this.f9585f, x2Var, p0Var, this.f9582c, this.f9583d, c(), this.f9586g, 1);
        }
        if (iOrdinal == 2) {
            return new ht0(this.f9584e, context, aVar.f34367d, this.f9585f, x2Var, p0Var, this.f9582c, this.f9583d, c(), this.f9586g, 2);
        }
        if (iOrdinal != 5) {
            return null;
        }
        return new ht0(this.f9584e, context, aVar.f34367d, this.f9585f, x2Var, p0Var, this.f9582c, this.f9583d, c(), this.f9586g, 0);
    }

    public final ht0 b(String str, q9.x2 x2Var, q9.q0 q0Var) {
        k9.a aVarA = k9.a.a(x2Var.f31982c);
        if (aVarA == null) {
            return null;
        }
        int iOrdinal = aVarA.ordinal();
        Context context = this.f9580a;
        u9.a aVar = this.f9581b;
        if (iOrdinal == 1) {
            return new ht0(str, this.f9584e, context, aVar.f34367d, this.f9585f, x2Var, q0Var, this.f9582c, this.f9583d, c(), this.f9586g, this.f9587h, 1);
        }
        if (iOrdinal == 2) {
            return new ht0(str, this.f9584e, context, aVar.f34367d, this.f9585f, x2Var, q0Var, this.f9582c, this.f9583d, c(), this.f9586g, this.f9587h, 2);
        }
        if (iOrdinal != 5) {
            return null;
        }
        return new ht0(str, this.f9584e, context, aVar.f34367d, this.f9585f, x2Var, q0Var, this.f9582c, this.f9583d, c(), this.f9586g, this.f9587h, 0);
    }

    public final it0 c() {
        wk wkVar = al.G;
        q9.s sVar = q9.s.f31967e;
        return new it0(((Long) sVar.f31970c.a(wkVar)).longValue(), ((Long) sVar.f31970c.a(al.H)).longValue(), this.f9586g);
    }
}
