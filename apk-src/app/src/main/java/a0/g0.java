package a0;

import android.view.Surface;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements k0.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g0 f85e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f86b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f87c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f88d;

    static {
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        f85e = new g0(0, new f2.b(fValueOf2, fValueOf2), new f2.b(fValueOf, fValueOf));
    }

    public /* synthetic */ g0(int i, Object obj, Object obj2) {
        this.f86b = i;
        this.f87c = obj;
        this.f88d = obj2;
    }

    @Override // k0.c
    public void onFailure(Throwable th2) {
        switch (this.f86b) {
            case 2:
                if (!(th2 instanceof m2)) {
                    f2.g.h(null, ((j1.h) this.f87c).b(null));
                } else {
                    f2.g.h(null, ((j1.k) this.f88d).cancel(false));
                }
                break;
            default:
                f2.g.h("Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th2, th2 instanceof m2);
                ((f2.a) this.f87c).accept(new l(1, (Surface) this.f88d));
                break;
        }
    }

    @Override // k0.c
    public void onSuccess(Object obj) {
        switch (this.f86b) {
            case 2:
                f2.g.h(null, ((j1.h) this.f87c).b(null));
                break;
            default:
                ((f2.a) this.f87c).accept(new l(0, (Surface) this.f88d));
                break;
        }
    }

    public String toString() {
        switch (this.f86b) {
            case 1:
                return "OutputFileOptions{mFile=" + ((File) this.f87c) + ", mContentResolver=null, mSaveCollection=null, mContentValues=null, mOutputStream=null, mMetadata=" + ((g8.g) this.f88d) + "}";
            default:
                return super.toString();
        }
    }

    public g0(File file) {
        this.f86b = 1;
        this.f87c = file;
        this.f88d = new g8.g(1);
    }
}
