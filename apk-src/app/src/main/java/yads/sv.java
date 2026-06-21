package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class sv implements ps2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ps2 f43088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f43089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tv f43090d;

    public sv(tv tvVar, ps2 ps2Var) {
        this.f43090d = tvVar;
        this.f43088b = ps2Var;
    }

    @Override // yads.ps2
    public final void a() {
        this.f43088b.a();
    }

    @Override // yads.ps2
    public final boolean isReady() {
        return this.f43090d.f43448e == -9223372036854775807L && this.f43088b.isReady();
    }

    @Override // yads.ps2
    public final int a(ox0 ox0Var, sa0 sa0Var, int i) {
        if (this.f43090d.f43448e != -9223372036854775807L) {
            return -3;
        }
        if (this.f43089c) {
            sa0Var.f43049b = 4;
            return -4;
        }
        int iA = this.f43088b.a(ox0Var, sa0Var, i);
        if (iA != -5) {
            tv tvVar = this.f43090d;
            long j10 = tvVar.f43450g;
            if (j10 == Long.MIN_VALUE || ((iA != -4 || sa0Var.f42866f < j10) && !(iA == -3 && tvVar.getBufferedPositionUs() == Long.MIN_VALUE && !sa0Var.f42865e))) {
                return iA;
            }
            sa0Var.b();
            sa0Var.f43049b = 4;
            this.f43089c = true;
            return -4;
        }
        nx0 nx0Var = ox0Var.f41759b;
        nx0Var.getClass();
        int i10 = nx0Var.C;
        if (i10 != 0 || nx0Var.D != 0) {
            tv tvVar2 = this.f43090d;
            if (tvVar2.f43449f != 0) {
                i10 = 0;
            }
            int i11 = tvVar2.f43450g == Long.MIN_VALUE ? nx0Var.D : 0;
            mx0 mx0Var = new mx0(nx0Var);
            mx0Var.A = i10;
            mx0Var.B = i11;
            ox0Var.f41759b = new nx0(mx0Var);
        }
        return -5;
    }

    @Override // yads.ps2
    public final int a(long j10) {
        if (this.f43090d.f43448e != -9223372036854775807L) {
            return -3;
        }
        return this.f43088b.a(j10);
    }
}
