package yads;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class xu0 extends kotlin.jvm.internal.r implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final xu0 f44806b = new xu0();

    public xu0() {
        super(1);
    }

    public static String a(Map.Entry entry) {
        return entry.getKey() + "=" + entry.getValue();
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a((Map.Entry) obj);
    }
}
