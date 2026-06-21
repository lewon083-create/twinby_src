package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class D0 {
    public static C6 a(Handler handler, C0 c02) {
        return new C6(handler, c02);
    }

    public static Af a(Context context, C6 c62) {
        return new Af(context, c62);
    }

    public static C0564vi a(Af af2, Context context, ICommonExecutor iCommonExecutor) {
        C0397p0 c0397p0 = new C0397p0(context, iCommonExecutor);
        return new C0564vi(c0397p0, new Rn(new C0333mb()), new G4(af2), new Xj(context, c0397p0));
    }

    public static Nl a(Context context, C0564vi c0564vi, Ue ue, Handler handler) {
        return new Nl(c0564vi, new Vl(context, ue), handler);
    }

    public static C0237ig a(C0564vi c0564vi, Ue ue, Handler handler) {
        return new C0237ig(c0564vi, ue, handler, ue.s());
    }

    public static C0239ii a(Context context, Af af2, C0564vi c0564vi, Handler handler, Nl nl2) {
        return new C0239ii(context, af2, c0564vi, handler, nl2);
    }

    public static C0080cd a(Context context) {
        return new C0080cd(C0071c4.l().f23537c.a(), C0071c4.l().b(context), "client_modules", new SystemTimeProvider());
    }
}
