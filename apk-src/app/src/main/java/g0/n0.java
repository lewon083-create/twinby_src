package g0;

import com.google.android.gms.internal.ads.om1;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f19684a = new StringBuilder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f19685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y.a f19687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f19688e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f19689f;

    public n0(y.a aVar) {
        Object obj = new Object();
        this.f19685b = obj;
        this.f19688e = new HashMap();
        this.f19686c = 1;
        synchronized (obj) {
            this.f19687d = aVar;
            this.f19689f = this.f19686c;
        }
    }

    public static void c(t.c0 c0Var, e0 e0Var) {
        if (com.google.android.gms.internal.auth.g.w()) {
            com.google.android.gms.internal.auth.g.E(e0Var.ordinal(), "CX:State[" + c0Var + "]");
        }
    }

    public final m0 a(String str) {
        HashMap map = this.f19688e;
        for (a0.n nVar : map.keySet()) {
            if (str.equals(nVar.b().e())) {
                return (m0) map.get(nVar);
            }
        }
        return null;
    }

    public final void b() {
        boolean zV = com.google.android.gms.internal.auth.g.v("CameraStateRegistry");
        StringBuilder sb2 = this.f19684a;
        if (zV) {
            sb2.setLength(0);
            sb2.append("Recalculating open cameras:\n");
            sb2.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            sb2.append("-------------------------------------------------------------------\n");
        }
        int i = 0;
        for (Map.Entry entry : this.f19688e.entrySet()) {
            if (com.google.android.gms.internal.auth.g.v("CameraStateRegistry")) {
                sb2.append(String.format(Locale.US, "%-45s%-22s\n", ((a0.n) entry.getKey()).toString(), ((m0) entry.getValue()).f19654a != null ? ((m0) entry.getValue()).f19654a.toString() : "UNKNOWN"));
            }
            e0 e0Var = ((m0) entry.getValue()).f19654a;
            if (e0Var != null && e0Var.f19555b) {
                i++;
            }
        }
        if (com.google.android.gms.internal.auth.g.v("CameraStateRegistry")) {
            sb2.append("-------------------------------------------------------------------\n");
            Locale locale = Locale.US;
            sb2.append(om1.j("Open count: ", i, " (Max allowed: ", this.f19686c, ")"));
            com.google.android.gms.internal.auth.g.e("CameraStateRegistry", sb2.toString());
        }
        this.f19689f = Math.max(this.f19686c - i, 0);
    }

    public final boolean d(t.c0 c0Var) {
        boolean z5;
        synchronized (this.f19685b) {
            try {
                m0 m0Var = (m0) this.f19688e.get(c0Var);
                f2.g.g(m0Var, "Camera must first be registered with registerCamera()");
                z5 = true;
                if (com.google.android.gms.internal.auth.g.v("CameraStateRegistry")) {
                    this.f19684a.setLength(0);
                    StringBuilder sb2 = this.f19684a;
                    Locale locale = Locale.US;
                    int i = this.f19689f;
                    e0 e0Var = m0Var.f19654a;
                    boolean z10 = e0Var != null && e0Var.f19555b;
                    sb2.append("tryOpenCamera(" + c0Var + ") [Available Cameras: " + i + ", Already Open: " + z10 + " (Previous state: " + m0Var.f19654a + ")]");
                }
                if (this.f19689f > 0) {
                    e0 e0Var2 = e0.OPENING;
                    m0Var.f19654a = e0Var2;
                    c(c0Var, e0Var2);
                } else {
                    e0 e0Var3 = m0Var.f19654a;
                    if (e0Var3 != null && e0Var3.f19555b) {
                        e0 e0Var22 = e0.OPENING;
                        m0Var.f19654a = e0Var22;
                        c(c0Var, e0Var22);
                    } else {
                        z5 = false;
                    }
                }
                if (com.google.android.gms.internal.auth.g.v("CameraStateRegistry")) {
                    StringBuilder sb3 = this.f19684a;
                    Locale locale2 = Locale.US;
                    sb3.append(" --> ".concat(z5 ? "SUCCESS" : "FAIL"));
                    com.google.android.gms.internal.auth.g.e("CameraStateRegistry", this.f19684a.toString());
                }
                if (z5) {
                    b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z5;
    }

    public final boolean e(String str, String str2) {
        synchronized (this.f19685b) {
            try {
                boolean z5 = true;
                if (this.f19687d.b() != 2) {
                    return true;
                }
                m0 m0VarA = a(str);
                e0 e0Var = m0VarA != null ? m0VarA.f19654a : null;
                m0 m0VarA2 = str2 != null ? a(str2) : null;
                e0 e0Var2 = m0VarA2 != null ? m0VarA2.f19654a : null;
                e0 e0Var3 = e0.OPEN;
                boolean z10 = e0Var3.equals(e0Var) || e0.CONFIGURED.equals(e0Var);
                boolean z11 = e0Var3.equals(e0Var2) || e0.CONFIGURED.equals(e0Var2);
                if (!z10 || !z11) {
                    z5 = false;
                }
                return z5;
            } finally {
            }
        }
    }
}
