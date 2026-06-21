package yads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class q63 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f42198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f42199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f42200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f42201d;

    public q63() {
        this(0);
    }

    public static Object[] b() {
        return new Object[10];
    }

    public final synchronized void a(Object obj, long j10) {
        try {
            if (this.f42201d > 0) {
                if (j10 <= this.f42198a[((this.f42200c + r0) - 1) % this.f42199b.length]) {
                    a();
                }
            }
            int length = this.f42199b.length;
            if (this.f42201d >= length) {
                int i = length * 2;
                long[] jArr = new long[i];
                Object[] objArr = new Object[i];
                int i10 = this.f42200c;
                int i11 = length - i10;
                System.arraycopy(this.f42198a, i10, jArr, 0, i11);
                System.arraycopy(this.f42199b, this.f42200c, objArr, 0, i11);
                int i12 = this.f42200c;
                if (i12 > 0) {
                    System.arraycopy(this.f42198a, 0, jArr, i11, i12);
                    System.arraycopy(this.f42199b, 0, objArr, i11, this.f42200c);
                }
                this.f42198a = jArr;
                this.f42199b = objArr;
                this.f42200c = 0;
            }
            int i13 = this.f42200c;
            int i14 = this.f42201d;
            Object[] objArr2 = this.f42199b;
            int length2 = (i13 + i14) % objArr2.length;
            this.f42198a[length2] = j10;
            objArr2[length2] = obj;
            this.f42201d = i14 + 1;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized Object c() {
        Object obj;
        int i = this.f42201d;
        obj = null;
        if (i != 0) {
            if (i <= 0) {
                throw new IllegalStateException();
            }
            Object[] objArr = this.f42199b;
            int i10 = this.f42200c;
            Object obj2 = objArr[i10];
            objArr[i10] = null;
            this.f42200c = (i10 + 1) % objArr.length;
            this.f42201d = i - 1;
            obj = obj2;
        }
        return obj;
    }

    public q63(int i) {
        this.f42198a = new long[10];
        this.f42199b = b();
    }

    public final synchronized void a() {
        this.f42200c = 0;
        this.f42201d = 0;
        Arrays.fill(this.f42199b, (Object) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r12, boolean r14) {
        /*
            r11 = this;
            r0 = 0
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = r0
        L7:
            int r4 = r11.f42201d
            if (r4 <= 0) goto L3b
            long[] r5 = r11.f42198a
            int r6 = r11.f42200c
            r7 = r5[r6]
            long r7 = r12 - r7
            r9 = 0
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 >= 0) goto L21
            if (r14 != 0) goto L3b
            long r9 = -r7
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 < 0) goto L21
            goto L3b
        L21:
            if (r4 <= 0) goto L35
            java.lang.Object[] r1 = r11.f42199b
            r3 = r1[r6]
            r1[r6] = r0
            int r6 = r6 + 1
            int r1 = r1.length
            int r6 = r6 % r1
            r11.f42200c = r6
            int r4 = r4 + (-1)
            r11.f42201d = r4
            r1 = r7
            goto L7
        L35:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>()
            throw r12
        L3b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.q63.a(long, boolean):java.lang.Object");
    }
}
