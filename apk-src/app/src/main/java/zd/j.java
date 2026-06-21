package zd;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f46266b = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f46267c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static j f46268d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g8.g f46269a;

    public j(g8.g gVar) {
        this.f46269a = gVar;
    }

    public final boolean a(ae.b bVar) {
        if (TextUtils.isEmpty(bVar.f913c)) {
            return true;
        }
        long j10 = bVar.f916f + bVar.f915e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f46269a.getClass();
        return j10 < timeUnit.toSeconds(System.currentTimeMillis()) + f46266b;
    }
}
