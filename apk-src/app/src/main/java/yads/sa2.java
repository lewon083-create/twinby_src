package yads;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class sa2 extends c43 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[] f42869o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final byte[] f42870p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f42871n;

    public static boolean a(lb2 lb2Var, byte[] bArr) {
        int i = lb2Var.f40465c;
        int i10 = lb2Var.f40464b;
        if (i - i10 < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        lb2Var.a(bArr2, 0, bArr.length);
        lb2Var.e(i10);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // yads.c43
    public final long a(lb2 lb2Var) {
        int i;
        byte[] bArr = lb2Var.f40463a;
        byte b2 = bArr[0];
        int i10 = b2 & 255;
        int i11 = b2 & 3;
        if (i11 != 0) {
            i = 2;
            if (i11 != 1 && i11 != 2) {
                i = bArr[1] & 63;
            }
        } else {
            i = 1;
        }
        int i12 = i10 >> 3;
        int i13 = i12 & 3;
        return (((long) this.i) * (((long) i) * ((long) (i12 >= 16 ? 2500 << i13 : i12 >= 12 ? 10000 << (i12 & 1) : i13 == 3 ? 60000 : 10000 << i13)))) / 1000000;
    }

    @Override // yads.c43
    public final boolean a(lb2 lb2Var, long j10, a43 a43Var) {
        if (a(lb2Var, f42869o)) {
            byte[] bArrCopyOf = Arrays.copyOf(lb2Var.f40463a, lb2Var.f40465c);
            int i = bArrCopyOf[9] & 255;
            ArrayList arrayListA = ta2.a(bArrCopyOf);
            if (a43Var.f36630a != null) {
                return true;
            }
            mx0 mx0Var = new mx0();
            mx0Var.f41075k = "audio/opus";
            mx0Var.f41088x = i;
            mx0Var.f41089y = 48000;
            mx0Var.f41077m = arrayListA;
            a43Var.f36630a = new nx0(mx0Var);
            return true;
        }
        if (a(lb2Var, f42870p)) {
            if (a43Var.f36630a != null) {
                if (this.f42871n) {
                    return true;
                }
                this.f42871n = true;
                lb2Var.e(lb2Var.f40464b + 8);
                vs1 vs1VarA = gn3.a(r51.b(gn3.a(lb2Var, false, false).f37850a));
                if (vs1VarA == null) {
                    return true;
                }
                nx0 nx0Var = a43Var.f36630a;
                nx0Var.getClass();
                mx0 mx0Var2 = new mx0(nx0Var);
                vs1 vs1Var = a43Var.f36630a.f41373k;
                if (vs1Var != null) {
                    us1[] us1VarArr = vs1Var.f44117b;
                    if (us1VarArr.length != 0) {
                        vs1VarA = new vs1((us1[]) lb3.a((Object[]) vs1VarA.f44117b, (Object[]) us1VarArr));
                    }
                }
                mx0Var2.i = vs1VarA;
                a43Var.f36630a = new nx0(mx0Var2);
                return true;
            }
            throw new IllegalStateException();
        }
        if (a43Var.f36630a != null) {
            return false;
        }
        throw new IllegalStateException();
    }

    @Override // yads.c43
    public final void a(boolean z5) {
        super.a(z5);
        if (z5) {
            this.f42871n = false;
        }
    }
}
