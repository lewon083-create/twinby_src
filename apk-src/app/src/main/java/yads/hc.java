package yads;

import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class hc extends kotlin.jvm.internal.r implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JSONObject f39121b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hc(JSONObject jSONObject) {
        super(0);
        this.f39121b = jSONObject;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return je1.a("offerId", this.f39121b);
    }
}
