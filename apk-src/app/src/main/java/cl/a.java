package cl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f2397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f2398d;

    public a(String name, boolean z5) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f2395a = name;
        this.f2396b = z5;
        this.f2398d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f2395a;
    }
}
