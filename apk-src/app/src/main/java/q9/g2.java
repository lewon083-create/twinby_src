package q9;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.fr;
import com.google.android.gms.internal.ads.jf0;
import com.google.android.gms.internal.ads.jh;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f31865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k9.c f31866f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public k9.h[] f31867g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l9.d f31868h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public k9.u f31869j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f31870k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k9.l f31871l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f31872m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public k9.o f31873n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fr f31861a = new fr();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k9.t f31863c = new k9.t();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jf0 f31864d = new jf0(this);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AtomicLong f31874o = new AtomicLong();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f3 f31862b = f3.f31855a;
    public l0 i = null;

    public g2(k9.l lVar) {
        this.f31871l = lVar;
        new AtomicBoolean(false);
    }

    public static g3 a(Context context, k9.h[] hVarArr) {
        for (k9.h hVar : hVarArr) {
            if (hVar.equals(k9.h.f27262l)) {
                return new g3("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
            }
        }
        g3 g3Var = new g3(context, hVarArr);
        g3Var.f31883k = false;
        return g3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5 A[Catch: RemoteException -> 0x00d3, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x00d3, blocks: (B:28:0x00a0, B:30:0x00a6, B:32:0x00b4, B:34:0x00c6, B:37:0x00d5), top: B:54:0x00a0, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(q9.f2 r13) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q9.g2.b(q9.f2):void");
    }

    public final void c(a aVar) {
        try {
            this.f31865e = aVar;
            l0 l0Var = this.i;
            if (l0Var != null) {
                l0Var.V3(aVar != null ? new p(aVar) : null);
            }
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        }
    }

    public final void d(k9.h... hVarArr) {
        k9.l lVar = this.f31871l;
        this.f31867g = hVarArr;
        try {
            l0 l0Var = this.i;
            if (l0Var != null) {
                l0Var.y2(a(lVar.getContext(), this.f31867g));
            }
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        }
        lVar.requestLayout();
    }

    public final void e(l9.d dVar) {
        try {
            this.f31868h = dVar;
            l0 l0Var = this.i;
            if (l0Var != null) {
                l0Var.v1(dVar != null ? new jh(dVar) : null);
            }
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        }
    }
}
