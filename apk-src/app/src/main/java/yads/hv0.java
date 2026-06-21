package yads;

import java.util.Iterator;
import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class hv0 implements ch3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5 f39339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j62 f39340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c62 f39341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Iterator f39342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z30 f39343e;

    public hv0(w5 w5Var, j62 j62Var, c62 c62Var, Iterator it, z30 z30Var) {
        this.f39339a = w5Var;
        this.f39340b = j62Var;
        this.f39341c = c62Var;
        this.f39342d = it;
        this.f39343e = z30Var;
    }

    @Override // yads.ch3
    public final void a() {
        if (this.f39342d.hasNext()) {
            Pair pair = (Pair) this.f39342d.next();
            String str = (String) pair.f27469b;
            String str2 = (String) pair.f27470c;
            w5 w5Var = this.f39339a;
            j62 j62Var = this.f39340b;
            c62 c62Var = this.f39341c;
            c62Var.a(str, new hv0(w5Var, j62Var, c62Var, this.f39342d, this.f39343e), str2);
        }
    }

    @Override // yads.ch3
    public final void b() {
        this.f39343e.a(y30.f44899f);
    }

    @Override // yads.ch3
    public final void c() {
        a();
    }
}
