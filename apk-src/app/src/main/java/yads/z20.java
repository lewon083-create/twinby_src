package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class z20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f45233a;

    public z20(Context context) {
        this.f45233a = uz.a(context);
    }

    public final boolean a() {
        return (this.f45233a.getResources().getConfiguration().uiMode & 48) == 32;
    }
}
