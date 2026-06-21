package yads;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapter;
import java.util.HashSet;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class fu2 implements oo, wo2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zt2 f38553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vt2 f38554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w5 f38555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f38556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xy f38557e = xy.f44839c;

    public fu2(Context context, zt2 zt2Var, vt2 vt2Var, w5 w5Var) {
        this.f38553a = zt2Var;
        this.f38554b = vt2Var;
        this.f38555c = w5Var;
        this.f38556d = context.getApplicationContext();
    }

    @Override // yads.vp2
    public final void a(lm3 lm3Var) {
        this.f38555c.a(v5.f43881m);
        vt2 vt2Var = this.f38554b;
        xy xyVar = this.f38557e;
        if (vt2Var.f44123a.isActive()) {
            hk.j jVar = vt2Var.f44123a;
            ij.k kVar = ij.m.f21341c;
            jVar.resumeWith(new iu2(lm3Var, xyVar));
        }
    }

    @Override // yads.wo2
    public final void b() {
        this.f38555c.a(v5.f43880l);
        this.f38555c.a(v5.f43881m, null);
    }

    @Override // yads.wp2
    public final void a(Object obj) {
        HashSet<qt2> hashSet;
        pt2 pt2Var = (pt2) obj;
        zt2 zt2Var = this.f38553a;
        Context context = this.f38556d;
        zt2Var.getClass();
        synchronized (zt2.f45529b) {
            hashSet = new HashSet(zt2Var.f45531a.keySet());
            fw2.a().a(context, pt2Var);
            Unit unit = Unit.f27471a;
        }
        for (qt2 qt2Var : hashSet) {
            boolean z5 = !qt2Var.f42385a.f37025a.b(context);
            if (qt2Var.f42386b.f43290a.b()) {
                try {
                    ij.k kVar = ij.m.f21341c;
                    AppMetricaLibraryAdapter.setAdvIdentifiersTracking(z5);
                    Unit unit2 = Unit.f27471a;
                } catch (Throwable th2) {
                    ij.k kVar2 = ij.m.f21341c;
                    com.google.android.gms.internal.measurement.h5.s(th2);
                }
            }
        }
        this.f38555c.a(v5.f43881m);
        vt2 vt2Var = this.f38554b;
        xy xyVar = this.f38557e;
        if (vt2Var.f44123a.isActive()) {
            hk.j jVar = vt2Var.f44123a;
            ij.k kVar3 = ij.m.f21341c;
            jVar.resumeWith(new ju2(pt2Var, xyVar));
        }
    }
}
