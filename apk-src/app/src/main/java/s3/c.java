package s3;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.h5;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j3.o f32460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j3.o f32461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f32462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f32463e;

    public c(String str, j3.o oVar, j3.o oVar2, int i, int i10) {
        h5.h(i == 0 || i10 == 0);
        h5.h(true ^ TextUtils.isEmpty(str));
        this.f32459a = str;
        oVar.getClass();
        this.f32460b = oVar;
        oVar2.getClass();
        this.f32461c = oVar2;
        this.f32462d = i;
        this.f32463e = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f32462d == cVar.f32462d && this.f32463e == cVar.f32463e && this.f32459a.equals(cVar.f32459a) && this.f32460b.equals(cVar.f32460b) && this.f32461c.equals(cVar.f32461c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f32461c.hashCode() + ((this.f32460b.hashCode() + gf.a.e((((527 + this.f32462d) * 31) + this.f32463e) * 31, 31, this.f32459a)) * 31);
    }
}
