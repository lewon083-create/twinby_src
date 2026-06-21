package g0;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1 f19641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f19642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a0.i0 f19645e;

    public l(a1 a1Var, List list, int i, int i10, a0.i0 i0Var) {
        this.f19641a = a1Var;
        this.f19642b = list;
        this.f19643c = i;
        this.f19644d = i10;
        this.f19645e = i0Var;
    }

    public static a1.m a(a1 a1Var) {
        a1.m mVar = new a1.m();
        if (a1Var == null) {
            throw new NullPointerException("Null surface");
        }
        mVar.f364d = a1Var;
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            throw new NullPointerException("Null sharedSurfaces");
        }
        mVar.f365e = list;
        mVar.f362b = -1;
        mVar.f363c = -1;
        mVar.f366f = a0.i0.f112d;
        return mVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f19641a.equals(lVar.f19641a) && this.f19642b.equals(lVar.f19642b) && this.f19643c == lVar.f19643c && this.f19644d == lVar.f19644d && this.f19645e.equals(lVar.f19645e);
    }

    public final int hashCode() {
        return ((((((((this.f19641a.hashCode() ^ 1000003) * 1000003) ^ this.f19642b.hashCode()) * (-721379959)) ^ this.f19643c) * 1000003) ^ this.f19644d) * 1000003) ^ this.f19645e.hashCode();
    }

    public final String toString() {
        return "OutputConfig{surface=" + this.f19641a + ", sharedSurfaces=" + this.f19642b + ", physicalCameraId=null, mirrorMode=" + this.f19643c + ", surfaceGroupId=" + this.f19644d + ", dynamicRange=" + this.f19645e + "}";
    }
}
