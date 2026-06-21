package yads;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class jx1 extends androidx.recyclerview.widget.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f40006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gx1 f40007b;

    public jx1(oi2 oi2Var, List list, v9 v9Var) {
        this.f40006a = list;
        this.f40007b = new gx1(oi2Var, v9Var);
    }

    @Override // androidx.recyclerview.widget.g
    public final int getItemCount() {
        return this.f40006a.size();
    }

    @Override // androidx.recyclerview.widget.g
    public final void onBindViewHolder(androidx.recyclerview.widget.p pVar, int i) {
        ((ex1) pVar).f38276a.b((w41) this.f40006a.get(i));
    }

    @Override // androidx.recyclerview.widget.g
    public final androidx.recyclerview.widget.p onCreateViewHolder(ViewGroup viewGroup, int i) {
        gx1 gx1Var = this.f40007b;
        gx1Var.getClass();
        ImageView imageView = new ImageView(viewGroup.getContext());
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setOnClickListener(new fx1());
        return new ex1(imageView, new e51(imageView, gx1Var.f38935a, gx1Var.f38936b));
    }
}
