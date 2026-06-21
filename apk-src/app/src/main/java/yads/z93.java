package yads;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class z93 implements u43 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v93 f45293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f45294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f45295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f45296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f45297f;

    public z93(v93 v93Var, HashMap map, HashMap map2, HashMap map3) {
        this.f45293b = v93Var;
        this.f45296e = map2;
        this.f45297f = map3;
        this.f45295d = Collections.unmodifiableMap(map);
        this.f45294c = v93Var.a();
    }

    @Override // yads.u43
    public final long a(int i) {
        return this.f45294c[i];
    }

    @Override // yads.u43
    public final List b(long j10) {
        return this.f45293b.a(j10, this.f45295d, this.f45296e, this.f45297f);
    }

    @Override // yads.u43
    public final int a() {
        return this.f45294c.length;
    }

    @Override // yads.u43
    public final int a(long j10) {
        int iA = lb3.a(this.f45294c, j10, false);
        if (iA < this.f45294c.length) {
            return iA;
        }
        return -1;
    }
}
