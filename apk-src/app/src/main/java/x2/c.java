package x2;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f35721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f35722d;

    public c(byte[] bArr, int i, int i10) {
        this(-1L, bArr, i, i10);
    }

    public static c a(String str) {
        if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
            return new c(new byte[]{(byte) (str.charAt(0) - '0')}, 1, 1);
        }
        byte[] bytes = str.getBytes(g.f35729a0);
        return new c(bytes, 1, bytes.length);
    }

    public static c b(String str) {
        byte[] bytes = str.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(g.f35729a0);
        return new c(bytes, 2, bytes.length);
    }

    public static c c(long j10, ByteOrder byteOrder) {
        return d(new long[]{j10}, byteOrder);
    }

    public static c d(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[g.R[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        for (long j10 : jArr) {
            byteBufferWrap.putInt((int) j10);
        }
        return new c(byteBufferWrap.array(), 4, jArr.length);
    }

    public static c e(e[] eVarArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[g.R[5] * eVarArr.length]);
        byteBufferWrap.order(byteOrder);
        for (e eVar : eVarArr) {
            byteBufferWrap.putInt((int) eVar.f35727a);
            byteBufferWrap.putInt((int) eVar.f35728b);
        }
        return new c(byteBufferWrap.array(), 5, eVarArr.length);
    }

    public static c f(int i, ByteOrder byteOrder) {
        return g(new int[]{i}, byteOrder);
    }

    public static c g(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[g.R[3] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i : iArr) {
            byteBufferWrap.putShort((short) i);
        }
        return new c(byteBufferWrap.array(), 3, iArr.length);
    }

    public final double h(ByteOrder byteOrder) {
        Object objK = k(byteOrder);
        if (objK == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objK instanceof String) {
            return Double.parseDouble((String) objK);
        }
        if (objK instanceof long[]) {
            if (((long[]) objK).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objK instanceof int[]) {
            if (((int[]) objK).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objK instanceof double[]) {
            double[] dArr = (double[]) objK;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objK instanceof e[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        e[] eVarArr = (e[]) objK;
        if (eVarArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        e eVar = eVarArr[0];
        return eVar.f35727a / eVar.f35728b;
    }

    public final int i(ByteOrder byteOrder) throws Throwable {
        Object objK = k(byteOrder);
        if (objK == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objK instanceof String) {
            return Integer.parseInt((String) objK);
        }
        if (objK instanceof long[]) {
            long[] jArr = (long[]) objK;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objK instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objK;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final String j(ByteOrder byteOrder) throws Throwable {
        Object objK = k(byteOrder);
        if (objK == null) {
            return null;
        }
        if (objK instanceof String) {
            return (String) objK;
        }
        StringBuilder sb2 = new StringBuilder();
        int i = 0;
        if (objK instanceof long[]) {
            long[] jArr = (long[]) objK;
            while (i < jArr.length) {
                sb2.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb2.append(StringUtils.COMMA);
                }
            }
            return sb2.toString();
        }
        if (objK instanceof int[]) {
            int[] iArr = (int[]) objK;
            while (i < iArr.length) {
                sb2.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb2.append(StringUtils.COMMA);
                }
            }
            return sb2.toString();
        }
        if (objK instanceof double[]) {
            double[] dArr = (double[]) objK;
            while (i < dArr.length) {
                sb2.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb2.append(StringUtils.COMMA);
                }
            }
            return sb2.toString();
        }
        if (!(objK instanceof e[])) {
            return null;
        }
        e[] eVarArr = (e[]) objK;
        while (i < eVarArr.length) {
            sb2.append(eVarArr[i].f35727a);
            sb2.append('/');
            sb2.append(eVarArr[i].f35728b);
            i++;
            if (i != eVarArr.length) {
                sb2.append(StringUtils.COMMA);
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:51), block:B:17:0x0032 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v23, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v24, types: [long[]] */
    /* JADX WARN: Type inference failed for: r14v25, types: [x2.e[]] */
    /* JADX WARN: Type inference failed for: r14v26, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v27, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v28, types: [x2.e[]] */
    /* JADX WARN: Type inference failed for: r14v29, types: [double[]] */
    /* JADX WARN: Type inference failed for: r14v30, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r14v31, types: [double[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable k(java.nio.ByteOrder r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.c.k(java.nio.ByteOrder):java.io.Serializable");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(g.Q[this.f35719a]);
        sb2.append(", data length:");
        return z.d(this.f35722d.length, ")", sb2);
    }

    public c(long j10, byte[] bArr, int i, int i10) {
        this.f35719a = i;
        this.f35720b = i10;
        this.f35721c = j10;
        this.f35722d = bArr;
    }
}
