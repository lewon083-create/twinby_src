package t9;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.wk;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile float f33538c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile long f33539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f33540e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f33541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f33542b;

    public static float b(Context context) {
        wk wkVar = al.sf;
        q9.s sVar = q9.s.f31967e;
        float f10 = 0.0f;
        if (!((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return 0.0f;
            }
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            int streamVolume = audioManager.getStreamVolume(3);
            if (streamMaxVolume == 0) {
                return 0.0f;
            }
            return streamVolume / streamMaxVolume;
        }
        p9.k kVar = p9.k.C;
        kVar.f31304k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jIntValue = ((Integer) sVar.f31970c.a(al.f3219tf)).intValue();
        if (f33538c != -1.0f && jCurrentTimeMillis - f33539d < jIntValue) {
            return f33538c;
        }
        synchronized (f33540e) {
            try {
                kVar.f31304k.getClass();
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                if (f33538c != -1.0f && jCurrentTimeMillis2 - f33539d < jIntValue) {
                    return f33538c;
                }
                AudioManager audioManager2 = (AudioManager) context.getSystemService("audio");
                if (audioManager2 == null) {
                    f33538c = 0.0f;
                    f33539d = jCurrentTimeMillis2;
                    return 0.0f;
                }
                int streamMaxVolume2 = audioManager2.getStreamMaxVolume(3);
                int streamVolume2 = audioManager2.getStreamVolume(3);
                if (streamMaxVolume2 != 0) {
                    f10 = streamVolume2 / streamMaxVolume2;
                }
                f33538c = f10;
                f33539d = jCurrentTimeMillis2;
                return f33538c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized float a() {
        synchronized (this) {
            float f10 = this.f33542b;
            if (f10 >= 0.0f) {
                return f10;
            }
            return 1.0f;
        }
    }
}
