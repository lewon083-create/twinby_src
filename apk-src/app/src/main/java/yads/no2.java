package yads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class no2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nx0 f41309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r51 f41310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f41311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f41312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final rl2 f41313e;

    public no2(nx0 nx0Var, r51 r51Var, kx2 kx2Var, ArrayList arrayList) {
        ni.a(!r51Var.isEmpty());
        this.f41309a = nx0Var;
        this.f41310b = r51.a((Collection) r51Var);
        this.f41312d = Collections.unmodifiableList(arrayList);
        this.f41313e = kx2Var.a(this);
        this.f41311c = kx2Var.a();
    }

    public abstract String c();

    public abstract i30 d();

    public abstract rl2 e();

    public final rl2 f() {
        return this.f41313e;
    }
}
