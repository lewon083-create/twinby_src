package a2;

import android.content.ClipData;
import android.content.pm.ApkChecksum;
import android.location.LocationRequest;
import android.view.ContentInfo;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class d {
    public static /* bridge */ /* synthetic */ ApkChecksum e(Object obj) {
        return (ApkChecksum) obj;
    }

    public static /* bridge */ /* synthetic */ LocationRequest g(Object obj) {
        return (LocationRequest) obj;
    }

    public static /* synthetic */ ContentInfo.Builder j(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    public static /* bridge */ /* synthetic */ ContentInfo l(Object obj) {
        return (ContentInfo) obj;
    }
}
