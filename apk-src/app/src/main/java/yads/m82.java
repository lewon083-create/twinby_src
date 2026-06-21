package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class m82 {
    public static final int a(Context context) {
        Integer num;
        pt2 pt2VarA = fw2.a().a(context);
        if (pt2VarA == null || (num = pt2VarA.f42050r0) == null) {
            return 1;
        }
        if (num.intValue() == 0) {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }
}
