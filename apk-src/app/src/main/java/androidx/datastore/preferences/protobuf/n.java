package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends rl.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f1445f = Logger.getLogger(n.class.getName());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f1446g = p1.f1461e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l0 f1447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f1448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final nl.f f1451e;

    public n(nl.f fVar, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i, 20);
        this.f1448b = new byte[iMax];
        this.f1449c = iMax;
        this.f1451e = fVar;
    }

    public static int P(int i, h hVar) {
        int iR = R(i);
        int size = hVar.size();
        return S(size) + size + iR;
    }

    public static int Q(String str) {
        int length;
        try {
            length = s1.a(str);
        } catch (r1 unused) {
            length = str.getBytes(c0.f1368a).length;
        }
        return S(length) + length;
    }

    public static int R(int i) {
        return S(i << 3);
    }

    public static int S(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int T(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public final void K(int i) {
        int i10 = this.f1450d;
        int i11 = i10 + 1;
        this.f1450d = i11;
        byte b2 = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
        byte[] bArr = this.f1448b;
        bArr[i10] = b2;
        int i12 = i10 + 2;
        this.f1450d = i12;
        bArr[i11] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i13 = i10 + 3;
        this.f1450d = i13;
        bArr[i12] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f1450d = i10 + 4;
        bArr[i13] = (byte) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public final void L(long j10) {
        int i = this.f1450d;
        int i10 = i + 1;
        this.f1450d = i10;
        byte[] bArr = this.f1448b;
        bArr[i] = (byte) (j10 & 255);
        int i11 = i + 2;
        this.f1450d = i11;
        bArr[i10] = (byte) ((j10 >> 8) & 255);
        int i12 = i + 3;
        this.f1450d = i12;
        bArr[i11] = (byte) ((j10 >> 16) & 255);
        int i13 = i + 4;
        this.f1450d = i13;
        bArr[i12] = (byte) (255 & (j10 >> 24));
        int i14 = i + 5;
        this.f1450d = i14;
        bArr[i13] = (byte) (((int) (j10 >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i15 = i + 6;
        this.f1450d = i15;
        bArr[i14] = (byte) (((int) (j10 >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i16 = i + 7;
        this.f1450d = i16;
        bArr[i15] = (byte) (((int) (j10 >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f1450d = i + 8;
        bArr[i16] = (byte) (((int) (j10 >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public final void M(int i, int i10) {
        N((i << 3) | i10);
    }

    public final void N(int i) {
        boolean z5 = f1446g;
        byte[] bArr = this.f1448b;
        if (z5) {
            while ((i & (-128)) != 0) {
                int i10 = this.f1450d;
                this.f1450d = i10 + 1;
                p1.j(bArr, i10, (byte) ((i | 128) & KotlinVersion.MAX_COMPONENT_VALUE));
                i >>>= 7;
            }
            int i11 = this.f1450d;
            this.f1450d = i11 + 1;
            p1.j(bArr, i11, (byte) i);
            return;
        }
        while ((i & (-128)) != 0) {
            int i12 = this.f1450d;
            this.f1450d = i12 + 1;
            bArr[i12] = (byte) ((i | 128) & KotlinVersion.MAX_COMPONENT_VALUE);
            i >>>= 7;
        }
        int i13 = this.f1450d;
        this.f1450d = i13 + 1;
        bArr[i13] = (byte) i;
    }

    public final void O(long j10) {
        boolean z5 = f1446g;
        byte[] bArr = this.f1448b;
        if (z5) {
            while ((j10 & (-128)) != 0) {
                int i = this.f1450d;
                this.f1450d = i + 1;
                p1.j(bArr, i, (byte) ((((int) j10) | 128) & KotlinVersion.MAX_COMPONENT_VALUE));
                j10 >>>= 7;
            }
            int i10 = this.f1450d;
            this.f1450d = i10 + 1;
            p1.j(bArr, i10, (byte) j10);
            return;
        }
        while ((j10 & (-128)) != 0) {
            int i11 = this.f1450d;
            this.f1450d = i11 + 1;
            bArr[i11] = (byte) ((((int) j10) | 128) & KotlinVersion.MAX_COMPONENT_VALUE);
            j10 >>>= 7;
        }
        int i12 = this.f1450d;
        this.f1450d = i12 + 1;
        bArr[i12] = (byte) j10;
    }

    public final void U() throws IOException {
        this.f1451e.write(this.f1448b, 0, this.f1450d);
        this.f1450d = 0;
    }

    public final void V(int i) throws IOException {
        if (this.f1449c - this.f1450d < i) {
            U();
        }
    }

    public final void W(byte b2) throws IOException {
        if (this.f1450d == this.f1449c) {
            U();
        }
        int i = this.f1450d;
        this.f1450d = i + 1;
        this.f1448b[i] = b2;
    }

    public final void X(byte[] bArr, int i, int i10) throws IOException {
        int i11 = this.f1450d;
        int i12 = this.f1449c;
        int i13 = i12 - i11;
        byte[] bArr2 = this.f1448b;
        if (i13 >= i10) {
            System.arraycopy(bArr, i, bArr2, i11, i10);
            this.f1450d += i10;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i11, i13);
        int i14 = i + i13;
        int i15 = i10 - i13;
        this.f1450d = i12;
        U();
        if (i15 > i12) {
            this.f1451e.write(bArr, i14, i15);
        } else {
            System.arraycopy(bArr, i14, bArr2, 0, i15);
            this.f1450d = i15;
        }
    }

    public final void Y(int i, boolean z5) throws IOException {
        V(11);
        M(i, 0);
        byte b2 = z5 ? (byte) 1 : (byte) 0;
        int i10 = this.f1450d;
        this.f1450d = i10 + 1;
        this.f1448b[i10] = b2;
    }

    public final void Z(int i, h hVar) {
        k0(i, 2);
        a0(hVar);
    }

    public final void a0(h hVar) throws IOException {
        m0(hVar.size());
        y(hVar.f1408c, hVar.g(), hVar.size());
    }

    public final void b0(int i, int i10) {
        V(14);
        M(i, 5);
        K(i10);
    }

    public final void c0(int i) throws IOException {
        V(4);
        K(i);
    }

    public final void d0(int i, long j10) {
        V(18);
        M(i, 1);
        L(j10);
    }

    public final void e0(long j10) throws IOException {
        V(8);
        L(j10);
    }

    public final void f0(int i, int i10) throws IOException {
        V(20);
        M(i, 0);
        if (i10 >= 0) {
            N(i10);
        } else {
            O(i10);
        }
    }

    public final void g0(int i) throws IOException {
        if (i >= 0) {
            m0(i);
        } else {
            o0(i);
        }
    }

    public final void h0(int i, a aVar, c1 c1Var) throws IOException {
        k0(i, 2);
        m0(aVar.a(c1Var));
        c1Var.b(aVar, this.f1447a);
    }

    public final void i0(int i, String str) throws IOException {
        k0(i, 2);
        j0(str);
    }

    public final void j0(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iS = S(length);
            int i = iS + length;
            int i10 = this.f1449c;
            if (i > i10) {
                byte[] bArr = new byte[length];
                int iF = s1.f1472a.f(0, length, str, bArr);
                m0(iF);
                X(bArr, 0, iF);
                return;
            }
            if (i > i10 - this.f1450d) {
                U();
            }
            int iS2 = S(str.length());
            int i11 = this.f1450d;
            byte[] bArr2 = this.f1448b;
            try {
                if (iS2 == iS) {
                    int i12 = i11 + iS2;
                    this.f1450d = i12;
                    int iF2 = s1.f1472a.f(i12, i10 - i12, str, bArr2);
                    this.f1450d = i11;
                    N((iF2 - i11) - iS2);
                    this.f1450d = iF2;
                } else {
                    int iA = s1.a(str);
                    N(iA);
                    this.f1450d = s1.f1472a.f(this.f1450d, iA, str, bArr2);
                }
            } catch (r1 e3) {
                this.f1450d = i11;
                throw e3;
            } catch (ArrayIndexOutOfBoundsException e7) {
                throw new m(e7);
            }
        } catch (r1 e10) {
            f1445f.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e10);
            byte[] bytes = str.getBytes(c0.f1368a);
            try {
                m0(bytes.length);
                y(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e11) {
                throw new m(e11);
            }
        }
    }

    public final void k0(int i, int i10) {
        m0((i << 3) | i10);
    }

    public final void l0(int i, int i10) throws IOException {
        V(20);
        M(i, 0);
        N(i10);
    }

    public final void m0(int i) throws IOException {
        V(5);
        N(i);
    }

    public final void n0(int i, long j10) {
        V(20);
        M(i, 0);
        O(j10);
    }

    public final void o0(long j10) throws IOException {
        V(10);
        O(j10);
    }

    @Override // rl.b
    public final void y(byte[] bArr, int i, int i10) throws IOException {
        X(bArr, i, i10);
    }
}
