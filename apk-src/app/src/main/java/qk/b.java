package qk;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f32135b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(List missingFields, String str, b bVar) {
        super(str, bVar);
        Intrinsics.checkNotNullParameter(missingFields, "missingFields");
        this.f32135b = missingFields;
    }
}
