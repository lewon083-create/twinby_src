package j3;

import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f26413a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f26414b = "media3.common";

    public static synchronized void a(String str) {
        if (f26413a.add(str)) {
            f26414b += ", " + str;
        }
    }
}
