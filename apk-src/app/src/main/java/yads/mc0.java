package yads;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class mc0 extends ko {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lc0 f40858e;

    public mc0(lc0 lc0Var, long j10, long j11) {
        super(j10, j11);
        this.f40858e = lc0Var;
    }

    @Override // yads.ak1
    public final long a() {
        long j10 = this.f40298d;
        if (j10 < this.f40296b || j10 > this.f40297c) {
            throw new NoSuchElementException();
        }
        return this.f40858e.a(j10);
    }

    @Override // yads.ak1
    public final long b() {
        long j10 = this.f40298d;
        if (j10 < this.f40296b || j10 > this.f40297c) {
            throw new NoSuchElementException();
        }
        lc0 lc0Var = this.f40858e;
        return lc0Var.f40483d.a(j10 - lc0Var.f40485f);
    }
}
