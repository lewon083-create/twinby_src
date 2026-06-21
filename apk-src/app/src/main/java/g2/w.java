package g2;

import android.os.Build;
import androidx.core.widget.NestedScrollView;
import fh.of;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f19934a;

    public w(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f19934a = new u(nestedScrollView);
        } else {
            this.f19934a = new of();
        }
    }
}
