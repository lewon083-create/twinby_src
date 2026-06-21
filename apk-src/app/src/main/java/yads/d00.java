package yads;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d00 {
    public static e00 a(String str) {
        Object next;
        Iterator<E> it = e00.f37949l.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.a(((e00) next).f37950b, str)) {
                break;
            }
        }
        return (e00) next;
    }
}
