package ob;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends qa.a implements Iterable {
    public static final Parcelable.Creator<u> CREATOR = new kb.i(15);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f30430b;

    public u(Bundle bundle) {
        this.f30430b = bundle;
    }

    public final Object a(String str) {
        return this.f30430b.get(str);
    }

    public final Double c() {
        return Double.valueOf(this.f30430b.getDouble("value"));
    }

    public final String e() {
        return this.f30430b.getString("currency");
    }

    public final Bundle f() {
        return new Bundle(this.f30430b);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new t(this);
    }

    public final String toString() {
        return this.f30430b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.V(parcel, 2, f());
        j0.g.m0(parcel, iI0);
    }
}
