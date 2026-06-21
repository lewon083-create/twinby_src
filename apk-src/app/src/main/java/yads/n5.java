package yads;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class n5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f41173a = "yandex_ad_info";

    public static String a(ge3 ge3Var) {
        Object next;
        Iterator it = ge3Var.f38748a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.a(((iq0) next).f39615a, f41173a)) {
                break;
            }
        }
        iq0 iq0Var = (iq0) next;
        if (iq0Var != null) {
            return iq0Var.f39616b;
        }
        return null;
    }
}
