package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f1598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s f1599b;

    public final void a(u uVar, n event) {
        Intrinsics.checkNotNullParameter(event, "event");
        o oVarA = event.a();
        o state1 = this.f1598a;
        Intrinsics.checkNotNullParameter(state1, "state1");
        if (oVarA.compareTo(state1) < 0) {
            state1 = oVarA;
        }
        this.f1598a = state1;
        this.f1599b.d(uVar, event);
        this.f1598a = oVarA;
    }
}
