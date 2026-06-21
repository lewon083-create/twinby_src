package yads;

import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class io0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f39598a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f39599b = "goog.exo.core";

    public static synchronized void a(String str) {
        if (f39598a.add(str)) {
            f39599b += ", " + str;
        }
    }
}
