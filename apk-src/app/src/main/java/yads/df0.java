package yads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class df0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Spatializer f37744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f37745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f37746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public cf0 f37747d;

    public df0(Spatializer spatializer) {
        this.f37744a = spatializer;
        this.f37745b = spatializer.getImmersiveAudioLevel() != 0;
    }

    public final boolean a(nx0 nx0Var, pk pkVar) {
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(lb3.a(("audio/eac3-joc".equals(nx0Var.f41375m) && nx0Var.f41388z == 16) ? 12 : nx0Var.f41388z));
        int i = nx0Var.A;
        if (i != -1) {
            channelMask.setSampleRate(i);
        }
        Spatializer spatializer = this.f37744a;
        if (pkVar.f41943g == null) {
            pkVar.f41943g = new ok(pkVar);
        }
        return spatializer.canBeSpatialized(pkVar.f41943g.f41551a, channelMask.build());
    }

    public final boolean b() {
        return this.f37744a.isEnabled();
    }

    public final void c() {
        cf0 cf0Var = this.f37747d;
        if (cf0Var == null || this.f37746c == null) {
            return;
        }
        this.f37744a.removeOnSpatializerStateChangedListener(cf0Var);
        Handler handler = this.f37746c;
        int i = lb3.f40466a;
        handler.removeCallbacksAndMessages(null);
        this.f37746c = null;
        this.f37747d = null;
    }

    public final void a(if0 if0Var, Looper looper) {
        if (this.f37747d == null && this.f37746c == null) {
            this.f37747d = new cf0(if0Var);
            Handler handler = new Handler(looper);
            this.f37746c = handler;
            this.f37744a.addOnSpatializerStateChangedListener(new s3.x(1, handler), this.f37747d);
        }
    }

    public final boolean a() {
        return this.f37744a.isAvailable();
    }

    public static df0 a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return new df0(audioManager.getSpatializer());
    }
}
