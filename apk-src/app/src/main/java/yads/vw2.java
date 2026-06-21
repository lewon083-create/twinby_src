package yads;

import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class vw2 implements p93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uw2 f44210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb2 f44211b = new lb2(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f44212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f44213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f44214e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f44215f;

    public vw2(uw2 uw2Var) {
        this.f44210a = uw2Var;
    }

    @Override // yads.p93
    public final void a(int i, lb2 lb2Var) {
        boolean z5 = (i & 1) != 0;
        int iM = z5 ? lb2Var.f40464b + lb2Var.m() : -1;
        if (this.f44215f) {
            if (!z5) {
                return;
            }
            this.f44215f = false;
            lb2Var.e(iM);
            this.f44213d = 0;
        }
        while (true) {
            int i10 = lb2Var.f40465c - lb2Var.f40464b;
            if (i10 <= 0) {
                return;
            }
            int i11 = this.f44213d;
            if (i11 < 3) {
                if (i11 == 0) {
                    int iM2 = lb2Var.m();
                    lb2Var.e(lb2Var.f40464b - 1);
                    if (iM2 == 255) {
                        this.f44215f = true;
                        return;
                    }
                }
                int iMin = Math.min(lb2Var.f40465c - lb2Var.f40464b, 3 - this.f44213d);
                lb2Var.a(this.f44211b.f40463a, this.f44213d, iMin);
                int i12 = this.f44213d + iMin;
                this.f44213d = i12;
                if (i12 == 3) {
                    this.f44211b.e(0);
                    this.f44211b.d(3);
                    lb2 lb2Var2 = this.f44211b;
                    lb2Var2.e(lb2Var2.f40464b + 1);
                    int iM3 = this.f44211b.m();
                    int iM4 = this.f44211b.m();
                    this.f44214e = (iM3 & 128) != 0;
                    int i13 = (((iM3 & 15) << 8) | iM4) + 3;
                    this.f44212c = i13;
                    byte[] bArr = this.f44211b.f40463a;
                    if (bArr.length < i13) {
                        this.f44211b.a(Math.min(4098, Math.max(i13, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(i10, this.f44212c - i11);
                lb2Var.a(this.f44211b.f40463a, this.f44213d, iMin2);
                int i14 = this.f44213d + iMin2;
                this.f44213d = i14;
                int i15 = this.f44212c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (this.f44214e) {
                        byte[] bArr2 = this.f44211b.f40463a;
                        int i16 = -1;
                        for (int i17 = 0; i17 < i15; i17++) {
                            i16 = lb3.f40478n[((i16 >>> 24) ^ (bArr2[i17] & 255)) & KotlinVersion.MAX_COMPONENT_VALUE] ^ (i16 << 8);
                        }
                        int i18 = lb3.f40466a;
                        if (i16 != 0) {
                            this.f44215f = true;
                            return;
                        }
                        this.f44211b.d(this.f44212c - 4);
                    } else {
                        this.f44211b.d(i15);
                    }
                    this.f44211b.e(0);
                    this.f44210a.a(this.f44211b);
                    this.f44213d = 0;
                }
            }
        }
    }

    @Override // yads.p93
    public final void a(b73 b73Var, qq0 qq0Var, o93 o93Var) {
        this.f44210a.a(b73Var, qq0Var, o93Var);
        this.f44215f = true;
    }

    @Override // yads.p93
    public final void a() {
        this.f44215f = true;
    }
}
