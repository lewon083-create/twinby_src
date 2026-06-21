package qi;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends Throwable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f32127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f32128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f32129d;

    public g(String str, HashMap map) {
        Intrinsics.checkNotNullParameter("firebase_remote_config", "code");
        this.f32127b = "firebase_remote_config";
        this.f32128c = str;
        this.f32129d = map;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f32128c;
    }
}
