package x0;

import android.media.MediaMuxer;
import android.net.Uri;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f35683a;

    public /* synthetic */ w(m mVar) {
        this.f35683a = mVar;
    }

    public final MediaMuxer a(int i, f7.i iVar) {
        Uri uri = Uri.EMPTY;
        m mVar = this.f35683a;
        if (!(mVar instanceof m)) {
            throw new AssertionError("Invalid output options type: ".concat(mVar.getClass().getSimpleName()));
        }
        File file = mVar.f35649b.f35572c;
        File parentFile = file.getParentFile();
        if (!(parentFile == null ? false : parentFile.exists() ? parentFile.isDirectory() : parentFile.mkdirs())) {
            com.google.android.gms.internal.auth.g.O("Recorder", "Failed to create folder for " + file.getAbsolutePath());
        }
        MediaMuxer mediaMuxer = new MediaMuxer(file.getAbsolutePath(), i);
        ((b0) iVar.f16686b).K = Uri.fromFile(file);
        return mediaMuxer;
    }
}
