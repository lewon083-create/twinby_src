package wk;

import d8.e0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f35282d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e0 writer, boolean z5) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.f35282d = z5;
    }

    @Override // ac.c
    public final void q(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.f35282d) {
            super.q(value);
        } else {
            o(value);
        }
    }
}
