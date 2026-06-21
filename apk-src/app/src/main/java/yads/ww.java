package yads;

import android.content.Context;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ww {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile zw f44506b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ww f44505a = new ww();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f44507c = new Object();

    public static xw a(Context context) {
        if (f44506b == null) {
            synchronized (f44507c) {
                try {
                    if (f44506b == null) {
                        f44506b = yw.a(context);
                    }
                    Unit unit = Unit.f27471a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        zw zwVar = f44506b;
        if (zwVar != null) {
            return zwVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
