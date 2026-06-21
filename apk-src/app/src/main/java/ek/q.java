package ek;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class q extends n {
    public static a a(Iterator it) {
        Intrinsics.checkNotNullParameter(it, "<this>");
        p pVar = new p(0, it);
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        return new a(pVar);
    }
}
