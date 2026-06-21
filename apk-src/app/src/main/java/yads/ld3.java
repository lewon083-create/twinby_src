package yads;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ld3 extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jd3 f40509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kd3 f40510c;

    /* JADX WARN: Illegal instructions before constructor call */
    public ld3(jd3 jd3Var, kd3 kd3Var) {
        String lowerCase = kd3Var.name().toLowerCase(Locale.US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        super("Verification not executed with reason = " + lowerCase);
        this.f40509b = jd3Var;
        this.f40510c = kd3Var;
    }
}
