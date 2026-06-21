package io.appmetrica.analytics.impl;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class W9 implements Parcelable {

    @NotNull
    public static final V9 CREATOR = new V9();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f23212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IdentifierStatus f23213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23214c;

    public W9(Boolean bool, IdentifierStatus identifierStatus, String str) {
        this.f23212a = bool;
        this.f23213b = identifierStatus;
        this.f23214c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W9)) {
            return false;
        }
        W9 w92 = (W9) obj;
        return Intrinsics.a(this.f23212a, w92.f23212a) && this.f23213b == w92.f23213b && Intrinsics.a(this.f23214c, w92.f23214c);
    }

    public final int hashCode() {
        Boolean bool = this.f23212a;
        int iHashCode = (this.f23213b.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31)) * 31;
        String str = this.f23214c;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FeaturesInternal(sslPinning=");
        sb2.append(this.f23212a);
        sb2.append(", status=");
        sb2.append(this.f23213b);
        sb2.append(", errorExplanation=");
        return a0.u.n(sb2, this.f23214c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f23212a);
        parcel.writeString(this.f23213b.getValue());
        parcel.writeString(this.f23214c);
    }

    public W9() {
        this(null, IdentifierStatus.UNKNOWN, null);
    }
}
