package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class ya implements s1, ub, td0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v f12554e = new v(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f12556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f12557d;

    public ya(d8.e0 e0Var) {
        this.f12555b = -1;
        this.f12556c = new byte[8];
        this.f12557d = e0Var;
    }

    public static ya d(String str, boolean z5) {
        return new ya(str, Boolean.valueOf(z5), 1);
    }

    public static ya k(long j10, String str) {
        return new ya(str, Long.valueOf(j10), 2);
    }

    @Override // com.google.android.gms.internal.ads.td0
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void mo0a(Object obj) {
        int i = ot1.f8771f0;
        ((te) obj).n0((hf) this.f12556c, (hf) this.f12557d, this.f12555b);
    }

    public int b() {
        int i = this.f12555b;
        if (i != 2) {
            return i != 3 ? 0 : 512;
        }
        return 2048;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a8, code lost:
    
        if (r13 == r16) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b2, code lost:
    
        return new com.google.android.gms.internal.ads.r1(-2, r13, r5 + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b5, code lost:
    
        return com.google.android.gms.internal.ads.r1.f9650d;
     */
    @Override // com.google.android.gms.internal.ads.s1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.r1 c(com.google.android.gms.internal.ads.a2 r25, long r26) {
        /*
            r24 = this;
            r0 = r24
            long r5 = r25.q()
            long r1 = r25.r()
            long r1 = r1 - r5
            r3 = 112800(0x1b8a0, double:5.57306E-319)
            long r1 = java.lang.Math.min(r3, r1)
            int r1 = (int) r1
            java.lang.Object r2 = r0.f12557d
            com.google.android.gms.internal.ads.tk0 r2 = (com.google.android.gms.internal.ads.tk0) r2
            r2.y(r1)
            byte[] r3 = r2.f10641a
            r4 = 0
            r7 = r25
            r7.E(r3, r4, r1)
            int r1 = r2.f10643c
            r7 = -1
            r9 = r7
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L2c:
            int r11 = r2.B()
            r12 = 188(0xbc, float:2.63E-43)
            if (r11 < r12) goto La1
            byte[] r11 = r2.f10641a
            int r12 = r2.f10642b
        L38:
            if (r12 >= r1) goto L48
            r15 = r11[r12]
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = 71
            if (r15 == r3) goto L4d
            int r12 = r12 + 1
            goto L38
        L48:
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L4d:
            int r3 = r12 + 188
            if (r3 <= r1) goto L52
            goto La6
        L52:
            int r4 = r0.f12555b
            long r7 = com.google.android.gms.internal.ads.c80.j(r2, r12, r4)
            int r4 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r4 == 0) goto L9c
            java.lang.Object r4 = r0.f12556c
            com.google.android.gms.internal.ads.yo0 r4 = (com.google.android.gms.internal.ads.yo0) r4
            long r7 = r4.c(r7)
            int r4 = (r7 > r26 ? 1 : (r7 == r26 ? 0 : -1))
            if (r4 <= 0) goto L82
            int r1 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r1 != 0) goto L74
            com.google.android.gms.internal.ads.r1 r1 = new com.google.android.gms.internal.ads.r1
            r2 = -1
            r3 = r7
            r1.<init>(r2, r3, r5)
            return r1
        L74:
            long r15 = r5 + r9
            com.google.android.gms.internal.ads.r1 r11 = new com.google.android.gms.internal.ads.r1
            r12 = 0
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r11.<init>(r12, r13, r15)
            return r11
        L82:
            r13 = r7
            long r7 = (long) r12
            r9 = 100000(0x186a0, double:4.94066E-319)
            long r9 = r9 + r13
            int r4 = (r9 > r26 ? 1 : (r9 == r26 ? 0 : -1))
            if (r4 <= 0) goto L9b
            long r22 = r5 + r7
            com.google.android.gms.internal.ads.r1 r18 = new com.google.android.gms.internal.ads.r1
            r19 = 0
            r20 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r18.<init>(r19, r20, r22)
            return r18
        L9b:
            r9 = r7
        L9c:
            r2.E(r3)
            long r7 = (long) r3
            goto L2c
        La1:
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        La6:
            int r1 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r1 == 0) goto Lb3
            long r15 = r5 + r7
            com.google.android.gms.internal.ads.r1 r11 = new com.google.android.gms.internal.ads.r1
            r12 = -2
            r11.<init>(r12, r13, r15)
            return r11
        Lb3:
            com.google.android.gms.internal.ads.r1 r1 = com.google.android.gms.internal.ads.r1.f9650d
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ya.c(com.google.android.gms.internal.ads.a2, long):com.google.android.gms.internal.ads.r1");
    }

    @Override // com.google.android.gms.internal.ads.ub
    public byte e(ac acVar, int i) {
        byte[] bArr = (byte[]) this.f12556c;
        int i10 = ((((~1264448664) & 231739608) | 1128901767) + ((1264448664 & 479203675) | 860794247)) - 1823332376;
        int i11 = 1761855727 % 1384724137;
        int i12 = (((((~143154913) & 992498304) | 439467622) + ((143154913 & 1627930754) | 1212551295)) - (-2089988634)) ^ (2033018190 % 70061690);
        int i13 = ((((~1661299468) & 613450408) | 2017391535) + ((1661299468 & 109051904) | 2071555381)) - (-441392543);
        int i14 = 1694830070 % 1383960411;
        int i15 = i >>> i12;
        if (i15 != this.f12555b) {
            ((d8.e0) this.f12557d).r(i15, bArr);
            this.f12555b = i15;
        }
        int i16 = i13 ^ i14;
        return (byte) (((acVar.b(i) ^ bArr[i % (i10 ^ i11)]) << i16) >> i16);
    }

    public Object f(int i) {
        SparseArray sparseArray = (SparseArray) this.f12556c;
        if (this.f12555b == -1) {
            this.f12555b = 0;
        }
        while (true) {
            int i10 = this.f12555b;
            if (i10 <= 0 || i >= sparseArray.keyAt(i10)) {
                break;
            }
            this.f12555b--;
        }
        while (this.f12555b < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.f12555b + 1)) {
            this.f12555b++;
        }
        return sparseArray.valueAt(this.f12555b);
    }

    public void g(Object obj, Object obj2) {
        int i = this.f12555b + 1;
        Object[] objArr = (Object[]) this.f12556c;
        int length = objArr.length;
        int i10 = i + i;
        if (i10 > length) {
            this.f12556c = Arrays.copyOf(objArr, s41.d(length, i10));
        }
        fs1.j(obj, obj2);
        Object[] objArr2 = (Object[]) this.f12556c;
        int i11 = this.f12555b;
        int i12 = i11 + i11;
        objArr2[i12] = obj;
        objArr2[i12 + 1] = obj2;
        this.f12555b = i11 + 1;
    }

    public synchronized byte[] h(int i) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f12557d;
            if (i10 >= arrayList.size()) {
                return new byte[i];
            }
            byte[] bArr = (byte[]) arrayList.get(i10);
            int length = bArr.length;
            if (length >= i) {
                this.f12555b -= length;
                arrayList.remove(i10);
                ((ArrayList) this.f12556c).remove(bArr);
                return bArr;
            }
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.ub
    public ac i(ac acVar, int i, int i10) {
        if (i < 0 || i > i10 || i10 > acVar.f2838a.length) {
            throw new IndexOutOfBoundsException();
        }
        byte[] bArr = new byte[i10 - i];
        int i11 = 0;
        while (i < i10) {
            bArr[i11] = e(acVar, i);
            i++;
            i11++;
        }
        return ac.e(bArr);
    }

    @Override // com.google.android.gms.internal.ads.s1
    public void j() {
        byte[] bArr = cq0.f4294b;
        int length = bArr.length;
        ((tk0) this.f12557d).z(0, bArr);
    }

    @Override // com.google.android.gms.internal.ads.ub
    /* JADX INFO: renamed from: l */
    public /* bridge */ /* synthetic */ ub mo2l() {
        return new ya((d8.e0) this.f12557d);
    }

    public void m(kh khVar) {
        synchronized (this.f12556c) {
            try {
                Iterator it = ((LinkedList) this.f12557d).iterator();
                while (it.hasNext()) {
                    kh khVar2 = (kh) it.next();
                    p9.k kVar = p9.k.C;
                    if (kVar.f31302h.g().l()) {
                        if (!kVar.f31302h.g().m() && !khVar.equals(khVar2) && khVar2.f7230q.equals(khVar.f7230q)) {
                            it.remove();
                            return;
                        }
                    } else if (!khVar.equals(khVar2) && khVar2.f7228o.equals(khVar.f7228o)) {
                        it.remove();
                        return;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void n(Set set) {
        if (set instanceof Collection) {
            int size = set.size() + this.f12555b;
            Object[] objArr = (Object[]) this.f12556c;
            int length = objArr.length;
            int i = size + size;
            if (i > length) {
                this.f12556c = Arrays.copyOf(objArr, s41.d(length, i));
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            g(entry.getKey(), entry.getValue());
        }
    }

    public synchronized void o(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= 4096) {
                ((ArrayList) this.f12556c).add(bArr);
                ArrayList arrayList = (ArrayList) this.f12557d;
                int iBinarySearch = Collections.binarySearch(arrayList, bArr, f12554e);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                arrayList.add(iBinarySearch, bArr);
                this.f12555b += length;
                synchronized (this) {
                    while (this.f12555b > 4096) {
                        byte[] bArr2 = (byte[]) ((ArrayList) this.f12556c).remove(0);
                        ((ArrayList) this.f12557d).remove(bArr2);
                        this.f12555b -= bArr2.length;
                    }
                }
            }
        }
    }

    public w51 p() {
        return s(true);
    }

    public void q(kh khVar) {
        synchronized (this.f12556c) {
            try {
                LinkedList linkedList = (LinkedList) this.f12557d;
                if (linkedList.size() >= 10) {
                    int size = linkedList.size();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(size).length() + 30);
                    sb2.append("Queue is full, current size = ");
                    sb2.append(size);
                    u9.i.c(sb2.toString());
                    linkedList.remove(0);
                }
                int i = this.f12555b;
                this.f12555b = i + 1;
                khVar.f7225l = i;
                synchronized (khVar.f7221g) {
                    try {
                        int i10 = khVar.f7224k;
                        int i11 = khVar.f7225l;
                        int i12 = khVar.f7216b;
                        if (!khVar.f7218d) {
                            i12 = (i11 * i12) + (i10 * khVar.f7215a);
                        }
                        if (i12 > khVar.f7227n) {
                            khVar.f7227n = i12;
                        }
                    } finally {
                    }
                }
                linkedList.add(khVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Object r() {
        String str = (String) this.f12556c;
        Object obj = this.f12557d;
        xk xkVar = (xk) pm.f9104a.get();
        if (xkVar == null) {
            if (pm.f9105b.get() == null) {
                return obj;
            }
            throw new ClassCastException();
        }
        SharedPreferences sharedPreferences = xkVar.f12175a;
        int i = this.f12555b - 1;
        if (i == 0) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            try {
                return Boolean.valueOf(sharedPreferences.getBoolean(str, zBooleanValue));
            } catch (ClassCastException unused) {
                return Boolean.valueOf(sharedPreferences.getString(str, String.valueOf(zBooleanValue)));
            }
        }
        if (i == 1) {
            try {
                return Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue()));
            } catch (ClassCastException unused2) {
                return Long.valueOf(sharedPreferences.getInt(str, (int) r3));
            }
        }
        if (i != 2) {
            return sharedPreferences.getString(str, (String) obj);
        }
        try {
            return Double.valueOf(sharedPreferences.getFloat(str, (float) r3));
        } catch (ClassCastException unused3) {
            return Double.valueOf(sharedPreferences.getString(str, String.valueOf(((Double) obj).doubleValue())));
        }
    }

    public w51 s(boolean z5) {
        y41 y41Var;
        y41 y41Var2;
        if (z5 && (y41Var2 = (y41) this.f12557d) != null) {
            throw y41Var2.a();
        }
        w51 w51VarD = w51.d(this.f12555b, (Object[]) this.f12556c, this);
        if (!z5 || (y41Var = (y41) this.f12557d) == null) {
            return w51VarD;
        }
        throw y41Var.a();
    }

    public ya(String str, Object obj, int i) {
        this.f12556c = str;
        this.f12557d = obj;
        this.f12555b = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ya(int i, boolean z5) {
        this(4);
        switch (i) {
            case 4:
                this.f12556c = new Object();
                this.f12557d = new LinkedList();
                break;
            case 7:
                break;
            case 9:
                bw1 bw1Var = bw1.f3938h;
                this.f12556c = new SparseArray();
                this.f12557d = bw1Var;
                this.f12555b = -1;
                break;
            default:
                this.f12556c = new ArrayList();
                this.f12557d = new ArrayList(64);
                this.f12555b = 0;
                break;
        }
    }

    public ya(int i) {
        this.f12556c = new Object[i + i];
        this.f12555b = 0;
    }
}
