package la;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f28061h;
    public static PendingIntent i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f28062j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f28064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b8.a f28065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f28066d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Messenger f28068f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g f28069g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1.i f28063a = new h1.i(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Messenger f28067e = new Messenger(new e(this, Looper.getMainLooper()));

    public b(Context context) {
        this.f28064b = context;
        this.f28065c = new b8.a(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f28066d = scheduledThreadPoolExecutor;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final sb.m a(android.os.Bundle r9) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: la.b.a(android.os.Bundle):sb.m");
    }

    public final void b(Bundle bundle, String str) {
        synchronized (this.f28063a) {
            try {
                sb.g gVar = (sb.g) this.f28063a.remove(str);
                if (gVar != null) {
                    gVar.b(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
