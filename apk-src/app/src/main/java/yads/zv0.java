package yads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class zv0 extends c43 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public cw0 f45547n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public yv0 f45548o;

    @Override // yads.c43
    public final long a(lb2 lb2Var) {
        int i;
        int i10;
        int iM;
        byte[] bArr = lb2Var.f40463a;
        int i11 = -1;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i12 = (bArr[2] & 255) >> 4;
        if (i12 == 6 || i12 == 7) {
            lb2Var.e(lb2Var.f40464b + 4);
            lb2Var.s();
        }
        switch (i12) {
            case 1:
                i11 = 192;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                i = i12 - 2;
                i10 = 576;
                i11 = i10 << i;
                break;
            case 6:
                iM = lb2Var.m();
                i11 = iM + 1;
                break;
            case 7:
                iM = lb2Var.r();
                i11 = iM + 1;
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i = i12 - 8;
                i10 = 256;
                i11 = i10 << i;
                break;
        }
        lb2Var.e(0);
        return i11;
    }

    @Override // yads.c43
    public final boolean a(lb2 lb2Var, long j10, a43 a43Var) {
        byte[] bArr = lb2Var.f40463a;
        cw0 cw0Var = this.f45547n;
        if (cw0Var == null) {
            cw0 cw0Var2 = new cw0(17, bArr);
            this.f45547n = cw0Var2;
            a43Var.f36630a = cw0Var2.a(Arrays.copyOfRange(bArr, 9, lb2Var.f40465c), null);
            return true;
        }
        byte b2 = bArr[0];
        if ((b2 & 127) == 3) {
            bw0 bw0VarA = xv0.a(lb2Var);
            cw0 cw0Var3 = new cw0(cw0Var.f37531a, cw0Var.f37532b, cw0Var.f37533c, cw0Var.f37534d, cw0Var.f37535e, cw0Var.f37537g, cw0Var.f37538h, cw0Var.f37539j, bw0VarA, cw0Var.f37541l);
            this.f45547n = cw0Var3;
            this.f45548o = new yv0(cw0Var3, bw0VarA);
            return true;
        }
        if (b2 != -1) {
            return true;
        }
        yv0 yv0Var = this.f45548o;
        if (yv0Var != null) {
            yv0Var.f45156c = j10;
            a43Var.f36631b = yv0Var;
        }
        a43Var.f36630a.getClass();
        return false;
    }

    @Override // yads.c43
    public final void a(boolean z5) {
        super.a(z5);
        if (z5) {
            this.f45547n = null;
            this.f45548o = null;
        }
    }
}
