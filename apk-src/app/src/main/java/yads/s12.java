package yads;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class s12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f42780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s22 f42781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CheckBox f42782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ProgressBar f42783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f42784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f42785f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f42786g = kotlin.collections.b0.f27475b;

    public s12(View view, s22 s22Var, Map map) {
        this.f42780a = view;
        this.f42781b = s22Var;
        this.f42784e = kotlin.collections.j0.m(map);
    }

    public final Map a() {
        return this.f42784e;
    }

    public final List b() {
        return this.f42786g;
    }

    public final ImageView c() {
        return this.f42785f;
    }

    public final CheckBox d() {
        return this.f42782c;
    }

    public final View e() {
        return this.f42780a;
    }

    public final s22 f() {
        return this.f42781b;
    }

    public final ProgressBar g() {
        return this.f42783d;
    }
}
