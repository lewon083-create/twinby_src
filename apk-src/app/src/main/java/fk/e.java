package fk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class e {
    public static final double a(double d10, d sourceUnit, d targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        long jConvert = targetUnit.f19479b.convert(1L, sourceUnit.f19479b);
        return jConvert > 0 ? d10 * jConvert : d10 / r9.convert(1L, targetUnit.f19479b);
    }

    public static final long b(long j10, d sourceUnit, d targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        return targetUnit.f19479b.convert(j10, sourceUnit.f19479b);
    }
}
