package ef;

import e1.y;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.j0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f16358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f16359c;

    public /* synthetic */ a(c cVar, String str) {
        this.f16358b = cVar;
        this.f16359c = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String event = (String) obj;
        Map map = (Map) obj2;
        LinkedHashMap linkedHashMap = c.f16361l;
        Intrinsics.checkNotNullParameter(event, "event");
        HashMap mapF = j0.f(new Pair("type", "native"), new Pair("event", event), new Pair("id", this.f16359c));
        if (map != null) {
            mapF.put("payload", map);
        }
        c cVar = this.f16358b;
        cVar.f16365e.post(new y(7, cVar, mapF));
        return Unit.f27471a;
    }
}
