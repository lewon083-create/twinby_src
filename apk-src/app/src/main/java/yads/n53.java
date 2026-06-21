package yads;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class n53 {
    public static Object a(Callable callable, Object obj, String str, String str2) {
        if (obj == null) {
            return null;
        }
        try {
            return callable.call();
        } catch (Throwable unused) {
            return null;
        }
    }
}
