package yads;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class em1 implements xq {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final em1 f38181d = new em1(new dm1());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final wq f38182e = new zf.a(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f38183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f38184c;

    public em1(dm1 dm1Var) {
        this.f38183b = dm1Var.f37833a;
        this.f38184c = dm1Var.f37834b;
    }

    public static em1 a(Bundle bundle) {
        dm1 dm1Var = new dm1();
        dm1Var.f37833a = (Uri) bundle.getParcelable(Integer.toString(0, 36));
        dm1Var.f37834b = bundle.getString(Integer.toString(1, 36));
        dm1Var.f37835c = bundle.getBundle(Integer.toString(2, 36));
        return new em1(dm1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof em1)) {
            return false;
        }
        em1 em1Var = (em1) obj;
        return lb3.a(this.f38183b, em1Var.f38183b) && lb3.a(this.f38184c, em1Var.f38184c);
    }

    public final int hashCode() {
        Uri uri = this.f38183b;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.f38184c;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
