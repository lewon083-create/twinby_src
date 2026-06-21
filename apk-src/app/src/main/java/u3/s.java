package u3;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.ads.iv1;
import com.google.android.gms.internal.ads.jv1;
import com.google.android.gms.internal.ads.pv1;
import com.google.android.gms.internal.ads.yf0;
import com.google.android.gms.internal.ads.yi0;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f34172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f34173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r3.b f34174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ni.i f34175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public yf0 f34176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m3.t f34177f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f34178g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public yi0 f34179h;
    public Looper i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Context f34180j;

    public s(com.google.firebase.messaging.y yVar) {
        Context context = (Context) yVar.f14899b;
        this.f34172a = context;
        r3.b bVar = (r3.b) yVar.f14900c;
        bVar.getClass();
        this.f34174c = bVar;
        this.f34173b = (z) yVar.f14901d;
        this.f34178g = (b) yVar.f14902e;
        this.f34175d = context == null ? null : new ni.i(16, this);
        this.f34177f = m3.t.f28598a;
    }

    public final r a(j jVar) throws h {
        Context context;
        Context context2;
        try {
            int i = jVar.f34135h;
            int i10 = jVar.i;
            if (i10 == -1 || (context2 = this.f34172a) == null || Build.VERSION.SDK_INT < 34) {
                context = null;
            } else {
                Context context3 = this.f34180j;
                if (context3 == null || context3.getDeviceId() != i10) {
                    this.f34180j = context2.createDeviceContext(i10);
                }
                context = this.f34180j;
                i = 0;
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(jVar.f34131d ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : jVar.f34134g.a()).setAudioFormat(new AudioFormat.Builder().setSampleRate(jVar.f34129b).setChannelMask(jVar.f34130c).setEncoding(jVar.f34128a).build()).setTransferMode(1).setBufferSizeInBytes(jVar.f34133f).setSessionId(i);
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 29) {
                sessionId.setOffloadedPlayback(jVar.f34132e);
            }
            if (i11 >= 34 && context != null) {
                sessionId.setContext(context);
            }
            AudioTrack audioTrackBuild = sessionId.build();
            if (audioTrackBuild.getState() == 1) {
                return new r(audioTrackBuild, jVar, this.f34175d, this.f34177f);
            }
            try {
                audioTrackBuild.release();
            } catch (Exception unused) {
            }
            throw new h();
        } catch (IllegalArgumentException e3) {
            e = e3;
            throw new h(e);
        } catch (UnsupportedOperationException e7) {
            e = e7;
            throw new h(e);
        }
    }

    public final g b(f fVar) {
        e(fVar);
        j3.o oVar = fVar.f34106a;
        j3.d dVar = fVar.f34107b;
        c cVarV = this.f34174c.v(oVar, dVar);
        pv1 pv1Var = new pv1();
        String str = oVar.f26335n;
        int i = oVar.H;
        int i10 = 0;
        if (!Objects.equals(str, "audio/raw") ? this.f34178g.d(oVar, dVar) != null : i == 2) {
            i10 = 2;
        }
        pv1Var.f9192a = i10;
        pv1Var.f9193b = cVarV.f34082a;
        pv1Var.f9194c = cVarV.f34083b;
        pv1Var.f9195d = cVarV.f34084c;
        return pv1Var.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final u3.j c(u3.f r25) {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.s.c(u3.f):u3.j");
    }

    public final void d() {
        yf0 yf0Var = this.f34176e;
        if (yf0Var != null) {
            yf0Var.d();
        }
        yi0 yi0Var = this.f34179h;
        if (yi0Var != null) {
            Context context = (Context) yi0Var.f12623c;
            if (yi0Var.f12622b) {
                yi0Var.i = null;
                k3.f.n(context).unregisterAudioDeviceCallback((iv1) yi0Var.f12626f);
                context.unregisterReceiver((bj.g) yi0Var.f12627g);
                jv1 jv1Var = (jv1) yi0Var.f12628h;
                if (jv1Var != null) {
                    jv1Var.f6945b.unregisterContentObserver(jv1Var);
                }
                yi0Var.f12622b = false;
            }
        }
    }

    public final void e(f fVar) {
        Context context;
        b bVarB;
        AudioDeviceInfo audioDeviceInfo = fVar.f34108c;
        j3.d dVar = fVar.f34107b;
        f();
        yi0 yi0Var = this.f34179h;
        if (yi0Var == null && (context = this.f34172a) != null) {
            yi0 yi0Var2 = new yi0(context, new s3.q(15, this), dVar, audioDeviceInfo);
            this.f34179h = yi0Var2;
            Handler handler = (Handler) yi0Var2.f12625e;
            Context context2 = (Context) yi0Var2.f12623c;
            if (yi0Var2.f12622b) {
                bVarB = (b) yi0Var2.i;
                bVarB.getClass();
            } else {
                yi0Var2.f12622b = true;
                jv1 jv1Var = (jv1) yi0Var2.f12628h;
                if (jv1Var != null) {
                    jv1Var.f6945b.registerContentObserver(jv1Var.f6946c, false, jv1Var);
                }
                k3.f.n(context2).registerAudioDeviceCallback((iv1) yi0Var2.f12626f, handler);
                bVarB = b.b(context2, context2.registerReceiver((bj.g) yi0Var2.f12627g, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), (j3.d) yi0Var2.f12630k, (AudioDeviceInfo) yi0Var2.f12629j);
                yi0Var2.i = bVarB;
            }
            this.f34178g = bVarB;
        } else if (yi0Var != null) {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals((AudioDeviceInfo) yi0Var.f12629j)) {
                yi0Var.f12629j = audioDeviceInfo;
                yi0Var.e(b.c((Context) yi0Var.f12623c, (j3.d) yi0Var.f12630k, audioDeviceInfo));
            }
            yi0 yi0Var3 = this.f34179h;
            if (!Objects.equals(dVar, (j3.d) yi0Var3.f12630k)) {
                yi0Var3.f12630k = dVar;
                yi0Var3.e(b.c((Context) yi0Var3.f12623c, dVar, (AudioDeviceInfo) yi0Var3.f12629j));
            }
        }
        this.f34178g.getClass();
    }

    public final void f() {
        if (this.f34172a == null) {
            return;
        }
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.i;
        boolean z5 = looper == null || looper == looperMyLooper;
        String name = looper == null ? "null" : looper.getThread().getName();
        String name2 = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null";
        if (!z5) {
            throw new IllegalStateException(hl.d.q("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, name2));
        }
        this.i = looperMyLooper;
    }
}
