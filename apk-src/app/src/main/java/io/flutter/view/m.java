package io.flutter.view;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f25879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25880b;

    public m(View view, int i) {
        this.f25879a = view;
        this.f25880b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f25880b == mVar.f25880b && this.f25879a.equals(mVar.f25879a);
    }

    public final int hashCode() {
        return ((this.f25879a.hashCode() + 31) * 31) + this.f25880b;
    }
}
