package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v90 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cw f11316b;

    public /* synthetic */ v90(cw cwVar, int i) {
        this.f11315a = i;
        this.f11316b = cwVar;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f11315a) {
            case 0:
                JSONObject jSONObject = (JSONObject) this.f11316b.f4347c;
                gr.G(jSONObject);
                return jSONObject;
            case 1:
                kc0 kc0Var = (kc0) this.f11316b.f4348d;
                gr.G(kc0Var);
                return kc0Var;
            case 2:
                return (p9.a) this.f11316b.f4349e;
            default:
                return (wv) this.f11316b.f4350f;
        }
    }
}
