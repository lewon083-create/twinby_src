package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class dz1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f4767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f4768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f4769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f4770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f4771e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f4772f;

    public static m6 d(m6 m6Var, zq1 zq1Var, a4.g gVar, tk0 tk0Var) {
        if (zq1Var.q(1073741824)) {
            long j10 = gVar.f430c;
            int iL = 1;
            tk0Var.y(1);
            m6 m6VarF = f(m6Var, j10, tk0Var.f10641a, 1);
            long j11 = j10 + 1;
            byte b2 = tk0Var.f10641a[0];
            int i = b2 & 128;
            int i10 = b2 & 127;
            cp1 cp1Var = zq1Var.f13078e;
            byte[] bArr = cp1Var.f4279a;
            if (bArr == null) {
                cp1Var.f4279a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z5 = i != 0;
            m6Var = f(m6VarF, j11, cp1Var.f4279a, i10);
            long j12 = j11 + ((long) i10);
            if (z5) {
                tk0Var.y(2);
                m6Var = f(m6Var, j12, tk0Var.f10641a, 2);
                j12 += 2;
                iL = tk0Var.L();
            }
            int[] iArr = cp1Var.f4282d;
            if (iArr == null || iArr.length < iL) {
                iArr = new int[iL];
            }
            int[] iArr2 = cp1Var.f4283e;
            if (iArr2 == null || iArr2.length < iL) {
                iArr2 = new int[iL];
            }
            if (z5) {
                int i11 = iL * 6;
                tk0Var.y(i11);
                m6Var = f(m6Var, j12, tk0Var.f10641a, i11);
                j12 += (long) i11;
                tk0Var.E(0);
                for (int i12 = 0; i12 < iL; i12++) {
                    iArr[i12] = tk0Var.L();
                    iArr2[i12] = tk0Var.h();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = gVar.f431d - ((int) (j12 - gVar.f430c));
            }
            v2 v2Var = (v2) gVar.f432e;
            String str = cq0.f4293a;
            byte[] bArr2 = v2Var.f11210b;
            byte[] bArr3 = cp1Var.f4279a;
            int i13 = v2Var.f11209a;
            int i14 = v2Var.f11211c;
            int i15 = v2Var.f11212d;
            cp1Var.f4284f = iL;
            cp1Var.f4282d = iArr;
            cp1Var.f4283e = iArr2;
            cp1Var.f4280b = bArr2;
            cp1Var.f4279a = bArr3;
            cp1Var.f4281c = i13;
            cp1Var.f4285g = i14;
            cp1Var.f4286h = i15;
            MediaCodec.CryptoInfo cryptoInfo = cp1Var.i;
            cryptoInfo.numSubSamples = iL;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i13;
            ut utVar = (ut) cp1Var.f4287j;
            utVar.getClass();
            MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) utVar.f11062d;
            pattern.set(i14, i15);
            ((MediaCodec.CryptoInfo) utVar.f11061c).setPattern(pattern);
            long j13 = gVar.f430c;
            int i16 = (int) (j12 - j13);
            gVar.f430c = j13 + ((long) i16);
            gVar.f431d -= i16;
        }
        if (!zq1Var.q(268435456)) {
            zq1Var.s(gVar.f431d);
            return e(m6Var, gVar.f430c, zq1Var.f13079f, gVar.f431d);
        }
        tk0Var.y(4);
        m6 m6VarF2 = f(m6Var, gVar.f430c, tk0Var.f10641a, 4);
        int iH = tk0Var.h();
        gVar.f430c += 4;
        gVar.f431d -= 4;
        zq1Var.s(iH);
        m6 m6VarE = e(m6VarF2, gVar.f430c, zq1Var.f13079f, iH);
        gVar.f430c += (long) iH;
        int i17 = gVar.f431d - iH;
        gVar.f431d = i17;
        ByteBuffer byteBuffer = zq1Var.i;
        if (byteBuffer == null || byteBuffer.capacity() < i17) {
            zq1Var.i = ByteBuffer.allocate(i17);
        } else {
            zq1Var.i.clear();
        }
        return e(m6VarE, gVar.f430c, zq1Var.i, gVar.f431d);
    }

    public static m6 e(m6 m6Var, long j10, ByteBuffer byteBuffer, int i) {
        while (j10 >= m6Var.f7789c) {
            m6Var = (m6) m6Var.f7791e;
        }
        while (i > 0) {
            int iMin = Math.min(i, (int) (m6Var.f7789c - j10));
            h hVar = (h) m6Var.f7790d;
            byte[] bArr = hVar.f5993a;
            long j11 = j10 - m6Var.f7788b;
            hVar.getClass();
            byteBuffer.put(bArr, (int) j11, iMin);
            i -= iMin;
            j10 += (long) iMin;
            if (j10 == m6Var.f7789c) {
                m6Var = (m6) m6Var.f7791e;
            }
        }
        return m6Var;
    }

    public static m6 f(m6 m6Var, long j10, byte[] bArr, int i) {
        while (j10 >= m6Var.f7789c) {
            m6Var = (m6) m6Var.f7791e;
        }
        int i10 = i;
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (m6Var.f7789c - j10));
            h hVar = (h) m6Var.f7790d;
            byte[] bArr2 = hVar.f5993a;
            long j11 = j10 - m6Var.f7788b;
            hVar.getClass();
            System.arraycopy(bArr2, (int) j11, bArr, i - i10, iMin);
            i10 -= iMin;
            j10 += (long) iMin;
            if (j10 == m6Var.f7789c) {
                m6Var = (m6) m6Var.f7791e;
            }
        }
        return m6Var;
    }

    public he.d a() {
        return new he.d((JSONObject) this.f4768b, (Date) this.f4769c, (JSONArray) this.f4770d, (JSONObject) this.f4771e, this.f4767a, (JSONArray) this.f4772f);
    }

    public void b(long j10) {
        m6 m6Var;
        if (j10 != -1) {
            while (true) {
                m6Var = (m6) this.f4770d;
                if (j10 < m6Var.f7789c) {
                    break;
                }
                ((i) this.f4768b).i((h) m6Var.f7790d);
                m6 m6Var2 = (m6) this.f4770d;
                m6Var2.f7790d = null;
                m6 m6Var3 = (m6) m6Var2.f7791e;
                m6Var2.f7791e = null;
                this.f4770d = m6Var3;
            }
            if (((m6) this.f4771e).f7788b < m6Var.f7788b) {
                this.f4771e = m6Var;
            }
        }
    }

    public int c(int i) {
        m6 m6Var = (m6) this.f4772f;
        if (((h) m6Var.f7790d) == null) {
            h hVarH = ((i) this.f4768b).h();
            m6 m6Var2 = new m6(((m6) this.f4772f).f7789c);
            m6Var.f7790d = hVarH;
            m6Var.f7791e = m6Var2;
        }
        return Math.min(i, (int) (((m6) this.f4772f).f7789c - this.f4767a));
    }
}
