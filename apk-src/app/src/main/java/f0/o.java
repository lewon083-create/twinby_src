package f0;

import a0.f0;
import a0.g0;
import android.graphics.Matrix;
import android.graphics.Rect;
import g0.t0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f16530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0 f16531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f16532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f16533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f16534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Matrix f16535g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q f16536h;
    public final String i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ed.d f16538k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f16539l = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f16537j = new ArrayList();

    public o(f0 f0Var, f fVar, q qVar, ed.d dVar, int i) {
        this.f16529a = i;
        this.f16530b = fVar;
        this.f16531c = fVar.f16499e;
        this.f16534f = fVar.i;
        this.f16533e = fVar.f16502h;
        this.f16532d = fVar.f16500f;
        this.f16535g = fVar.f16501g;
        this.f16536h = qVar;
        this.i = String.valueOf(f0Var.hashCode());
        List<t0> list = f0Var.f77a;
        Objects.requireNonNull(list);
        for (t0 t0Var : list) {
            ArrayList arrayList = this.f16537j;
            t0Var.getClass();
            arrayList.add(0);
        }
        this.f16538k = dVar;
    }
}
