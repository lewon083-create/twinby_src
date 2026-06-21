package yads;

import java.util.Map;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class co3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jb2 f37463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zz2 f37464b = new zz2();

    public co3(jb2 jb2Var) {
        this.f37463a = jb2Var;
    }

    public final void a(Map map) {
        zz2 zz2Var = this.f37464b;
        synchronized (zz2Var.f45605a) {
            if (zz2Var.f45606b) {
                return;
            }
            zz2Var.f45606b = true;
            Unit unit = Unit.f27471a;
            a(this, map);
        }
    }

    public static final void a(co3 co3Var, Map map) {
        co3Var.f37463a.setVisibility(0);
        jb2 jb2Var = co3Var.f37463a;
        p11 p11Var = jb2Var.f39815g;
        if (p11Var != null) {
            p11Var.a(jb2Var, map);
        }
    }
}
