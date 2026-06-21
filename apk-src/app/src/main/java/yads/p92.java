package yads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class p92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q92 f41846a = new q92();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb2 f41847b = new lb2(0, new byte[65025]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f41848c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f41849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f41850e;

    public final boolean a(ld0 ld0Var) throws InterruptedIOException {
        int i;
        int i10;
        int i11;
        if (this.f41850e) {
            this.f41850e = false;
            this.f41847b.c(0);
        }
        while (true) {
            if (this.f41850e) {
                return true;
            }
            if (this.f41848c < 0) {
                if (!this.f41846a.a(ld0Var, -1L) || !this.f41846a.a(ld0Var, true)) {
                    break;
                }
                q92 q92Var = this.f41846a;
                int i12 = q92Var.f42232d;
                if ((q92Var.f42229a & 1) == 1 && this.f41847b.f40465c == 0) {
                    this.f41849d = 0;
                    int i13 = 0;
                    do {
                        int i14 = this.f41849d;
                        q92 q92Var2 = this.f41846a;
                        if (i14 >= q92Var2.f42231c) {
                            break;
                        }
                        int[] iArr = q92Var2.f42234f;
                        this.f41849d = i14 + 1;
                        i11 = iArr[i14];
                        i13 += i11;
                    } while (i11 == 255);
                    i12 += i13;
                    i10 = this.f41849d;
                } else {
                    i10 = 0;
                }
                try {
                    ld0Var.a(i12);
                    this.f41848c = i10;
                } catch (EOFException unused) {
                }
            }
            int i15 = this.f41848c;
            this.f41849d = 0;
            int i16 = 0;
            do {
                int i17 = this.f41849d;
                int i18 = i15 + i17;
                q92 q92Var3 = this.f41846a;
                if (i18 >= q92Var3.f42231c) {
                    break;
                }
                int[] iArr2 = q92Var3.f42234f;
                this.f41849d = i17 + 1;
                i = iArr2[i18];
                i16 += i;
            } while (i == 255);
            int i19 = this.f41848c + this.f41849d;
            if (i16 > 0) {
                lb2 lb2Var = this.f41847b;
                lb2Var.a(lb2Var.f40465c + i16);
                lb2 lb2Var2 = this.f41847b;
                try {
                    ld0Var.a(lb2Var2.f40463a, lb2Var2.f40465c, i16, false);
                    lb2 lb2Var3 = this.f41847b;
                    lb2Var3.d(lb2Var3.f40465c + i16);
                    this.f41850e = this.f41846a.f42234f[i19 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i19 == this.f41846a.f42231c) {
                i19 = -1;
            }
            this.f41848c = i19;
        }
        return false;
    }

    public final void a() {
        lb2 lb2Var = this.f41847b;
        byte[] bArr = lb2Var.f40463a;
        if (bArr.length == 65025) {
            return;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, Math.max(65025, lb2Var.f40465c));
        int i = this.f41847b.f40465c;
        lb2Var.f40463a = bArrCopyOf;
        lb2Var.f40465c = i;
        lb2Var.f40464b = 0;
    }
}
