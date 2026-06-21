package yads;

import android.content.Context;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ke0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5 f40172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c62 f40173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g72 f40174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f40175d;

    public /* synthetic */ ke0(Context context, w5 w5Var) {
        this(w5Var, new c62(context), new g72());
    }

    public final void a(String str) {
        nj0 nj0Var;
        synchronized (this.f40175d) {
            try {
                c62 c62Var = this.f40173b;
                if (c62Var.f37301c.containsKey(str) && (nj0Var = (nj0) c62Var.f37300b.getValue()) != null) {
                    nj0Var.f41262c++;
                    nj0Var.f41260a.obtainMessage(3, 1, 0, str).sendToTarget();
                }
                Unit unit = Unit.f27471a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public ke0(w5 w5Var, c62 c62Var, g72 g72Var) {
        this.f40172a = w5Var;
        this.f40173b = c62Var;
        this.f40174c = g72Var;
        this.f40175d = new Object();
    }

    public final void a(ty1 ty1Var, j62 j62Var, z30 z30Var) {
        synchronized (this.f40175d) {
            f12 f12Var = ty1Var.f43486a;
            g72 g72Var = this.f40174c;
            g72Var.getClass();
            List<Pair> listG = ek.u.g(ek.u.e(ek.u.e(ek.u.f(ek.u.c(CollectionsKt.w(f12Var.f38323a), new d72(g72Var)), e72.f38042b), b72.f36949b), c72.f37306b));
            if (listG.isEmpty()) {
                j62Var.a();
                return;
            }
            je0 je0Var = new je0(this.f40172a, listG.size(), j62Var, z30Var);
            this.f40172a.a(v5.f43884p, null);
            for (Pair pair : listG) {
                this.f40173b.a((String) pair.f27469b, je0Var, (String) pair.f27470c);
            }
            Unit unit = Unit.f27471a;
        }
    }
}
