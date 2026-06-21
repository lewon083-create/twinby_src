package ob;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b4 extends qa.a {
    public static final Parcelable.Creator<b4> CREATOR = new kb.i(21);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f29965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f29966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f29967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f29968f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f29969g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Double f29970h;

    public b4(int i, String str, long j10, Long l10, Float f10, String str2, String str3, Double d10) {
        this.f29964b = i;
        this.f29965c = str;
        this.f29966d = j10;
        this.f29967e = l10;
        this.f29970h = i == 1 ? f10 != null ? Double.valueOf(f10.doubleValue()) : null : d10;
        this.f29968f = str2;
        this.f29969g = str3;
    }

    public final Object h() {
        Long l10 = this.f29967e;
        if (l10 != null) {
            return l10;
        }
        Double d10 = this.f29970h;
        if (d10 != null) {
            return d10;
        }
        String str = this.f29968f;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        kb.i.b(this, parcel);
    }

    public b4(long j10, Object obj, String str, String str2) {
        pa.c0.f(str);
        this.f29964b = 2;
        this.f29965c = str;
        this.f29966d = j10;
        this.f29969g = str2;
        if (obj == null) {
            this.f29967e = null;
            this.f29970h = null;
            this.f29968f = null;
            return;
        }
        if (obj instanceof Long) {
            this.f29967e = (Long) obj;
            this.f29970h = null;
            this.f29968f = null;
        } else if (obj instanceof String) {
            this.f29967e = null;
            this.f29970h = null;
            this.f29968f = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.f29967e = null;
                this.f29970h = (Double) obj;
                this.f29968f = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    public b4(c4 c4Var) {
        this(c4Var.f29991d, c4Var.f29992e, c4Var.f29990c, c4Var.f29989b);
    }
}
