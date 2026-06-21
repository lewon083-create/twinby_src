package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a40 implements z60 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f2742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u9.a f2743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xp0 f2744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ iq0 f2745f;

    public /* synthetic */ a40(Context context, u9.a aVar, xp0 xp0Var, iq0 iq0Var, int i) {
        this.f2741b = i;
        this.f2742c = context;
        this.f2743d = aVar;
        this.f2744e = xp0Var;
        this.f2745f = iq0Var;
    }

    @Override // com.google.android.gms.internal.ads.z60
    public final void k() {
        switch (this.f2741b) {
            case 0:
                JSONObject jSONObject = this.f2744e.C;
                p9.k.C.f31308o.d(this.f2742c, this.f2743d.f34365b, jSONObject.toString(), this.f2745f.f6575g);
                break;
            default:
                JSONObject jSONObject2 = this.f2744e.C;
                p9.k.C.f31308o.d(this.f2742c, this.f2743d.f34365b, jSONObject2.toString(), this.f2745f.f6575g);
                break;
        }
    }
}
