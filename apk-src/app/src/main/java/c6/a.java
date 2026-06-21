package c6;

import android.graphics.Insets;
import android.media.RouteDiscoveryPreference;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;
import com.google.android.gms.internal.ads.r51;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ RouteDiscoveryPreference.Builder h(r51 r51Var) {
        return new RouteDiscoveryPreference.Builder(r51Var, false);
    }

    public static /* synthetic */ WindowInsetsAnimation.Bounds j(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    public static /* synthetic */ WindowInsetsAnimation k(int i, Interpolator interpolator, long j10) {
        return new WindowInsetsAnimation(i, interpolator, j10);
    }

    public static /* bridge */ /* synthetic */ WindowInsetsAnimation l(Object obj) {
        return (WindowInsetsAnimation) obj;
    }

    public static /* synthetic */ void n() {
    }
}
