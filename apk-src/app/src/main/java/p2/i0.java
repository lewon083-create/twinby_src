package p2;

import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashSet f30982c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f30983d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0 f30984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f30985b;

    public i0(s0 serializer, Function0 produceFile) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        h0 coordinatorProducer = h0.f30980f;
        Intrinsics.checkNotNullParameter(coordinatorProducer, "coordinatorProducer");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        this.f30984a = serializer;
        this.f30985b = produceFile;
    }
}
