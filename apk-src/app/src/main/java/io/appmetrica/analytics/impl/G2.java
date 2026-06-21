package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class G2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ef f22371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Fa f22372b;

    public G2(Ef ef2, Fa fa) {
        this.f22371a = ef2;
        this.f22372b = fa;
    }

    public final boolean a(@NonNull Q5 q5, @NonNull F2 f22) {
        Iterator it = ((W8) this.f22371a.a(q5.f22863d)).f23211a.iterator();
        while (it.hasNext()) {
            if (f22.a(it.next(), q5)) {
                return true;
            }
        }
        return false;
    }

    public final Ef b() {
        return this.f22371a;
    }

    public final Fa a() {
        return this.f22372b;
    }
}
