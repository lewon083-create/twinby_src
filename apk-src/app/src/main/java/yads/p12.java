package yads;

import android.view.View;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class p12 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f41800b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile p12 f41801c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f41802a;

    public p12(Map map) {
        this.f41802a = map;
    }

    public final void a(View view, r32 r32Var) {
        synchronized (f41800b) {
            this.f41802a.put(view, r32Var);
            Unit unit = Unit.f27471a;
        }
    }
}
