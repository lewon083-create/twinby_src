package b4;

import android.os.Build;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f1904b = new k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f1905c = new k();

    public List a(String str, boolean z5, boolean z10) {
        return y.e(str, z5, z10);
    }

    @Override // b4.x
    public int b(Object obj) {
        String str = ((p) obj).f1907a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Build.VERSION.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }
}
