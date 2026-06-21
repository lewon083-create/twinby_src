package g3;

import com.google.android.gms.internal.ads.om1;
import fh.zf;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zf f19955a = new zf();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f19956b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f19957c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f19958d;

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                om1.q(autoCloseable);
            } catch (Exception e3) {
                throw new RuntimeException(e3);
            }
        }
    }
}
