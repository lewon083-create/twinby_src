package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class my {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioManager.OnAudioFocusChangeListener f8034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f8035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s50 f8036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f8037d;

    public my(pu puVar, Handler handler, s50 s50Var) {
        this.f8035b = handler;
        this.f8036c = s50Var;
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            this.f8034a = new yx(puVar, handler);
        } else {
            this.f8034a = puVar;
        }
        this.f8037d = i >= 26 ? a7.d.i().setAudioAttributes(s50Var.a()).setWillPauseWhenDucked(false).setOnAudioFocusChangeListener(puVar, handler).build() : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof my)) {
            return false;
        }
        my myVar = (my) obj;
        return Objects.equals(this.f8034a, myVar.f8034a) && Objects.equals(this.f8035b, myVar.f8035b) && Objects.equals(this.f8036c, myVar.f8036c);
    }

    public final int hashCode() {
        return Objects.hash(1, this.f8034a, this.f8035b, this.f8036c, Boolean.FALSE);
    }
}
