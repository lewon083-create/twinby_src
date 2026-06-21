package yads;

import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class tn3 implements il1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a22 f43382a;

    public tn3(a22 a22Var) {
        this.f43382a = a22Var;
    }

    @Override // yads.il1
    public final TextView getCountDownProgress() {
        return null;
    }

    @Override // yads.il1
    public final CheckBox getMuteControl() {
        nm2 nm2Var = this.f43382a.f36614c;
        dk.i iVar = a22.f36611g[2];
        return (CheckBox) nm2Var.f41294a.get();
    }

    @Override // yads.il1
    public final ProgressBar getVideoProgress() {
        nm2 nm2Var = this.f43382a.f36615d;
        dk.i iVar = a22.f36611g[3];
        return (ProgressBar) nm2Var.f41294a.get();
    }
}
