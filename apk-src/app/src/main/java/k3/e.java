package k3;

import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AudioManager.OnAudioFocusChangeListener f26849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f26850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j3.d f26851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f26852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f26853f;

    public e(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, j3.d dVar, boolean z5) {
        this.f26848a = i;
        this.f26850c = handler;
        this.f26851d = dVar;
        this.f26852e = z5;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            this.f26849b = new d(onAudioFocusChangeListener, handler);
        } else {
            this.f26849b = onAudioFocusChangeListener;
        }
        if (i10 >= 26) {
            this.f26853f = io.sentry.android.core.o.f(i).setAudioAttributes(dVar.a()).setWillPauseWhenDucked(z5).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        } else {
            this.f26853f = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f26848a == eVar.f26848a && this.f26852e == eVar.f26852e && Objects.equals(this.f26849b, eVar.f26849b) && Objects.equals(this.f26850c, eVar.f26850c) && Objects.equals(this.f26851d, eVar.f26851d);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f26848a), this.f26849b, this.f26850c, this.f26851d, Boolean.valueOf(this.f26852e));
    }
}
