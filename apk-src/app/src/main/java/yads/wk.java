package yads;

import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class wk implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f44415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yk f44416b;

    public wk(yk ykVar, Handler handler) {
        this.f44416b = ykVar;
        this.f44415a = handler;
    }

    public final void a(int i) {
        pk pkVar;
        yk ykVar = this.f44416b;
        if (i == -3 || i == -2) {
            if (i != -2 && ((pkVar = ykVar.f45072d) == null || pkVar.f41938b != 1)) {
                ykVar.b(3);
                return;
            } else {
                ykVar.a(0);
                ykVar.b(2);
                return;
            }
        }
        if (i == -1) {
            ykVar.a(-1);
            ykVar.a();
        } else if (i == 1) {
            ykVar.b(1);
            ykVar.a(1);
        } else {
            ykVar.getClass();
            kh1.d("AudioFocusManager", "Unknown focus change type: " + i);
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.f44415a.post(new a1.q(this, i, 12));
    }
}
