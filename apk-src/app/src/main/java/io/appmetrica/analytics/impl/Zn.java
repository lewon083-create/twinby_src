package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Zn extends Qg {
    public Zn(Y4 y42) {
        super(y42);
    }

    @Override // io.appmetrica.analytics.impl.Qg
    public final boolean a(@NonNull Q5 q5) {
        String strJ = this.f22888a.f23284c.j();
        String str = q5.f22867h;
        this.f22888a.f23284c.j(str).b();
        if (TextUtils.equals(strJ, str)) {
            return false;
        }
        this.f22888a.a(N3.o());
        return false;
    }
}
