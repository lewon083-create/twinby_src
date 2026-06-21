package n8;

import android.util.SparseArray;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseArray f29173a = new SparseArray();

    public static void a(o8.a handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        f29173a.append(handler.getType(), handler);
    }
}
