package e1;

import android.media.MediaCodec;
import android.media.MediaFormat;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk;
import com.google.android.gms.internal.ads.oq;
import g0.s2;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends MediaCodec.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oq f15884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15886c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15887d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15888e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f15889f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f15890g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15891h = false;
    public boolean i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f15892j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f15893k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c0 f15894l;

    public a0(c0 c0Var) {
        this.f15894l = c0Var;
        this.f15885b = true;
        boolean z5 = c0Var.f15919c;
        this.f15893k = z5;
        if (z5) {
            a1.e eVar = c0Var.f15933r;
            s2 s2Var = c0Var.f15932q;
            CameraUseInconsistentTimebaseQuirk cameraUseInconsistentTimebaseQuirk = (CameraUseInconsistentTimebaseQuirk) c1.a.f2187a.i(CameraUseInconsistentTimebaseQuirk.class);
            oq oqVar = new oq();
            oqVar.f8753a = -1L;
            oqVar.f8754b = eVar;
            oqVar.f8755c = s2Var;
            oqVar.f8756d = cameraUseInconsistentTimebaseQuirk;
            this.f15884a = oqVar;
        } else {
            this.f15884a = null;
        }
        if (((CodecStuckOnFlushQuirk) c1.a.f2187a.i(CodecStuckOnFlushQuirk.class)) == null || !"video/mp4v-es".equals(c0Var.f15921e.getString("mime"))) {
            return;
        }
        this.f15885b = false;
    }

    public final void a() {
        c0 c0Var;
        n nVar;
        Executor executor;
        com.google.android.gms.internal.auth.g.e(this.f15894l.f15917a, "reachEndData");
        if (this.f15888e) {
            return;
        }
        this.f15888e = true;
        ScheduledFuture scheduledFuture = this.f15894l.F;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f15894l.F = null;
        }
        synchronized (this.f15894l.f15918b) {
            c0Var = this.f15894l;
            nVar = c0Var.f15936u;
            executor = c0Var.f15937v;
        }
        c0Var.n(new a1.c(this, executor, nVar, 10));
    }

    public final void b(j jVar, n nVar, Executor executor) {
        c0 c0Var = this.f15894l;
        c0Var.f15930o.add(jVar);
        k0.j.a(k0.j.f(jVar.f15970f), new a1.e(15, this, jVar), c0Var.i);
        try {
            executor.execute(new y(2, nVar, jVar));
        } catch (RejectedExecutionException e3) {
            com.google.android.gms.internal.auth.g.l(c0Var.f15917a, "Unable to post to the supplied executor.", e3);
            jVar.close();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        this.f15894l.i.execute(new a0.d(29, this, codecException));
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        this.f15894l.i.execute(new a1.q(this, i, 1));
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        this.f15894l.i.execute(new r(this, bufferInfo, mediaCodec, i));
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        c0 c0Var = this.f15894l;
        String str = c0Var.f15917a;
        StringBuilder sb2 = new StringBuilder("onOutputFormatChanged: mediaFormat = ");
        sb2.append(mediaFormat);
        sb2.append(", CSD data = ");
        StringBuilder sb3 = new StringBuilder("{csd-0 = ");
        sb3.append(a0.e.d(mediaFormat.getByteBuffer("csd-0")));
        if (mediaFormat.containsKey("csd-1")) {
            sb3.append(", csd-1 = ");
            sb3.append(a0.e.d(mediaFormat.getByteBuffer("csd-1")));
        }
        if (mediaFormat.containsKey("csd-2")) {
            sb3.append(", csd-2 = ");
            sb3.append(a0.e.d(mediaFormat.getByteBuffer("csd-2")));
        }
        sb3.append("}");
        sb2.append(sb3.toString());
        com.google.android.gms.internal.auth.g.e(str, sb2.toString());
        c0Var.i.execute(new y(0, this, mediaFormat));
    }
}
