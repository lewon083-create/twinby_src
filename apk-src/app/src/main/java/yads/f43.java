package yads;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class f43 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f38373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f38374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d43 f38375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AudioManager f38376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e43 f38377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HandlerThread f38378f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f38379g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f38380h;
    public boolean i;

    public f43(Context context, Handler handler, xn0 xn0Var) {
        Context applicationContext = context.getApplicationContext();
        this.f38373a = applicationContext;
        this.f38374b = handler;
        this.f38375c = xn0Var;
        AudioManager audioManager = (AudioManager) ni.a((AudioManager) applicationContext.getSystemService("audio"));
        this.f38376d = audioManager;
        this.f38379g = 3;
        this.f38380h = b(audioManager, 3);
        this.i = a(audioManager, this.f38379g);
        e43 e43Var = new e43(this);
        IntentFilter intentFilter = new IntentFilter("android.media.VOLUME_CHANGED_ACTION");
        try {
            HandlerThread handlerThread = new HandlerThread("StreamVolumeReceiver");
            this.f38378f = handlerThread;
            handlerThread.start();
            applicationContext.registerReceiver(e43Var, intentFilter, null, new Handler(this.f38378f.getLooper()));
            this.f38377e = e43Var;
        } catch (RuntimeException e3) {
            kh1.a(e3);
            HandlerThread handlerThread2 = this.f38378f;
            if (handlerThread2 != null) {
                handlerThread2.quitSafely();
                this.f38378f = null;
            }
        }
    }

    public static int b(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e3) {
            kh1.d("StreamVolumeManager", kh1.a("Could not retrieve stream volume for stream type " + i, e3));
            return audioManager.getStreamMaxVolume(i);
        }
    }

    public final void a(int i) {
        if (this.f38379g == i) {
            return;
        }
        this.f38379g = i;
        int iB = b(this.f38376d, i);
        boolean zA = a(this.f38376d, this.f38379g);
        if (this.f38380h != iB || this.i != zA) {
            this.f38380h = iB;
            this.i = zA;
            ((xn0) this.f38375c).a(zA, iB);
        }
        ((xn0) this.f38375c).a();
    }

    public final void b() {
        e43 e43Var = this.f38377e;
        if (e43Var != null) {
            try {
                this.f38373a.unregisterReceiver(e43Var);
            } catch (RuntimeException e3) {
                kh1.d("StreamVolumeManager", kh1.a("Error unregistering stream volume receiver", e3));
            }
            this.f38377e = null;
        }
        HandlerThread handlerThread = this.f38378f;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.f38378f = null;
        }
    }

    public final int a() {
        if (lb3.f40466a >= 28) {
            return this.f38376d.getStreamMinVolume(this.f38379g);
        }
        return 0;
    }

    public static boolean a(AudioManager audioManager, int i) {
        if (lb3.f40466a >= 23) {
            return audioManager.isStreamMute(i);
        }
        return b(audioManager, i) == 0;
    }
}
