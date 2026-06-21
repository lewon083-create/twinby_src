package yads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ql0 implements vl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f42332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p73[] f42333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f42334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f42335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f42336e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f42337f = -9223372036854775807L;

    public ql0(List list) {
        this.f42332a = list;
        this.f42333b = new p73[list.size()];
    }

    @Override // yads.vl0
    public final void a(lb2 lb2Var) {
        if (this.f42334c) {
            if (this.f42335d == 2) {
                if (lb2Var.f40465c - lb2Var.f40464b == 0) {
                    return;
                }
                if (lb2Var.m() != 32) {
                    this.f42334c = false;
                }
                this.f42335d--;
                if (!this.f42334c) {
                    return;
                }
            }
            if (this.f42335d == 1) {
                if (lb2Var.f40465c - lb2Var.f40464b == 0) {
                    return;
                }
                if (lb2Var.m() != 0) {
                    this.f42334c = false;
                }
                this.f42335d--;
                if (!this.f42334c) {
                    return;
                }
            }
            int i = lb2Var.f40464b;
            int i10 = lb2Var.f40465c - i;
            for (p73 p73Var : this.f42333b) {
                lb2Var.e(i);
                p73Var.a(i10, lb2Var);
            }
            this.f42336e += i10;
        }
    }

    @Override // yads.vl0
    public final void b() {
        if (this.f42334c) {
            if (this.f42337f != -9223372036854775807L) {
                for (p73 p73Var : this.f42333b) {
                    p73Var.a(this.f42337f, 1, this.f42336e, 0, null);
                }
            }
            this.f42334c = false;
        }
    }

    @Override // yads.vl0
    public final void a(qq0 qq0Var, o93 o93Var) {
        for (int i = 0; i < this.f42333b.length; i++) {
            l93 l93Var = (l93) this.f42332a.get(i);
            o93Var.a();
            o93Var.b();
            p73 p73VarA = qq0Var.a(o93Var.f41501d, 3);
            mx0 mx0Var = new mx0();
            o93Var.b();
            mx0Var.f41066a = o93Var.f41502e;
            mx0Var.f41075k = "application/dvbsubs";
            mx0Var.f41077m = Collections.singletonList(l93Var.f40458b);
            mx0Var.f41068c = l93Var.f40457a;
            p73VarA.a(new nx0(mx0Var));
            this.f42333b[i] = p73VarA;
        }
    }

    @Override // yads.vl0
    public final void a(int i, long j10) {
        if ((i & 4) == 0) {
            return;
        }
        this.f42334c = true;
        if (j10 != -9223372036854775807L) {
            this.f42337f = j10;
        }
        this.f42336e = 0;
        this.f42335d = 2;
    }

    @Override // yads.vl0
    public final void a() {
        this.f42334c = false;
        this.f42337f = -9223372036854775807L;
    }
}
