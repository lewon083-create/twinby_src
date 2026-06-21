package c0;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.view.SurfaceHolder;
import g8.g;
import ij.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f2180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f2181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f2182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f2183f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f2184g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f2185h;
    public static final /* synthetic */ d[] i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f2186b;

    static {
        d dVar = new d(0, SurfaceHolder.class, "PREVIEW");
        f2181d = dVar;
        d dVar2 = new d(1, null, "IMAGE_CAPTURE");
        f2182e = dVar2;
        d dVar3 = new d(2, MediaCodec.class, "VIDEO_CAPTURE");
        f2183f = dVar3;
        d dVar4 = new d(3, SurfaceTexture.class, "STREAM_SHARING");
        f2184g = dVar4;
        d dVar5 = new d(4, null, "UNDEFINED");
        f2185h = dVar5;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5};
        i = dVarArr;
        hl.d.k(dVarArr);
        f2180c = new g(9);
    }

    public d(int i10, Class cls, String str) {
        this.f2186b = cls;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) i.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "Preview";
        }
        if (iOrdinal == 1) {
            return "ImageCapture";
        }
        if (iOrdinal == 2) {
            return "VideoCapture";
        }
        if (iOrdinal == 3) {
            return "StreamSharing";
        }
        if (iOrdinal == 4) {
            return "Undefined";
        }
        throw new j();
    }
}
