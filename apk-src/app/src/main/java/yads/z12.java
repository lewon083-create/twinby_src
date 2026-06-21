package yads;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class z12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f45227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CheckBox f45228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ProgressBar f45229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f45230d = kotlin.collections.b0.f27475b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f45231e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f45232f;

    public z12(View view, Map map) {
        this.f45227a = view;
        this.f45231e = kotlin.collections.j0.m(map);
    }

    public final Map a() {
        return this.f45231e;
    }

    public final List b() {
        return this.f45230d;
    }

    public final ImageView c() {
        return this.f45232f;
    }

    public final CheckBox d() {
        return this.f45228b;
    }

    public final View e() {
        return this.f45227a;
    }

    public final ProgressBar f() {
        return this.f45229c;
    }
}
