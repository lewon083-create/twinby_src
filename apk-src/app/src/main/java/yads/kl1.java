package yads;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class kl1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zv3 f40243a;

    public kl1(zv3 zv3Var) {
        this.f40243a = zv3Var;
    }

    public final void a(float f10, float f11) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Invalid Media duration");
        }
        if (f11 < 0.0f || f11 > 1.0f) {
            throw new IllegalArgumentException("Invalid Media volume");
        }
        hx3.a(this.f40243a);
        JSONObject jSONObject = new JSONObject();
        ow3.a(jSONObject, "duration", Float.valueOf(f10));
        ow3.a(jSONObject, "mediaPlayerVolume", Float.valueOf(f11));
        ow3.a(jSONObject, "deviceVolume", Float.valueOf(mx3.a().f41100a));
        this.f40243a.f45556e.a("start", jSONObject);
    }

    public final void a(float f10) {
        if (f10 >= 0.0f && f10 <= 1.0f) {
            hx3.a(this.f40243a);
            JSONObject jSONObject = new JSONObject();
            ow3.a(jSONObject, "mediaPlayerVolume", Float.valueOf(f10));
            ow3.a(jSONObject, "deviceVolume", Float.valueOf(mx3.a().f41100a));
            this.f40243a.f45556e.a("volumeChange", jSONObject);
            return;
        }
        throw new IllegalArgumentException("Invalid Media volume");
    }
}
