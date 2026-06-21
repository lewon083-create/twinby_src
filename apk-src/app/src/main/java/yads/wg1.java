package yads;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class wg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f44393a = new ConcurrentHashMap();

    public static final tg1 a(Context context) {
        return a(context, "YadPreferenceFile");
    }

    public static final tg1 a(Context context, String str) {
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = f44393a;
        Object vg1Var = concurrentHashMap.get(str);
        if (vg1Var == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(str, (vg1Var = new vg1(context, str, new ry2())))) != null) {
            vg1Var = objPutIfAbsent;
        }
        return (tg1) vg1Var;
    }
}
