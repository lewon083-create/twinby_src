package z9;

import android.os.RemoteException;
import android.widget.ImageView;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.ads.in;
import u9.i;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f46219a;

    public void a(ImageView.ScaleType scaleType) {
        in inVar = ((NativeAdView) this.f46219a).f2578c;
        if (inVar == null || scaleType == null) {
            return;
        }
        try {
            inVar.w0(new xa.b(scaleType));
        } catch (RemoteException e3) {
            i.f("Unable to call setMediaViewImageScaleType on delegate", e3);
        }
    }
}
