package yads;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class yc implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Dialog f44996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final me1 f44997b;

    public yc(Dialog dialog, me1 me1Var) {
        this.f44996a = dialog;
        this.f44997b = me1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f44997b.getClass();
        me1.a(view);
        ng0.a(this.f44996a);
    }
}
