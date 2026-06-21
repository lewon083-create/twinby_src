package a1;

import android.os.Build;
import androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f376c;

    public /* synthetic */ p(s sVar, int i) {
        this.f375b = i;
        this.f376c = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k kVar;
        switch (this.f375b) {
            case 0:
                s sVar = this.f376c;
                sVar.f393k.set(false);
                l lVar = sVar.f390g;
                lVar.a();
                if (lVar.f353d.getAndSet(false)) {
                    lVar.f350a.stop();
                    if (lVar.f350a.getRecordingState() != 1) {
                        com.google.android.gms.internal.auth.g.O("AudioStreamImpl", "Failed to stop AudioRecord with state: " + lVar.f350a.getRecordingState());
                    }
                    if (c1.a.f2187a.i(AudioTimestampFramePositionIncorrectQuirk.class) != null) {
                        lVar.f350a.release();
                        lVar.f350a = l.b(lVar.f355f, lVar.f351b, null);
                    }
                }
                synchronized (sVar.f388e) {
                    sVar.f389f = null;
                    sVar.f386c.clear();
                    break;
                }
                return;
            case 1:
                s sVar2 = this.f376c;
                try {
                    sVar2.f390g.d();
                    if (sVar2.f393k.getAndSet(true)) {
                        return;
                    }
                    sVar2.b();
                    return;
                } catch (i e3) {
                    throw new RuntimeException(e3);
                }
            case 2:
                this.f376c.b();
                return;
            default:
                s sVar3 = this.f376c;
                sVar3.f393k.set(false);
                l lVar2 = sVar3.f390g;
                if (!lVar2.f352c.getAndSet(true)) {
                    if (Build.VERSION.SDK_INT >= 29 && (kVar = lVar2.f359k) != null) {
                        b1.a.e(lVar2.f350a, kVar);
                    }
                    lVar2.f350a.release();
                }
                synchronized (sVar3.f388e) {
                    sVar3.f389f = null;
                    sVar3.f386c.clear();
                    break;
                }
                return;
        }
    }
}
