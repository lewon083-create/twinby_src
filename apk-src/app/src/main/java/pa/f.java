package pa;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends qa.a {
    public static final Parcelable.Creator<f> CREATOR = new kb.i(24);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f31352c;

    public f(int i, String str) {
        this.f31351b = i;
        this.f31352c = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return fVar.f31351b == this.f31351b && c0.m(fVar.f31352c, this.f31352c);
    }

    public final int hashCode() {
        return this.f31351b;
    }

    public final String toString() {
        int i = this.f31351b;
        int length = String.valueOf(i).length();
        String str = this.f31352c;
        StringBuilder sb2 = new StringBuilder(length + 1 + String.valueOf(str).length());
        sb2.append(i);
        sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        sb2.append(str);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.h0(parcel, 1, 4);
        parcel.writeInt(this.f31351b);
        j0.g.b0(parcel, 2, this.f31352c);
        j0.g.m0(parcel, iI0);
    }
}
