package wk;

import com.google.android.gms.internal.measurement.h5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f35278a;

    static {
        Object objS;
        try {
            ij.k kVar = ij.m.f21341c;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            Intrinsics.checkNotNullExpressionValue(property, "getProperty(...)");
            objS = StringsKt.toIntOrNull(property);
        } catch (Throwable th2) {
            ij.k kVar2 = ij.m.f21341c;
            objS = h5.s(th2);
        }
        if (objS instanceof ij.l) {
            objS = null;
        }
        Integer num = (Integer) objS;
        f35278a = num != null ? num.intValue() : 2097152;
    }
}
