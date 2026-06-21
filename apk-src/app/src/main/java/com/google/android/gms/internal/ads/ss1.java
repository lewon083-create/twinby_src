package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ss1 implements qs1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f10379c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile ms1 f10380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f10381b;

    public static qs1 a(ms1 ms1Var) {
        if ((ms1Var instanceof ss1) || (ms1Var instanceof ls1)) {
            return ms1Var;
        }
        ss1 ss1Var = new ss1();
        ss1Var.f10381b = f10379c;
        ss1Var.f10380a = ms1Var;
        return ss1Var;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        Object obj = this.f10381b;
        if (obj != f10379c) {
            return obj;
        }
        ms1 ms1Var = this.f10380a;
        if (ms1Var == null) {
            return this.f10381b;
        }
        Object objJ = ms1Var.j();
        this.f10381b = objJ;
        this.f10380a = null;
        return objJ;
    }
}
