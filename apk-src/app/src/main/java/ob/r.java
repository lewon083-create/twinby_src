package ob;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30374a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f30375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f30376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f30377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f30378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f30379f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f30380g;

    public r(l1 l1Var, String str, String str2, String str3, long j10, long j11, Bundle bundle) {
        u uVar;
        pa.c0.f(str2);
        pa.c0.f(str3);
        this.f30377d = str2;
        this.f30378e = str3;
        this.f30379f = true == TextUtils.isEmpty(str) ? null : str;
        this.f30375b = j10;
        this.f30376c = j11;
        if (j11 != 0 && j11 > j10) {
            s0 s0Var = l1Var.f30265g;
            l1.k(s0Var);
            s0Var.f30413j.g(s0.K(str2), "Event created with reverse previous/current timestamps. appId");
        }
        if (bundle == null || bundle.isEmpty()) {
            uVar = new u(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    s0 s0Var2 = l1Var.f30265g;
                    l1.k(s0Var2);
                    s0Var2.f30411g.f("Param name can't be null");
                    it.remove();
                } else {
                    e4 e4Var = l1Var.f30267j;
                    l1.h(e4Var);
                    Object objJ = e4Var.J(bundle2.get(next), next);
                    if (objJ == null) {
                        s0 s0Var3 = l1Var.f30265g;
                        l1.k(s0Var3);
                        s0Var3.f30413j.g(l1Var.f30268k.b(next), "Param value can't be null");
                        it.remove();
                    } else {
                        e4 e4Var2 = l1Var.f30267j;
                        l1.h(e4Var2);
                        e4Var2.R(bundle2, next, objJ);
                    }
                }
            }
            uVar = new u(bundle2);
        }
        this.f30380g = uVar;
    }

    public r a(long j10, w3.m mVar) throws i4.b {
        long jD;
        long jD2;
        v3.g gVarC = ((w3.m) this.f30378e).c();
        v3.g gVarC2 = mVar.c();
        if (gVarC == null) {
            return new r(j10, mVar, (w3.b) this.f30379f, (j4.e) this.f30377d, this.f30376c, gVarC);
        }
        if (!gVarC.N()) {
            return new r(j10, mVar, (w3.b) this.f30379f, (j4.e) this.f30377d, this.f30376c, gVarC2);
        }
        long jS = gVarC.S(j10);
        if (jS == 0) {
            return new r(j10, mVar, (w3.b) this.f30379f, (j4.e) this.f30377d, this.f30376c, gVarC2);
        }
        gVarC2.getClass();
        long jQ = gVarC.Q();
        long jB = gVarC.b(jQ);
        long j11 = jS + jQ;
        long j12 = j11 - 1;
        long jF = gVarC.f(j12, j10) + gVarC.b(j12);
        long jQ2 = gVarC2.Q();
        long jB2 = gVarC2.b(jQ2);
        long j13 = this.f30376c;
        if (jF == jB2) {
            jD = j11 - jQ2;
        } else {
            if (jF < jB2) {
                throw new i4.b();
            }
            if (jB2 < jB) {
                jD2 = j13 - (gVarC2.D(jB, j10) - jQ);
                return new r(j10, mVar, (w3.b) this.f30379f, (j4.e) this.f30377d, jD2, gVarC2);
            }
            jD = gVarC.D(jB2, j10) - jQ2;
        }
        jD2 = jD + j13;
        return new r(j10, mVar, (w3.b) this.f30379f, (j4.e) this.f30377d, jD2, gVarC2);
    }

    public long b(long j10) {
        v3.g gVar = (v3.g) this.f30380g;
        gVar.getClass();
        long j11 = this.f30375b;
        long jM = gVar.m(j11, j10) + this.f30376c;
        gVar.getClass();
        return (gVar.T(j11, j10) + jM) - 1;
    }

    public long c() {
        v3.g gVar = (v3.g) this.f30380g;
        gVar.getClass();
        return gVar.S(this.f30375b);
    }

    public long d(long j10) {
        long jE = e(j10);
        v3.g gVar = (v3.g) this.f30380g;
        gVar.getClass();
        return gVar.f(j10 - this.f30376c, this.f30375b) + jE;
    }

    public long e(long j10) {
        v3.g gVar = (v3.g) this.f30380g;
        gVar.getClass();
        return gVar.b(j10 - this.f30376c);
    }

    public boolean f(long j10, long j11) {
        v3.g gVar = (v3.g) this.f30380g;
        gVar.getClass();
        return gVar.N() || j11 == -9223372036854775807L || d(j10) <= j11;
    }

    public r g(l1 l1Var, long j10) {
        return new r(l1Var, (String) this.f30379f, (String) this.f30377d, (String) this.f30378e, this.f30375b, j10, (u) this.f30380g);
    }

    public String toString() {
        switch (this.f30374a) {
            case 0:
                String string = ((u) this.f30380g).toString();
                String str = (String) this.f30377d;
                int length = String.valueOf(str).length();
                String str2 = (String) this.f30378e;
                StringBuilder sb2 = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + string.length() + 1);
                l7.o.t(sb2, "Event{appId='", str, "', name='", str2);
                return t.z.g(sb2, "', params=", string, "}");
            default:
                return super.toString();
        }
    }

    public r(l1 l1Var, String str, String str2, String str3, long j10, long j11, u uVar) {
        pa.c0.f(str2);
        pa.c0.f(str3);
        pa.c0.i(uVar);
        this.f30377d = str2;
        this.f30378e = str3;
        this.f30379f = true == TextUtils.isEmpty(str) ? null : str;
        this.f30375b = j10;
        this.f30376c = j11;
        if (j11 != 0 && j11 > j10) {
            s0 s0Var = l1Var.f30265g;
            l1.k(s0Var);
            s0Var.f30413j.h(s0.K(str2), "Event created with reverse previous/current timestamps. appId, name", s0.K(str3));
        }
        this.f30380g = uVar;
    }

    public r(long j10, w3.m mVar, w3.b bVar, j4.e eVar, long j11, v3.g gVar) {
        this.f30375b = j10;
        this.f30378e = mVar;
        this.f30379f = bVar;
        this.f30376c = j11;
        this.f30377d = eVar;
        this.f30380g = gVar;
    }
}
