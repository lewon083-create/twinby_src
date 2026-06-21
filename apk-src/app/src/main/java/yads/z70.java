package yads;

import android.widget.ImageView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class z70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m41 f45269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f45270b;

    public z70(g03 g03Var, List list) {
        this.f45269a = g03Var;
        this.f45270b = list;
    }

    public final et a(String str, ImageView imageView) {
        zl.g1 g1Var = new zl.g1(this.f45269a.a(str, new y70(imageView), 0, 0));
        this.f45270b.add(g1Var);
        return g1Var;
    }

    public static final void a(k41 k41Var) {
        k41Var.a();
    }
}
