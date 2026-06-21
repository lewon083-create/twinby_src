package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f10462d;

    public t1(q1 q1Var, s1 s1Var, long j10, long j11, long j12, long j13, long j14, int i) {
        this.f10461c = s1Var;
        this.f10459a = i;
        this.f10460b = new o1(q1Var, j10, j11, j12, j13, j14);
    }

    public static int b(q4.l lVar, long j10, e2 e2Var) {
        if (j10 == lVar.getPosition()) {
            return 0;
        }
        e2Var.f4793b = j10;
        return 1;
    }

    public static final int f(a2 a2Var, long j10, e2 e2Var) {
        if (j10 == a2Var.q()) {
            return 0;
        }
        e2Var.f4793b = j10;
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d2, code lost:
    
        return b(r28, r9, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(q4.l r28, com.google.android.gms.internal.ads.e2 r29) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.t1.a(q4.l, com.google.android.gms.internal.ads.e2):int");
    }

    public void c(long j10) {
        p1 p1Var = (p1) this.f10462d;
        if (p1Var == null || p1Var.f8869a != j10) {
            q4.c cVar = (q4.c) this.f10460b;
            this.f10462d = new p1(j10, cVar.f31720a.b(j10), cVar.f31722c, cVar.f31723d, cVar.f31724e, cVar.f31725f, 2);
        }
    }

    public void d(long j10) {
        p1 p1Var = (p1) this.f10462d;
        if (p1Var == null || p1Var.f8869a != j10) {
            o1 o1Var = (o1) this.f10460b;
            this.f10462d = new p1(j10, o1Var.f8540a.b(j10), o1Var.f8542c, o1Var.f8543d, o1Var.f8544e, o1Var.f8545f, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c8, code lost:
    
        return f(r28, r9, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int e(com.google.android.gms.internal.ads.a2 r28, com.google.android.gms.internal.ads.e2 r29) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.t1.e(com.google.android.gms.internal.ads.a2, com.google.android.gms.internal.ads.e2):int");
    }

    public t1(q4.d dVar, q4.f fVar, long j10, long j11, long j12, long j13, long j14, int i) {
        this.f10461c = fVar;
        this.f10459a = i;
        this.f10460b = new q4.c(dVar, j10, j11, j12, j13, j14);
    }
}
