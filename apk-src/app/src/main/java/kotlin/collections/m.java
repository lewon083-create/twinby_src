package kotlin.collections;

import com.google.android.gms.internal.ads.om1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class m {
    public static final void a(int i, int i10) {
        if (i > i10) {
            throw new IndexOutOfBoundsException(om1.j("toIndex (", i, ") is greater than size (", i10, ")."));
        }
    }
}
