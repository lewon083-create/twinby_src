package yads;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class km0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f40244h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f40245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f40246b = kotlin.collections.b0.f27475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f40247c = kotlin.collections.j0.d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f40248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f40249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f40250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f40251g;

    public final Map a() {
        return this.f40247c;
    }

    public final String b() {
        String str;
        synchronized (f40244h) {
            str = this.f40251g;
        }
        return str;
    }
}
