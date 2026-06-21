package yads;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import io.sentry.protocol.Feedback;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class qu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f42389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nu2 f42390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lv f42391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n12 f42392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wz1 f42393e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final pu0 f42394f;

    public qu0(d4 d4Var, nu2 nu2Var, lv lvVar, n12 n12Var, wz1 wz1Var, pu0 pu0Var) {
        this.f42389a = d4Var;
        this.f42390b = nu2Var;
        this.f42391c = lvVar;
        this.f42392d = n12Var;
        this.f42393e = wz1Var;
        this.f42394f = pu0Var;
    }

    public final void a(Context context, hu0 hu0Var) {
        View viewA = this.f42392d.f41135c.a(Feedback.TYPE);
        ImageView imageView = viewA instanceof ImageView ? (ImageView) viewA : null;
        if (imageView == null) {
            return;
        }
        List list = hu0Var.f39329b;
        if (list.isEmpty()) {
            return;
        }
        try {
            za zaVar = new za(context, this.f42390b, this.f42389a);
            this.f42394f.getClass();
            PopupMenu popupMenuA = pu0.a(context, imageView, list);
            popupMenuA.setOnMenuItemClickListener(new fg2(zaVar, list, this.f42391c, this.f42393e));
            popupMenuA.show();
        } catch (Exception e3) {
            ((lu3) this.f42390b).a().reportError("Failed to render feedback", e3);
        }
    }
}
