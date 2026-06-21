package id;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.f1;
import com.google.android.gms.internal.measurement.g0;
import com.google.android.gms.internal.measurement.m1;
import com.google.android.gms.internal.measurement.w0;
import com.google.android.gms.internal.measurement.x0;
import com.google.android.gms.internal.measurement.y0;
import com.google.android.gms.internal.measurement.z0;
import java.util.List;
import java.util.Map;
import java.util.Random;
import ob.l2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m1 f21300a;

    public e(m1 m1Var) {
        this.f21300a = m1Var;
    }

    @Override // ob.l2
    public final void W(Bundle bundle) {
        m1 m1Var = this.f21300a;
        m1Var.c(new x0(m1Var, bundle, 0));
    }

    @Override // ob.l2
    public final void c0(String str) {
        m1 m1Var = this.f21300a;
        m1Var.c(new z0(m1Var, str, 1));
    }

    @Override // ob.l2
    public final String d() {
        g0 g0Var = new g0();
        m1 m1Var = this.f21300a;
        m1Var.c(new f1(m1Var, g0Var, 1, false));
        return g0Var.l0(50L);
    }

    @Override // ob.l2
    public final long e() {
        g0 g0Var = new g0();
        m1 m1Var = this.f21300a;
        m1Var.c(new f1(m1Var, g0Var, 2, false));
        Long l10 = (Long) g0.D0(g0Var.n0(500L), Long.class);
        if (l10 != null) {
            return l10.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
        int i = m1Var.f13880c + 1;
        m1Var.f13880c = i;
        return jNextLong + ((long) i);
    }

    @Override // ob.l2
    public final String f() {
        g0 g0Var = new g0();
        m1 m1Var = this.f21300a;
        m1Var.c(new f1(m1Var, g0Var, 4, false));
        return g0Var.l0(500L);
    }

    @Override // ob.l2
    public final void f0(String str) {
        m1 m1Var = this.f21300a;
        m1Var.c(new z0(m1Var, str, 2));
    }

    @Override // ob.l2
    public final void g0(String str, String str2, Bundle bundle) {
        m1 m1Var = this.f21300a;
        m1Var.c(new w0(m1Var, str, str2, bundle, true));
    }

    @Override // ob.l2
    public final void h0(String str, String str2, Bundle bundle) {
        m1 m1Var = this.f21300a;
        m1Var.c(new y0(m1Var, str, str2, bundle));
    }

    @Override // ob.l2
    public final List i0(String str, String str2) {
        return this.f21300a.f(str, str2);
    }

    @Override // ob.l2
    public final int j0(String str) {
        return this.f21300a.b(str);
    }

    @Override // ob.l2
    public final Map k0(String str, String str2, boolean z5) {
        return this.f21300a.a(str, str2, z5);
    }

    @Override // ob.l2
    public final String m() {
        g0 g0Var = new g0();
        m1 m1Var = this.f21300a;
        m1Var.c(new f1(m1Var, g0Var, 3, false));
        return g0Var.l0(500L);
    }

    @Override // ob.l2
    public final String n() {
        g0 g0Var = new g0();
        m1 m1Var = this.f21300a;
        m1Var.c(new f1(m1Var, g0Var, 0, false));
        return g0Var.l0(500L);
    }
}
