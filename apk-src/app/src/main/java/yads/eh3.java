package yads;

import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class eh3 implements fv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h72 f38135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b20 f38136b;

    public eh3(h72 h72Var, b20 b20Var) {
        this.f38135a = h72Var;
        this.f38136b = b20Var;
    }

    @Override // yads.fv
    public final void a(kf1 kf1Var, hv hvVar) {
        ou ouVar = new ou(this.f38135a.getContext(), new dh3(kf1Var, hvVar, this.f38136b));
        h72 h72Var = this.f38135a;
        h72Var.setOnTouchListener(ouVar);
        h72Var.setOnClickListener(ouVar);
        ImageView imageView = this.f38135a.f39050a.f39210b;
        if (imageView != null) {
            imageView.setOnTouchListener(ouVar);
            imageView.setOnClickListener(ouVar);
        }
    }
}
