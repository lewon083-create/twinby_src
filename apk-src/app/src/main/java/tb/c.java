package tb;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f33673a = TimeUnit.MINUTES.toMillis(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f33674b = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f33675c = 0;

    public static void a(Activity activity, int i, int i10, Intent intent) {
        PendingIntent pendingIntentCreatePendingResult = activity.createPendingResult(i, intent, 1073741824);
        if (pendingIntentCreatePendingResult == null) {
            if (Log.isLoggable("AutoResolveHelper", 5)) {
                Log.w("AutoResolveHelper", "Null pending result returned when trying to deliver task result!");
            }
        } else {
            try {
                pendingIntentCreatePendingResult.send(i10);
            } catch (PendingIntent.CanceledException e3) {
                if (Log.isLoggable("AutoResolveHelper", 6)) {
                    Log.e("AutoResolveHelper", "Exception sending pending result", e3);
                }
            }
        }
    }
}
