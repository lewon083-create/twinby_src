package k6;

import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f27023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f27028f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f27029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f27030h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f27031j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f27032k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f27033l;

    public final void a(View view) {
        int layoutPosition;
        int size = this.f27032k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            View view3 = ((androidx.recyclerview.widget.p) this.f27032k.get(i10)).itemView;
            w0 w0Var = (w0) view3.getLayoutParams();
            if (view3 != view && !w0Var.f27220a.isRemoved() && (layoutPosition = (w0Var.f27220a.getLayoutPosition() - this.f27026d) * this.f27027e) >= 0 && layoutPosition < i) {
                view2 = view3;
                if (layoutPosition == 0) {
                    break;
                } else {
                    i = layoutPosition;
                }
            }
        }
        if (view2 == null) {
            this.f27026d = -1;
        } else {
            this.f27026d = ((w0) view2.getLayoutParams()).f27220a.getLayoutPosition();
        }
    }

    public final View b(androidx.recyclerview.widget.k kVar) {
        List list = this.f27032k;
        if (list == null) {
            View view = kVar.k(this.f27026d, Long.MAX_VALUE).itemView;
            this.f27026d += this.f27027e;
            return view;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view2 = ((androidx.recyclerview.widget.p) this.f27032k.get(i)).itemView;
            w0 w0Var = (w0) view2.getLayoutParams();
            if (!w0Var.f27220a.isRemoved() && this.f27026d == w0Var.f27220a.getLayoutPosition()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
