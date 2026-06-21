package com.google.android.gms.internal.ads;

import android.os.Looper;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class yd1 implements ce1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f12600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f12601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f12602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f12603f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f12604g;

    public yd1(String str, sl1 sl1Var, bn1 bn1Var, int i, ei1 ei1Var, Integer num) {
        this.f12600c = str;
        this.f12601d = sl1Var;
        this.f12602e = bn1Var;
        this.f12599b = i;
        this.f12603f = ei1Var;
        this.f12604g = num;
    }

    public static yd1 f(String str, bn1 bn1Var, int i, ei1 ei1Var, Integer num) throws GeneralSecurityException {
        if (ei1Var == ei1.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new yd1(str, ge1.b(str), bn1Var, i, ei1Var, num);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (r10 < r3.f29094c) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(long r10, m3.p r12) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f12602e
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0
            java.lang.Object r1 = r9.f12603f
            java.util.PriorityQueue r1 = (java.util.PriorityQueue) r1
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 == 0) goto L9f
            int r3 = r9.f12599b
            if (r3 == 0) goto L9f
            r4 = -1
            if (r3 == r4) goto L2f
            int r3 = r1.size()
            int r5 = r9.f12599b
            if (r3 < r5) goto L2f
            java.lang.Object r3 = r1.peek()
            n3.q r3 = (n3.q) r3
            java.lang.String r5 = m3.z.f28608a
            long r5 = r3.f29094c
            int r3 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r3 >= 0) goto L2f
            goto L9f
        L2f:
            java.lang.Object r3 = r9.f12601d
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L3f
            m3.p r3 = new m3.p
            r3.<init>()
            goto L45
        L3f:
            java.lang.Object r3 = r3.pop()
            m3.p r3 = (m3.p) r3
        L45:
            int r5 = r12.a()
            r3.J(r5)
            byte[] r5 = r12.f28589a
            int r12 = r12.f28590b
            byte[] r6 = r3.f28589a
            int r7 = r3.a()
            r8 = 0
            java.lang.System.arraycopy(r5, r12, r6, r8, r7)
            java.lang.Object r12 = r9.f12604g
            n3.q r12 = (n3.q) r12
            if (r12 == 0) goto L6c
            long r5 = r12.f29094c
            int r5 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r5 != 0) goto L6c
            java.util.ArrayList r10 = r12.f29093b
            r10.add(r3)
            return
        L6c:
            boolean r12 = r0.isEmpty()
            if (r12 == 0) goto L78
            n3.q r12 = new n3.q
            r12.<init>()
            goto L7e
        L78:
            java.lang.Object r12 = r0.pop()
            n3.q r12 = (n3.q) r12
        L7e:
            java.util.ArrayList r0 = r12.f29093b
            if (r2 == 0) goto L83
            r8 = 1
        L83:
            com.google.android.gms.internal.measurement.h5.h(r8)
            boolean r2 = r0.isEmpty()
            com.google.android.gms.internal.measurement.h5.r(r2)
            r12.f29094c = r10
            r0.add(r3)
            r1.add(r12)
            r9.f12604g = r12
            int r10 = r9.f12599b
            if (r10 == r4) goto L9e
            r9.b(r10)
        L9e:
            return
        L9f:
            java.lang.Object r0 = r9.f12600c
            n3.r r0 = (n3.r) r0
            r0.c(r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yd1.a(long, m3.p):void");
    }

    public void b(int i) {
        ArrayList arrayList;
        PriorityQueue priorityQueue = (PriorityQueue) this.f12603f;
        while (priorityQueue.size() > i) {
            n3.q qVar = (n3.q) priorityQueue.poll();
            String str = m3.z.f28608a;
            int i10 = 0;
            while (true) {
                arrayList = qVar.f29093b;
                if (i10 >= arrayList.size()) {
                    break;
                }
                ((n3.r) this.f12600c).c(qVar.f29094c, (m3.p) arrayList.get(i10));
                ((ArrayDeque) this.f12601d).push((m3.p) arrayList.get(i10));
                i10++;
            }
            arrayList.clear();
            n3.q qVar2 = (n3.q) this.f12604g;
            if (qVar2 != null && qVar2.f29094c == qVar.f29094c) {
                this.f12604g = null;
            }
            ((ArrayDeque) this.f12602e).push(qVar);
        }
    }

    public void c(Runnable runnable) {
        m3.v vVar = (m3.v) this.f12600c;
        if (vVar.f28601a.getLooper().getThread().isAlive()) {
            vVar.c(runnable);
        }
    }

    public void d(int i) {
        com.google.android.gms.internal.measurement.h5.r(i >= 0);
        this.f12599b = i;
        b(i);
    }

    public void e(Object obj) {
        Object obj2 = this.f12603f;
        this.f12603f = obj;
        if (obj2.equals(obj)) {
            return;
        }
        s3.y yVar = ((s3.p) this.f12602e).f32624b;
        ((Integer) obj2).getClass();
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        yVar.n0();
        yVar.b0(1, 10, num);
        yVar.b0(2, 10, num);
        yVar.f32708n.e(21, new fj.o0(iIntValue, 1));
    }

    public void g(int i) {
        ix.k0(i >= 0);
        this.f12599b = i;
        i(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r8 < r1.f5630c) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(long r8, com.google.android.gms.internal.ads.tk0 r10) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f12603f
            java.util.PriorityQueue r0 = (java.util.PriorityQueue) r0
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 == 0) goto L9b
            int r1 = r7.f12599b
            if (r1 == 0) goto L9c
            r2 = -1
            if (r1 == r2) goto L2c
            int r1 = r0.size()
            int r3 = r7.f12599b
            if (r1 < r3) goto L2c
            java.lang.Object r1 = r0.peek()
            com.google.android.gms.internal.ads.g21 r1 = (com.google.android.gms.internal.ads.g21) r1
            java.lang.String r3 = com.google.android.gms.internal.ads.cq0.f4293a
            long r3 = r1.f5630c
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r1 >= 0) goto L2c
            goto L9c
        L2c:
            java.lang.Object r1 = r7.f12601d
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L3c
            com.google.android.gms.internal.ads.tk0 r1 = new com.google.android.gms.internal.ads.tk0
            r1.<init>()
            goto L42
        L3c:
            java.lang.Object r1 = r1.pop()
            com.google.android.gms.internal.ads.tk0 r1 = (com.google.android.gms.internal.ads.tk0) r1
        L42:
            int r3 = r10.B()
            r1.y(r3)
            byte[] r3 = r10.f10641a
            int r10 = r10.f10642b
            byte[] r4 = r1.f10641a
            r5 = 0
            int r6 = r1.B()
            java.lang.System.arraycopy(r3, r10, r4, r5, r6)
            java.lang.Object r10 = r7.f12604g
            com.google.android.gms.internal.ads.g21 r10 = (com.google.android.gms.internal.ads.g21) r10
            if (r10 == 0) goto L6a
            long r3 = r10.f5630c
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 == 0) goto L64
            goto L6a
        L64:
            java.util.ArrayList r8 = r10.f5629b
            r8.add(r1)
            return
        L6a:
            java.lang.Object r10 = r7.f12602e
            java.util.ArrayDeque r10 = (java.util.ArrayDeque) r10
            boolean r3 = r10.isEmpty()
            if (r3 == 0) goto L7a
            com.google.android.gms.internal.ads.g21 r10 = new com.google.android.gms.internal.ads.g21
            r10.<init>()
            goto L80
        L7a:
            java.lang.Object r10 = r10.pop()
            com.google.android.gms.internal.ads.g21 r10 = (com.google.android.gms.internal.ads.g21) r10
        L80:
            java.util.ArrayList r3 = r10.f5629b
            boolean r4 = r3.isEmpty()
            com.google.android.gms.internal.ads.ix.k0(r4)
            r10.f5630c = r8
            r3.add(r1)
            r0.add(r10)
            r7.f12604g = r10
            int r8 = r7.f12599b
            if (r8 == r2) goto L9a
            r7.i(r8)
        L9a:
            return
        L9b:
            r8 = r1
        L9c:
            java.lang.Object r0 = r7.f12600c
            com.google.android.gms.internal.ads.t21 r0 = (com.google.android.gms.internal.ads.t21) r0
            r0.f(r8, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yd1.h(long, com.google.android.gms.internal.ads.tk0):void");
    }

    public void i(int i) {
        ArrayList arrayList;
        while (true) {
            PriorityQueue priorityQueue = (PriorityQueue) this.f12603f;
            if (priorityQueue.size() <= i) {
                return;
            }
            g21 g21Var = (g21) priorityQueue.poll();
            String str = cq0.f4293a;
            int i10 = 0;
            while (true) {
                arrayList = g21Var.f5629b;
                if (i10 >= arrayList.size()) {
                    break;
                }
                ((t21) this.f12600c).f(g21Var.f5630c, (tk0) arrayList.get(i10));
                ((ArrayDeque) this.f12601d).push((tk0) arrayList.get(i10));
                i10++;
            }
            arrayList.clear();
            g21 g21Var2 = (g21) this.f12604g;
            if (g21Var2 != null && g21Var2.f5630c == g21Var.f5630c) {
                this.f12604g = null;
            }
            ((ArrayDeque) this.f12602e).push(g21Var);
        }
    }

    public void j(Object obj) {
        Object obj2 = this.f12603f;
        this.f12603f = obj;
        if (obj2.equals(obj)) {
            return;
        }
        pp0 pp0Var = (pp0) this.f12602e;
        pp0Var.getClass();
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        ot1 ot1Var = (ot1) pp0Var.f9149c;
        ot1Var.J0();
        ot1Var.W1(1, 10, num);
        ot1Var.W1(2, 10, num);
        jl1 jl1Var = new jl1(iIntValue);
        yf0 yf0Var = ot1Var.f8787o;
        yf0Var.i(21, jl1Var);
        yf0Var.j();
    }

    public yd1(Looper looper, Looper looper2, c6 c6Var, pp0 pp0Var) {
        this.f12600c = c6Var.y(looper, null);
        this.f12601d = c6Var.y(looper2, null);
        this.f12603f = 0;
        this.f12604g = 0;
        this.f12602e = pp0Var;
    }

    public yd1(t21 t21Var) {
        this.f12600c = t21Var;
        this.f12601d = new ArrayDeque();
        this.f12602e = new ArrayDeque();
        this.f12603f = new PriorityQueue();
        this.f12599b = -1;
    }

    public yd1(n3.r rVar) {
        this.f12600c = rVar;
        this.f12601d = new ArrayDeque();
        this.f12602e = new ArrayDeque();
        this.f12603f = new PriorityQueue();
        this.f12599b = -1;
    }

    public yd1(Object obj, Looper looper, Looper looper2, m3.t tVar, s3.p pVar) {
        this.f12600c = tVar.a(looper, null);
        this.f12601d = tVar.a(looper2, null);
        this.f12603f = obj;
        this.f12604g = obj;
        this.f12602e = pVar;
    }
}
