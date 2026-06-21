package io.flutter.plugin.platform;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements View.OnSystemUiVisibilityChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f25690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1.b f25691b;

    public e(d1.b bVar, View view) {
        this.f25691b = bVar;
        this.f25690a = view;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i) {
        this.f25690a.post(new a1.q(this, i, 2));
    }
}
