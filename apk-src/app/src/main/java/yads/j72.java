package yads;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.yandex.varioqub.config.model.ConfigValue;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class j72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final di3 f39745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y52 f39746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f39747c;

    public /* synthetic */ j72(r52 r52Var, di3 di3Var) {
        this(di3Var, new y52(r52Var));
    }

    public final void a(il1 il1Var) {
        if (il1Var != null) {
            CheckBox muteControl = il1Var.getMuteControl();
            if (muteControl != null) {
                muteControl.setOnClickListener(new zl.u(0, this, muteControl));
                muteControl.setVisibility(this.f39745a.f37776b ? 0 : 8);
            }
            ProgressBar videoProgress = il1Var.getVideoProgress();
            if (videoProgress != null) {
                videoProgress.setVisibility(this.f39745a.f37777c ? 8 : 0);
            }
            TextView countDownProgress = il1Var.getCountDownProgress();
            if (countDownProgress != null) {
                countDownProgress.setText("");
                countDownProgress.setVisibility(0);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public j72(yads.di3 r5, yads.y52 r6) {
        /*
            r4 = this;
            r4.<init>()
            r4.f39745a = r5
            r4.f39746b = r6
            java.lang.Double r5 = r5.a()
            if (r5 == 0) goto L25
            double r0 = r5.doubleValue()
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L19
            r6 = 1
            goto L1a
        L19:
            r6 = 0
        L1a:
            if (r6 != 0) goto L1d
            goto L1e
        L1d:
            r5 = 0
        L1e:
            if (r5 == 0) goto L25
            double r5 = r5.doubleValue()
            goto L27
        L25:
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L27:
            r4.f39747c = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.j72.<init>(yads.di3, yads.y52):void");
    }

    public static final void a(j72 j72Var, CheckBox checkBox, View view) {
        double d10 = !checkBox.isChecked() ? j72Var.f39747c : ConfigValue.DOUBLE_DEFAULT_VALUE;
        y52 y52Var = j72Var.f39746b;
        y52Var.getClass();
        y52Var.f44925a.setVolume((float) d10);
    }
}
