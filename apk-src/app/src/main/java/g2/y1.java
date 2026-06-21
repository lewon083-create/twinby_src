package g2;

import android.view.View;
import android.view.Window;
import com.google.android.gms.internal.measurement.d4;
import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class y1 extends d4 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Window f19953h;

    public y1(Window window) {
        this.f19953h = window;
    }

    @Override // com.google.android.gms.internal.measurement.d4
    public final void w(boolean z5) {
        Window window = this.f19953h;
        if (!z5) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        } else {
            window.clearFlags(67108864);
            window.addFlags(VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 8192);
        }
    }
}
