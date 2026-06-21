package yads;

import android.view.TextureView;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r52 f39455a;

    public i72(r52 r52Var) {
        this.f39455a = r52Var;
    }

    public final void a(h72 h72Var) {
        TextureView textureView = h72Var.f39051b;
        this.f39455a.a(textureView);
        textureView.setVisibility(0);
        h72Var.f39052c.setVisibility(0);
        h72Var.f39050a.setVisibility(0);
    }

    public final void b(h72 h72Var) {
        TextureView textureView = h72Var.f39051b;
        this.f39455a.a((TextureView) null);
        textureView.setVisibility(8);
        h72Var.f39052c.setVisibility(8);
        h72Var.f39050a.setVisibility(8);
    }
}
