package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ju implements ps2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lu f39979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final os2 f39980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f39981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f39982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lu f39983f;

    public ju(lu luVar, lu luVar2, os2 os2Var, int i) {
        this.f39983f = luVar;
        this.f39979b = luVar2;
        this.f39980c = os2Var;
        this.f39981d = i;
    }

    @Override // yads.ps2
    public final void a() {
    }

    @Override // yads.ps2
    public final boolean isReady() {
        return !this.f39983f.c() && this.f39980c.a(this.f39983f.f40683x);
    }

    @Override // yads.ps2
    public final int a(ox0 ox0Var, sa0 sa0Var, int i) {
        if (this.f39983f.c()) {
            return -3;
        }
        jo joVar = this.f39983f.f40682w;
        if (joVar != null) {
            int iA = joVar.a(this.f39981d + 1);
            os2 os2Var = this.f39980c;
            if (iA <= os2Var.f41709q + os2Var.f41711s) {
                return -3;
            }
        }
        if (!this.f39982e) {
            lu luVar = this.f39983f;
            dn1 dn1Var = luVar.f40668h;
            int[] iArr = luVar.f40663c;
            int i10 = this.f39981d;
            dn1Var.a(new jm1(1, iArr[i10], luVar.f40664d[i10], 0, null, dn1Var.a(luVar.f40680u), -9223372036854775807L));
            this.f39982e = true;
        }
        return this.f39980c.a(ox0Var, sa0Var, i, this.f39983f.f40683x);
    }

    @Override // yads.ps2
    public final int a(long j10) throws Throwable {
        if (this.f39983f.c()) {
            return 0;
        }
        int iA = this.f39980c.a(j10, this.f39983f.f40683x);
        jo joVar = this.f39983f.f40682w;
        if (joVar != null) {
            int iA2 = joVar.a(this.f39981d + 1);
            os2 os2Var = this.f39980c;
            iA = Math.min(iA, iA2 - (os2Var.f41709q + os2Var.f41711s));
        }
        os2 os2Var2 = this.f39980c;
        synchronized (os2Var2) {
            if (iA >= 0) {
                int i = os2Var2.f41711s + iA;
                if (i <= os2Var2.f41708p) {
                    os2Var2.f41711s = i;
                }
            }
            throw new IllegalArgumentException();
        }
        if (iA > 0 && !this.f39982e) {
            lu luVar = this.f39983f;
            dn1 dn1Var = luVar.f40668h;
            int[] iArr = luVar.f40663c;
            int i10 = this.f39981d;
            dn1Var.a(new jm1(1, iArr[i10], luVar.f40664d[i10], 0, null, dn1Var.a(luVar.f40680u), -9223372036854775807L));
            this.f39982e = true;
        }
        return iA;
    }
}
