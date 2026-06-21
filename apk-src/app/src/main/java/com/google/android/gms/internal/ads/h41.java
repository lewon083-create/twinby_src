package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h41 implements g91 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f6024c = new ArrayList(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public db1 f6026e;

    public h41(boolean z5) {
        this.f6023b = z5;
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final void H(em1 em1Var) {
        em1Var.getClass();
        ArrayList arrayList = this.f6024c;
        if (arrayList.contains(em1Var)) {
            return;
        }
        arrayList.add(em1Var);
        this.f6025d++;
    }

    public final void a(db1 db1Var) {
        for (int i = 0; i < this.f6025d; i++) {
            ((em1) this.f6024c.get(i)).getClass();
        }
    }

    public final void b(db1 db1Var) {
        this.f6026e = db1Var;
        for (int i = 0; i < this.f6025d; i++) {
            ((em1) this.f6024c.get(i)).d(this, db1Var, this.f6023b);
        }
    }

    public final void c(int i) {
        db1 db1Var = this.f6026e;
        String str = cq0.f4293a;
        for (int i10 = 0; i10 < this.f6025d; i10++) {
            ((em1) this.f6024c.get(i10)).g(db1Var, this.f6023b, i);
        }
    }

    public final void f() {
        db1 db1Var = this.f6026e;
        String str = cq0.f4293a;
        for (int i = 0; i < this.f6025d; i++) {
            ((em1) this.f6024c.get(i)).m(db1Var, this.f6023b);
        }
        this.f6026e = null;
    }
}
