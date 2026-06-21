package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f11553f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f11554g;

    public w() {
        this.f11548a = 0;
        this.f11554g = new u[5];
        this.f11553f = new ArrayList();
        this.f11549b = -1;
    }

    public static void d(Object key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
    }

    public Object a(Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return null;
    }

    public Object b(Object key) {
        Object value;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (((fh.zf) this.f11554g)) {
            a0.b1 b1Var = (a0.b1) this.f11553f;
            b1Var.getClass();
            Intrinsics.checkNotNullParameter(key, "key");
            Object obj = ((LinkedHashMap) b1Var.f45c).get(key);
            if (obj != null) {
                this.f11551d++;
                return obj;
            }
            this.f11552e++;
            Object oldValue = a(key);
            if (oldValue == null) {
                return null;
            }
            synchronized (((fh.zf) this.f11554g)) {
                a0.b1 b1Var2 = (a0.b1) this.f11553f;
                b1Var2.getClass();
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(oldValue, "value");
                value = ((LinkedHashMap) b1Var2.f45c).put(key, oldValue);
                if (value != null) {
                    a0.b1 b1Var3 = (a0.b1) this.f11553f;
                    b1Var3.getClass();
                    Intrinsics.checkNotNullParameter(key, "key");
                    Intrinsics.checkNotNullParameter(value, "value");
                    ((LinkedHashMap) b1Var3.f45c).put(key, value);
                } else {
                    int i = this.f11550c;
                    d(key, oldValue);
                    this.f11550c = i + 1;
                    Unit unit = Unit.f27471a;
                }
            }
            if (value == null) {
                e(this.f11549b);
                return oldValue;
            }
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(oldValue, "oldValue");
            return value;
        }
    }

    public Object c(Object key, Object value) {
        Object oldValue;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        synchronized (((fh.zf) this.f11554g)) {
            try {
                int i = this.f11550c;
                d(key, value);
                this.f11550c = i + 1;
                a0.b1 b1Var = (a0.b1) this.f11553f;
                b1Var.getClass();
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(value, "value");
                oldValue = ((LinkedHashMap) b1Var.f45c).put(key, value);
                if (oldValue != null) {
                    int i10 = this.f11550c;
                    d(key, oldValue);
                    this.f11550c = i10 - 1;
                }
                Unit unit = Unit.f27471a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (oldValue != null) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        }
        e(this.f11549b);
        return oldValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0087, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(int r6) {
        /*
            r5 = this;
        L0:
            java.lang.Object r0 = r5.f11554g
            fh.zf r0 = (fh.zf) r0
            monitor-enter(r0)
            int r1 = r5.f11550c     // Catch: java.lang.Throwable -> L1c
            if (r1 < 0) goto L80
            java.lang.Object r1 = r5.f11553f     // Catch: java.lang.Throwable -> L1c
            a0.b1 r1 = (a0.b1) r1     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r1.f45c     // Catch: java.lang.Throwable -> L1c
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1e
            int r1 = r5.f11550c     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L80
            goto L1e
        L1c:
            r6 = move-exception
            goto L88
        L1e:
            int r1 = r5.f11550c     // Catch: java.lang.Throwable -> L1c
            if (r1 <= r6) goto L7e
            java.lang.Object r1 = r5.f11553f     // Catch: java.lang.Throwable -> L1c
            a0.b1 r1 = (a0.b1) r1     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r1.f45c     // Catch: java.lang.Throwable -> L1c
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L31
            goto L7e
        L31:
            java.lang.Object r1 = r5.f11553f     // Catch: java.lang.Throwable -> L1c
            a0.b1 r1 = (a0.b1) r1     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r1.f45c     // Catch: java.lang.Throwable -> L1c
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L1c
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = "map.entries"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)     // Catch: java.lang.Throwable -> L1c
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = kotlin.collections.CollectionsKt.E(r1)     // Catch: java.lang.Throwable -> L1c
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L4e
            monitor-exit(r0)
            return
        L4e:
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r3 = r5.f11553f     // Catch: java.lang.Throwable -> L1c
            a0.b1 r3 = (a0.b1) r3     // Catch: java.lang.Throwable -> L1c
            r3.getClass()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r3 = r3.f45c     // Catch: java.lang.Throwable -> L1c
            java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3     // Catch: java.lang.Throwable -> L1c
            r3.remove(r2)     // Catch: java.lang.Throwable -> L1c
            int r3 = r5.f11550c     // Catch: java.lang.Throwable -> L1c
            d(r2, r1)     // Catch: java.lang.Throwable -> L1c
            int r3 = r3 + (-1)
            r5.f11550c = r3     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "oldValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            goto L0
        L7e:
            monitor-exit(r0)
            return
        L80:
            java.lang.String r6 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1c
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L1c
            throw r1     // Catch: java.lang.Throwable -> L1c
        L88:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.w.e(int):void");
    }

    public void f(float f10, int i) {
        u uVar;
        u[] uVarArr = (u[]) this.f11554g;
        ArrayList arrayList = (ArrayList) this.f11553f;
        if (this.f11549b != 1) {
            Collections.sort(arrayList, v.f11144d);
            this.f11549b = 1;
        }
        int i10 = this.f11552e;
        if (i10 > 0) {
            int i11 = i10 - 1;
            this.f11552e = i11;
            uVar = uVarArr[i11];
        } else {
            uVar = new u();
        }
        int i12 = this.f11550c;
        this.f11550c = i12 + 1;
        uVar.f10767a = i12;
        uVar.f10768b = i;
        uVar.f10769c = f10;
        arrayList.add(uVar);
        this.f11551d += i;
        while (true) {
            int i13 = this.f11551d;
            if (i13 <= 2000) {
                return;
            }
            int i14 = i13 - 2000;
            u uVar2 = (u) arrayList.get(0);
            int i15 = uVar2.f10768b;
            if (i15 <= i14) {
                this.f11551d -= i15;
                arrayList.remove(0);
                int i16 = this.f11552e;
                if (i16 < 5) {
                    this.f11552e = i16 + 1;
                    uVarArr[i16] = uVar2;
                }
            } else {
                uVar2.f10768b = i15 - i14;
                this.f11551d -= i14;
            }
        }
    }

    public float g() {
        ArrayList arrayList = (ArrayList) this.f11553f;
        if (this.f11549b != 0) {
            Collections.sort(arrayList, v.f11143c);
            this.f11549b = 0;
        }
        float f10 = this.f11551d;
        int i = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            float f11 = 0.5f * f10;
            u uVar = (u) arrayList.get(i10);
            i += uVar.f10768b;
            if (i >= f11) {
                return uVar.f10769c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((u) arrayList.get(arrayList.size() - 1)).f10769c;
    }

    public String toString() {
        String str;
        switch (this.f11548a) {
            case 1:
                synchronized (((fh.zf) this.f11554g)) {
                    try {
                        int i = this.f11551d;
                        int i10 = this.f11552e + i;
                        str = "LruCache[maxSize=" + this.f11549b + ",hits=" + this.f11551d + ",misses=" + this.f11552e + ",hitRate=" + (i10 != 0 ? (i * 100) / i10 : 0) + "%]";
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public w(int i) {
        this.f11548a = 1;
        this.f11549b = i;
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f11553f = new a0.b1(19);
        this.f11554g = new fh.zf();
    }
}
