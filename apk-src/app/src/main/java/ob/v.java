package ob;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends qa.a {
    public static final Parcelable.Creator<v> CREATOR = new kb.i(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f30454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f30455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f30456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f30457e;

    public v(String str, u uVar, String str2, long j10) {
        this.f30454b = str;
        this.f30455c = uVar;
        this.f30456d = str2;
        this.f30457e = j10;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f30455c);
        String str = this.f30456d;
        int length = String.valueOf(str).length();
        String str2 = this.f30454b;
        StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + strValueOf.length());
        l7.o.t(sb2, "origin=", str, ",name=", str2);
        return a0.u.o(sb2, ",params=", strValueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        kb.i.a(this, parcel, i);
    }

    public v(v vVar, long j10) {
        pa.c0.i(vVar);
        this.f30454b = vVar.f30454b;
        this.f30455c = vVar.f30455c;
        this.f30456d = vVar.f30456d;
        this.f30457e = j10;
    }
}
