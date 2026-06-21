package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n10 f8878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public gp0 f8879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uo0 f8880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g80 f8881e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a60 f8882f;

    public /* synthetic */ p10(n10 n10Var, int i) {
        this.f8877a = i;
        this.f8878b = n10Var;
    }

    public q10 a() {
        gr.L(this.f8881e, g80.class);
        gr.L(this.f8882f, a60.class);
        return new q10(this.f8878b, new l80(16), this.f8881e, this.f8882f, new gk0(26), this.f8879c, this.f8880d);
    }

    public z10 b() {
        gr.L(this.f8881e, g80.class);
        gr.L(this.f8882f, a60.class);
        return new z10(this.f8878b, new l80(16), this.f8881e, this.f8882f, new gk0(26), this.f8879c, this.f8880d);
    }

    public final /* bridge */ Object c() {
        switch (this.f8877a) {
            case 0:
                return a();
            default:
                return b();
        }
    }
}
