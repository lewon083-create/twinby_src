package yads;

import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class be2 implements hf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public hf3 f37004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ce2 f37005b;

    public be2(ce2 ce2Var) {
        this.f37005b = ce2Var;
    }

    @Override // yads.hf3
    public final void a() {
        hf3 hf3Var = this.f37004a;
        if (hf3Var != null) {
            hf3Var.a();
        }
    }

    @Override // yads.hf3
    public final void b() {
        h72 h72Var = (h72) this.f37005b.f37352a.b();
        if (h72Var != null) {
            p52 p52Var = h72Var.f39052c;
            j72 j72Var = this.f37005b.f37354c;
            il1 il1Var = p52Var.f41822b;
            j72Var.getClass();
            if (il1Var != null) {
                CheckBox muteControl = il1Var.getMuteControl();
                if (muteControl != null) {
                    muteControl.setOnClickListener(null);
                    muteControl.setVisibility(8);
                }
                ProgressBar videoProgress = il1Var.getVideoProgress();
                if (videoProgress != null) {
                    videoProgress.setProgress(0);
                    videoProgress.setVisibility(8);
                }
                TextView countDownProgress = il1Var.getCountDownProgress();
                if (countDownProgress != null) {
                    countDownProgress.setText("");
                    countDownProgress.setVisibility(8);
                }
            }
        }
        hf3 hf3Var = this.f37004a;
        if (hf3Var != null) {
            hf3Var.b();
        }
    }

    @Override // yads.hf3
    public final void c() {
        h72 h72Var = (h72) this.f37005b.f37352a.b();
        if (h72Var != null) {
            this.f37005b.f37355d.a(h72Var);
        }
        hf3 hf3Var = this.f37004a;
        if (hf3Var != null) {
            hf3Var.c();
        }
    }
}
