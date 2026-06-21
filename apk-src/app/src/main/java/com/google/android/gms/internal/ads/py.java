package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class py extends e1.d0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sz f9206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xy f9207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f9208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f9209f;

    public py(sz szVar, xy xyVar, String str, String[] strArr) {
        super(5);
        this.f9206c = szVar;
        this.f9207d = xyVar;
        this.f9208e = str;
        this.f9209f = strArr;
        p9.k.C.A.f9638b.add(this);
    }

    @Override // e1.d0
    public final void A() {
        try {
            this.f9207d.c(this.f9208e, this.f9209f);
        } finally {
            t9.g0.f33596l.post(new s(21, this));
        }
    }

    @Override // e1.d0
    public final ed.d B() {
        return (((Boolean) q9.s.f31967e.f31970c.a(al.f3206t2)).booleanValue() && (this.f9207d instanceof bz)) ? hx.f6284f.b(new ze(2, this)) : super.B();
    }
}
