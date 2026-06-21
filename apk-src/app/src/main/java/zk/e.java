package zk;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String a10 = (String) obj;
        String b2 = (String) obj2;
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b2, "b");
        int iMin = Math.min(a10.length(), b2.length());
        for (int i = 4; i < iMin; i++) {
            char cCharAt = a10.charAt(i);
            char cCharAt2 = b2.charAt(i);
            if (cCharAt != cCharAt2) {
                return Intrinsics.d(cCharAt, cCharAt2) < 0 ? -1 : 1;
            }
        }
        int length = a10.length();
        int length2 = b2.length();
        if (length != length2) {
            return length < length2 ? -1 : 1;
        }
        return 0;
    }
}
