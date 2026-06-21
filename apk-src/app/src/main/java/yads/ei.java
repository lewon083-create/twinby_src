package yads;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import io.sentry.android.core.cache.AndroidEnvelopeCache;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ei {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f38137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ij.g f38138b = ij.h.b(new zh(this));

    public ei(Context context) {
        this.f38137a = context;
    }

    public static final lf a(ei eiVar, ApplicationExitInfo applicationExitInfo) {
        eiVar.getClass();
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream == null) {
                return null;
            }
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(traceInputStream));
                try {
                    String strK = i0.o.K(bufferedReader);
                    bufferedReader.close();
                    traceInputStream.close();
                    if (strK == null) {
                        return null;
                    }
                    long timestamp = applicationExitInfo.getTimestamp();
                    String description = applicationExitInfo.getDescription();
                    if (description == null) {
                        description = AndroidEnvelopeCache.LAST_ANR_MARKER_LABEL;
                    }
                    int importance = applicationExitInfo.getImportance();
                    int pid = applicationExitInfo.getPid();
                    long pss = applicationExitInfo.getPss();
                    long rss = applicationExitInfo.getRss();
                    String processName = applicationExitInfo.getProcessName();
                    applicationExitInfo.getReason();
                    return new lf(timestamp, description, strK, importance, pid, pss, rss, processName, applicationExitInfo.getStatus(), applicationExitInfo.getRealUid());
                } finally {
                }
            } finally {
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    public final List a(int i, int i10, long j10) {
        ActivityManager activityManager = (ActivityManager) this.f38138b.getValue();
        if (activityManager != null) {
            return ek.u.g(ek.u.f(ek.u.b(ek.u.b(ek.u.b(CollectionsKt.w(activityManager.getHistoricalProcessExitReasons(this.f38137a.getPackageName(), 0, i)), ai.f36722b), new bi(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(i10))), new ci(j10)), new di(this)));
        }
        return kotlin.collections.b0.f27475b;
    }
}
