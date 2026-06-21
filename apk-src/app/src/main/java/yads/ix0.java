package yads;

import android.content.Context;
import android.graphics.Typeface;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ix0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iw0 f39664a;

    public /* synthetic */ ix0(Context context) {
        this(new iw0(context.getApplicationContext()));
    }

    public final Typeface a(tw0 tw0Var) {
        ConcurrentHashMap concurrentHashMap = fx0.f38569a;
        Typeface typeface = (Typeface) concurrentHashMap.get(tw0Var);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceA = this.f39664a.a(tw0Var);
        if (typefaceA == null) {
            return null;
        }
        concurrentHashMap.put(tw0Var, typefaceA);
        return typefaceA;
    }

    public ix0(iw0 iw0Var) {
        this.f39664a = iw0Var;
    }
}
