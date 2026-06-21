package zk;

import java.util.ArrayList;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nl.j f46437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p f46438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f46439c;

    public q() {
        String boundary = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(boundary, "randomUUID().toString()");
        Intrinsics.checkNotNullParameter(boundary, "boundary");
        nl.j jVar = nl.j.f29541e;
        this.f46437a = l7.i.f(boundary);
        this.f46438b = s.f46442e;
        this.f46439c = new ArrayList();
    }
}
