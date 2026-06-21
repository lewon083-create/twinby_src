package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class hm1 extends AbstractMap implements Serializable {
    public static final v i = new v(9);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public gm1 f6188c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public dm1 f6192g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public dm1 f6193h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6189d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6190e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f6187b = i;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final gm1 f6191f = new gm1(0);

    public final gm1 a(Object obj, boolean z5) {
        int iCompareTo;
        gm1 gm1Var;
        gm1 gm1Var2 = this.f6188c;
        v vVar = i;
        v vVar2 = this.f6187b;
        if (gm1Var2 != null) {
            Comparable comparable = vVar2 == vVar ? (Comparable) obj : null;
            while (true) {
                Object obj2 = gm1Var2.f5866c;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : vVar2.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return gm1Var2;
                }
                gm1 gm1Var3 = (gm1) (iCompareTo < 0 ? gm1Var2.f5870g : gm1Var2.f5871h);
                if (gm1Var3 == null) {
                    break;
                }
                gm1Var2 = gm1Var3;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z5) {
            return null;
        }
        gm1 gm1Var4 = this.f6191f;
        if (gm1Var2 != null) {
            gm1 gm1Var5 = new gm1(gm1Var2, obj, gm1Var4, (gm1) gm1Var4.f5872j);
            if (iCompareTo < 0) {
                gm1Var2.f5870g = gm1Var5;
            } else {
                gm1Var2.f5871h = gm1Var5;
            }
            d(gm1Var2, true);
            gm1Var = gm1Var5;
        } else {
            if (vVar2 == vVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            gm1Var = new gm1(null, obj, gm1Var4, (gm1) gm1Var4.f5872j);
            this.f6188c = gm1Var;
        }
        this.f6189d++;
        this.f6190e++;
        return gm1Var;
    }

    public final void b(gm1 gm1Var, boolean z5) {
        gm1 gm1Var2;
        gm1 gm1Var3;
        int i10;
        if (z5) {
            gm1 gm1Var4 = (gm1) gm1Var.f5872j;
            gm1Var4.i = (gm1) gm1Var.i;
            ((gm1) gm1Var.i).f5872j = gm1Var4;
        }
        gm1 gm1Var5 = (gm1) gm1Var.f5870g;
        gm1 gm1Var6 = (gm1) gm1Var.f5871h;
        gm1 gm1Var7 = (gm1) gm1Var.f5869f;
        int i11 = 0;
        if (gm1Var5 == null || gm1Var6 == null) {
            if (gm1Var5 != null) {
                c(gm1Var, gm1Var5);
                gm1Var.f5870g = null;
            } else if (gm1Var6 != null) {
                c(gm1Var, gm1Var6);
                gm1Var.f5871h = null;
            } else {
                c(gm1Var, null);
            }
            d(gm1Var7, false);
            this.f6189d--;
            this.f6190e++;
            return;
        }
        if (gm1Var5.f5868e > gm1Var6.f5868e) {
            do {
                gm1Var3 = gm1Var5;
                gm1Var5 = (gm1) gm1Var5.f5871h;
            } while (gm1Var5 != null);
        } else {
            do {
                gm1Var2 = gm1Var6;
                gm1Var6 = (gm1) gm1Var6.f5870g;
            } while (gm1Var6 != null);
            gm1Var3 = gm1Var2;
        }
        b(gm1Var3, false);
        gm1 gm1Var8 = (gm1) gm1Var.f5870g;
        if (gm1Var8 != null) {
            i10 = gm1Var8.f5868e;
            gm1Var3.f5870g = gm1Var8;
            gm1Var8.f5869f = gm1Var3;
            gm1Var.f5870g = null;
        } else {
            i10 = 0;
        }
        gm1 gm1Var9 = (gm1) gm1Var.f5871h;
        if (gm1Var9 != null) {
            i11 = gm1Var9.f5868e;
            gm1Var3.f5871h = gm1Var9;
            gm1Var9.f5869f = gm1Var3;
            gm1Var.f5871h = null;
        }
        gm1Var3.f5868e = Math.max(i10, i11) + 1;
        c(gm1Var, gm1Var3);
    }

    public final void c(gm1 gm1Var, gm1 gm1Var2) {
        gm1 gm1Var3 = (gm1) gm1Var.f5869f;
        gm1Var.f5869f = null;
        if (gm1Var2 != null) {
            gm1Var2.f5869f = gm1Var3;
        }
        if (gm1Var3 == null) {
            this.f6188c = gm1Var2;
        } else if (((gm1) gm1Var3.f5870g) == gm1Var) {
            gm1Var3.f5870g = gm1Var2;
        } else {
            gm1Var3.f5871h = gm1Var2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f6188c = null;
        this.f6189d = 0;
        this.f6190e++;
        gm1 gm1Var = this.f6191f;
        gm1Var.f5872j = gm1Var;
        gm1Var.i = gm1Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        gm1 gm1VarA = null;
        if (obj != null) {
            try {
                gm1VarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return gm1VarA != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x008c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x008c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(com.google.android.gms.internal.ads.gm1 r9, boolean r10) {
        /*
            r8 = this;
        L0:
            if (r9 == 0) goto L92
            java.util.Map$Entry r0 = r9.f5870g
            com.google.android.gms.internal.ads.gm1 r0 = (com.google.android.gms.internal.ads.gm1) r0
            java.util.Map$Entry r1 = r9.f5871h
            com.google.android.gms.internal.ads.gm1 r1 = (com.google.android.gms.internal.ads.gm1) r1
            r2 = 0
            if (r0 == 0) goto L10
            int r3 = r0.f5868e
            goto L11
        L10:
            r3 = r2
        L11:
            if (r1 == 0) goto L16
            int r4 = r1.f5868e
            goto L17
        L16:
            r4 = r2
        L17:
            int r5 = r3 - r4
            r6 = -2
            r7 = 1
            if (r5 != r6) goto L4a
            java.util.Map$Entry r0 = r1.f5870g
            com.google.android.gms.internal.ads.gm1 r0 = (com.google.android.gms.internal.ads.gm1) r0
            java.util.Map$Entry r3 = r1.f5871h
            com.google.android.gms.internal.ads.gm1 r3 = (com.google.android.gms.internal.ads.gm1) r3
            if (r3 == 0) goto L2a
            int r3 = r3.f5868e
            goto L2b
        L2a:
            r3 = r2
        L2b:
            if (r0 == 0) goto L30
            int r0 = r0.f5868e
            goto L31
        L30:
            r0 = r2
        L31:
            int r0 = r0 - r3
            r3 = -1
            if (r0 == r3) goto L42
            if (r0 != 0) goto L3a
            if (r10 != 0) goto L3b
            goto L43
        L3a:
            r7 = r10
        L3b:
            r8.f(r1)
            r8.e(r9)
            goto L47
        L42:
            r2 = r10
        L43:
            r8.e(r9)
            r7 = r2
        L47:
            if (r7 != 0) goto L92
            goto L8c
        L4a:
            r1 = 2
            if (r5 != r1) goto L79
            java.util.Map$Entry r1 = r0.f5870g
            com.google.android.gms.internal.ads.gm1 r1 = (com.google.android.gms.internal.ads.gm1) r1
            java.util.Map$Entry r3 = r0.f5871h
            com.google.android.gms.internal.ads.gm1 r3 = (com.google.android.gms.internal.ads.gm1) r3
            if (r3 == 0) goto L5a
            int r3 = r3.f5868e
            goto L5b
        L5a:
            r3 = r2
        L5b:
            if (r1 == 0) goto L60
            int r1 = r1.f5868e
            goto L61
        L60:
            r1 = r2
        L61:
            int r1 = r1 - r3
            if (r1 == r7) goto L71
            if (r1 != 0) goto L69
            if (r10 != 0) goto L6a
            goto L72
        L69:
            r7 = r10
        L6a:
            r8.e(r0)
            r8.f(r9)
            goto L76
        L71:
            r2 = r10
        L72:
            r8.f(r9)
            r7 = r2
        L76:
            if (r7 == 0) goto L8c
            goto L92
        L79:
            if (r5 != 0) goto L82
            int r3 = r3 + 1
            r9.f5868e = r3
            if (r10 == 0) goto L8c
            goto L92
        L82:
            int r0 = java.lang.Math.max(r3, r4)
            int r0 = r0 + r7
            r9.f5868e = r0
            if (r10 != 0) goto L8c
            goto L92
        L8c:
            java.util.Map$Entry r9 = r9.f5869f
            com.google.android.gms.internal.ads.gm1 r9 = (com.google.android.gms.internal.ads.gm1) r9
            goto L0
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hm1.d(com.google.android.gms.internal.ads.gm1, boolean):void");
    }

    public final void e(gm1 gm1Var) {
        gm1 gm1Var2 = (gm1) gm1Var.f5870g;
        gm1 gm1Var3 = (gm1) gm1Var.f5871h;
        gm1 gm1Var4 = (gm1) gm1Var3.f5870g;
        gm1 gm1Var5 = (gm1) gm1Var3.f5871h;
        gm1Var.f5871h = gm1Var4;
        if (gm1Var4 != null) {
            gm1Var4.f5869f = gm1Var;
        }
        c(gm1Var, gm1Var3);
        gm1Var3.f5870g = gm1Var;
        gm1Var.f5869f = gm1Var3;
        int iMax = Math.max(gm1Var2 != null ? gm1Var2.f5868e : 0, gm1Var4 != null ? gm1Var4.f5868e : 0) + 1;
        gm1Var.f5868e = iMax;
        gm1Var3.f5868e = Math.max(iMax, gm1Var5 != null ? gm1Var5.f5868e : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        dm1 dm1Var = this.f6192g;
        if (dm1Var != null) {
            return dm1Var;
        }
        dm1 dm1Var2 = new dm1(this, 0);
        this.f6192g = dm1Var2;
        return dm1Var2;
    }

    public final void f(gm1 gm1Var) {
        gm1 gm1Var2 = (gm1) gm1Var.f5870g;
        gm1 gm1Var3 = (gm1) gm1Var.f5871h;
        gm1 gm1Var4 = (gm1) gm1Var2.f5870g;
        gm1 gm1Var5 = (gm1) gm1Var2.f5871h;
        gm1Var.f5870g = gm1Var5;
        if (gm1Var5 != null) {
            gm1Var5.f5869f = gm1Var;
        }
        c(gm1Var, gm1Var2);
        gm1Var2.f5871h = gm1Var;
        gm1Var.f5869f = gm1Var2;
        int iMax = Math.max(gm1Var3 != null ? gm1Var3.f5868e : 0, gm1Var5 != null ? gm1Var5.f5868e : 0) + 1;
        gm1Var.f5868e = iMax;
        gm1Var2.f5868e = Math.max(iMax, gm1Var4 != null ? gm1Var4.f5868e : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        gm1 gm1VarA;
        if (obj != null) {
            try {
                gm1VarA = a(obj, false);
            } catch (ClassCastException unused) {
                gm1VarA = null;
            }
        } else {
            gm1VarA = null;
        }
        if (gm1VarA != null) {
            return gm1VarA.f5867d;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        dm1 dm1Var = this.f6193h;
        if (dm1Var != null) {
            return dm1Var;
        }
        dm1 dm1Var2 = new dm1(this, 1);
        this.f6193h = dm1Var2;
        return dm1Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null) {
            throw new NullPointerException("value == null");
        }
        gm1 gm1VarA = a(obj, true);
        Object obj3 = gm1VarA.f5867d;
        gm1VarA.f5867d = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        gm1 gm1VarA;
        if (obj != null) {
            try {
                gm1VarA = a(obj, false);
            } catch (ClassCastException unused) {
                gm1VarA = null;
            }
        } else {
            gm1VarA = null;
        }
        if (gm1VarA != null) {
            b(gm1VarA, true);
        }
        if (gm1VarA != null) {
            return gm1VarA.f5867d;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f6189d;
    }
}
