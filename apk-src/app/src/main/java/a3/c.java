package a3;

import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.collections.a0;
import kotlin.collections.c0;
import kotlin.collections.d0;
import kotlin.collections.j0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f413c = new c(d0.f27478b, j0.d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f415b;

    public c(d0 flags, c0 allowedViolations) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(allowedViolations, "allowedViolations");
        this.f414a = flags;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        d0.f27478b.getClass();
        a0.f27474b.getClass();
        this.f415b = linkedHashMap;
    }
}
