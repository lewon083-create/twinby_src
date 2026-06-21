package yads;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f36894a = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f36895b = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f36896c;

    public b2(Context context) {
        this.f36896c = a(context);
    }

    public static int a(Context context) {
        return context.getResources().getConfiguration().orientation;
    }
}
