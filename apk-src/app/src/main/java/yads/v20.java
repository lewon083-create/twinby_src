package yads;

import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class v20 implements il1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckBox f43853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProgressBar f43854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f43855c;

    public v20(CheckBox checkBox, ProgressBar progressBar, TextView textView) {
        this.f43853a = checkBox;
        this.f43854b = progressBar;
        this.f43855c = textView;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v20)) {
            return false;
        }
        v20 v20Var = (v20) obj;
        return Intrinsics.a(this.f43853a, v20Var.f43853a) && Intrinsics.a(this.f43854b, v20Var.f43854b) && Intrinsics.a(this.f43855c, v20Var.f43855c);
    }

    @Override // yads.il1
    public final TextView getCountDownProgress() {
        return this.f43855c;
    }

    @Override // yads.il1
    public final CheckBox getMuteControl() {
        return this.f43853a;
    }

    @Override // yads.il1
    public final ProgressBar getVideoProgress() {
        return this.f43854b;
    }

    public final int hashCode() {
        CheckBox checkBox = this.f43853a;
        int iHashCode = (checkBox == null ? 0 : checkBox.hashCode()) * 31;
        ProgressBar progressBar = this.f43854b;
        int iHashCode2 = (iHashCode + (progressBar == null ? 0 : progressBar.hashCode())) * 31;
        TextView textView = this.f43855c;
        return iHashCode2 + (textView != null ? textView.hashCode() : 0);
    }

    public final String toString() {
        return "CustomControlsContainer(muteControl=" + this.f43853a + ", videoProgress=" + this.f43854b + ", countDownProgress=" + this.f43855c + ")";
    }
}
