package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r30 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y40 f9692b;

    public /* synthetic */ r30(y40 y40Var, int i) {
        this.f9691a = i;
        this.f9692b = y40Var;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final /* bridge */ /* synthetic */ Object j() {
        switch (this.f9691a) {
            case 0:
                try {
                    return new JSONObject(this.f9692b.a().f12274z);
                } catch (JSONException unused) {
                    return null;
                }
            default:
                return new la0(this.f9692b.a());
        }
    }
}
