package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class vc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f11352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f11353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f11354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ac f11355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f11356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public nc f11357f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11358g = 1;

    public static vc a(Object obj) {
        vc vcVar = new vc();
        int[] iArr = {572660336, 1963204074, 810270723, 1168973800, 12304897, -1027511958, 1433925857, 2084420925, 1937477084};
        int i = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        int iH = a0.u.h((i10 & (~i)) | i11, (i & i12) | i13, i14, i15);
        vcVar.r();
        vcVar.f11358g = (i16 % 1937477084) ^ iH;
        vcVar.f11352a = obj;
        return vcVar;
    }

    public static vc b(long j10) {
        vc vcVar = new vc();
        int[] iArr = {269455306, 1628467785, 508432336, 1769894153, 149815616, -1737813993, 468055906, 524872353, 327254586};
        int i = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        int iH = a0.u.h((i10 & (~i)) | i11, (i & i12) | i13, i14, i15);
        vcVar.r();
        vcVar.f11358g = (i16 % 327254586) ^ iH;
        vcVar.f11353b = j10;
        return vcVar;
    }

    public static vc c(double d10) {
        vc vcVar = new vc();
        int[] iArr = {76065818, 1629326670, 912768099, 1092092300, 784816880, -1349977414, 434065736, 1884661237, 1605908235};
        int i = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        int iH = a0.u.h((i10 & (~i)) | i11, (i & i12) | i13, i14, i15);
        vcVar.r();
        vcVar.f11358g = (i16 % 1605908235) ^ iH;
        vcVar.f11354c = d10;
        return vcVar;
    }

    public static vc d(ac acVar) {
        vc vcVar = new vc();
        int[] iArr = {1143408282, 544368152, 1884037077, 79323401, 1472762119, -801477845, 201305624, 1470503465, 1402586708};
        int i = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        int iH = a0.u.h((i10 & (~i)) | i11, (i & i12) | i13, i14, i15);
        vcVar.r();
        vcVar.f11358g = (i16 % 1402586708) ^ iH;
        vcVar.f11355d = acVar;
        return vcVar;
    }

    public static vc e(ArrayList arrayList) {
        vc vcVar = new vc();
        int[] iArr = {231602422, 370241669, 619070592, 319896591, 694865338, 1425770340, 39950860, 555996658, 324763920};
        int i = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        int iH = a0.u.h((i10 & (~i)) | i11, (i & i12) | i13, i14, i15);
        vcVar.r();
        vcVar.f11358g = (i16 % 324763920) ^ iH;
        vcVar.f11356e = arrayList;
        return vcVar;
    }

    public static vc f(nc ncVar) {
        vc vcVar = new vc();
        int[] iArr = {1315209188, 67133601, 1612794668, 612376713, 2023183116, -774012042, 5007439, 661761152, 474613996};
        int i = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        int iH = a0.u.h((i10 & (~i)) | i11, (i & i12) | i13, i14, i15);
        vcVar.r();
        vcVar.f11358g = (i16 % 474613996) ^ iH;
        vcVar.f11357f = ncVar;
        return vcVar;
    }

    public static vc g(Object obj) {
        if (obj instanceof Long) {
            return b(((Long) obj).longValue());
        }
        if (obj instanceof Boolean) {
            return b(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Integer) {
            return b(((Integer) obj).intValue());
        }
        if (obj instanceof Double) {
            return c(((Double) obj).doubleValue());
        }
        if (obj instanceof Float) {
            return c(((Float) obj).floatValue());
        }
        if (obj instanceof Short) {
            return b(((Short) obj).shortValue());
        }
        if (obj instanceof Byte) {
            return b(((Byte) obj).byteValue());
        }
        if (obj instanceof ac) {
            return d((ac) obj);
        }
        if (obj instanceof String) {
            return d(ac.e(((String) obj).getBytes(Charset.forName(zb.a("Hn2H4l0=")))));
        }
        if (!(obj instanceof ArrayList)) {
            return a(obj);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(g(arrayList2.get(i)));
        }
        return e(arrayList);
    }

    public static vc j(vc vcVar) {
        int[] iArr = {1154349542, 1365661854, 772762753, -35647458, -1399059520, 905919471, 65677639, 1759726503, 552812661};
        int i = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        int iH = a0.u.h((i10 & (~i)) | i11, (i & i12) | i13, i14, i15);
        int i17 = i16 % 552812661;
        try {
            int i18 = vcVar.f11358g;
            int i19 = (i17 ^ iH) + i18;
            if (i18 == 0) {
                throw null;
            }
            switch (i19) {
                case 0:
                    return new vc();
                case 1:
                    return a(vcVar.l());
                case 2:
                    return b(vcVar.m());
                case 3:
                    return d(vcVar.n());
                case 4:
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((ArrayList) vcVar.o()).iterator();
                    while (it.hasNext()) {
                        arrayList.add(j((vc) it.next()));
                    }
                    return e(arrayList);
                case 5:
                    return f(vcVar.p());
                case 6:
                    return c(vcVar.q());
                default:
                    throw new AssertionError(zb.a("HkezqgQcPni/TE/NwjgYPC5H6Q2JRdEp275wOg=="));
            }
        } catch (tc e3) {
            throw new AssertionError(zb.a("CEiv6BFfPnitUE+D"), e3);
        }
    }

    public final Object h() throws tc {
        int[] iArr = {172154289, 1050326876, 843682288, -858640882, -228026365, 881347074, 13857144, 514820752, 473891334};
        int i = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        int iH = a0.u.h((i10 & (~i)) | i11, (i & i12) | i13, i14, i15);
        int i17 = this.f11358g;
        int i18 = ((i16 % 473891334) ^ iH) + i17;
        if (i17 == 0) {
            throw null;
        }
        switch (i18) {
            case 0:
            case 5:
                throw new tc();
            case 1:
                return l();
            case 2:
                return Long.valueOf(m());
            case 3:
                return n().a();
            case 4:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayList) o()).iterator();
                while (it.hasNext()) {
                    arrayList.add(((vc) it.next()).h());
                }
                return arrayList;
            case 6:
                return Double.valueOf(q());
            default:
                throw new AssertionError(zb.a("HkezqgQcPni/TE/NwjgYPC5H6Q2JRdEp275wOg=="));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x01f4, code lost:
    
        if (r18.equals(java.lang.Object.class) != false) goto L150;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(java.lang.Class r18) throws com.google.android.gms.internal.ads.tc {
        /*
            Method dump skipped, instruction units count: 596
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vc.i(java.lang.Class):java.lang.Object");
    }

    public final void k(ByteArrayOutputStream byteArrayOutputStream) throws tc, IOException {
        long[] jArr = {1269833163, 1628598594, 308676977, 1629286434, 15633520, 3337700125L, 1402923307, 613197917, 297598514};
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        int i = 5;
        long j15 = jArr[5];
        long j16 = jArr[6];
        long j17 = jArr[7];
        long j18 = (((((~j10) & j11) | j12) + ((j10 & j13) | j14)) - j15) + j16;
        long j19 = j17 % 297598514;
        int i10 = this.f11358g;
        int i11 = i10 - 1;
        if (i10 == 0) {
            throw null;
        }
        switch (i11) {
            case 0:
            case 1:
            case 5:
                throw new tc();
            case 2:
                c6.v(m(), new kx0(i, byteArrayOutputStream), true);
                return;
            case 3:
                byte[] bArr = n().f2838a;
                c6.v(((long) bArr.length) * (j18 ^ j19), new kx0(i, byteArrayOutputStream), true);
                byteArrayOutputStream.write(bArr);
                return;
            case 4:
                ArrayList arrayList = (ArrayList) o();
                c6.v(arrayList.size(), new kx0(i, byteArrayOutputStream), true);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((vc) it.next()).k(byteArrayOutputStream);
                }
                return;
            case 6:
                long jDoubleToRawLongBits = Double.doubleToRawLongBits(q());
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                byteBufferAllocate.putLong(jDoubleToRawLongBits);
                for (byte b2 : byteBufferAllocate.array()) {
                    byteArrayOutputStream.write(b2);
                }
                int length = byteBufferAllocate.array().length;
                return;
            default:
                return;
        }
    }

    public final Object l() throws tc {
        int[] iArr = {427355115, 404248040, 1318670750, 874677346, 1819730563, -970011213, 126401947, 1858504292, 235745791};
        int i = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        s((iArr[7] % 235745791) ^ a0.u.h((i10 & (~i)) | i11, (i & i12) | i13, i14, i15));
        return this.f11352a;
    }

    public final long m() throws tc {
        int[] iArr = {1646478179, 763209928, 1529626135, 609321208, 1403807536, -1382063087, 25624641, 1388803074, 733327814};
        int i = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        s((iArr[7] % 733327814) ^ a0.u.h((i10 & (~i)) | i11, (i & i12) | i13, i14, i15));
        return this.f11353b;
    }

    public final ac n() throws tc {
        int[] iArr = {2059344234, 1917530355, 739411611, 1399403104, 95815174, 2094390031, 51245830, 1312994984, 1140384172};
        int i = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        s((iArr[7] % 1140384172) ^ a0.u.h((i10 & (~i)) | i11, (i & i12) | i13, i14, i15));
        return this.f11355d;
    }

    public final List o() throws tc {
        int[] iArr = {1435218189, 1093276829, 949583962, 1092752517, 575966040, -2054938211, 262178224, 1891252715, 1250801052};
        int i = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        s((iArr[7] % 1250801052) ^ a0.u.h((i10 & (~i)) | i11, (i & i12) | i13, i14, i15));
        return this.f11356e;
    }

    public final nc p() throws tc {
        int[] iArr = {672139932, 1821026951, 1629321417, 214090246, 828986457, -1439766056, 580508860, 1579068977, 395191309};
        int i = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        s((iArr[7] % 395191309) ^ a0.u.h((i10 & (~i)) | i11, (i & i12) | i13, i14, i15));
        return this.f11357f;
    }

    public final double q() throws tc {
        int[] iArr = {1714636915, 1758565445, 174653454, 1653642817, 38095532, -1976041400, 596516649, 1804289383, 846930886};
        int i = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        s((iArr[7] % 846930886) ^ a0.u.h((i10 & (~i)) | i11, (i & i12) | i13, i14, i15));
        return this.f11354c;
    }

    public final void r() {
        this.f11358g = 1;
        this.f11353b = 0L;
        this.f11352a = null;
        this.f11355d = null;
        this.f11356e = null;
        this.f11357f = null;
    }

    public final void s(int i) throws tc {
        if (i != this.f11358g) {
            throw new tc();
        }
    }
}
