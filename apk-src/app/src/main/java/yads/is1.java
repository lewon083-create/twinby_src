package yads;

import android.os.Parcel;
import android.os.Parcelable;
import io.sentry.TransactionOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class is1 implements Parcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f39628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f39629c;

    @NotNull
    public static final gs1 Companion = new gs1();

    @NotNull
    public static final Parcelable.Creator<is1> CREATOR = new hs1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final qk.a[] f39627d = {null, new uk.c(wr1.f44456a)};

    public is1(int i, long j10, List list) {
        this.f39628b = (i & 1) == 0 ? TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION : j10;
        if ((i & 2) == 0) {
            this.f39629c = kotlin.collections.b0.f27475b;
        } else {
            this.f39629c = list;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof is1)) {
            return false;
        }
        is1 is1Var = (is1) obj;
        return this.f39628b == is1Var.f39628b && Intrinsics.a(this.f39629c, is1Var.f39629c);
    }

    public final int hashCode() {
        return this.f39629c.hashCode() + (Long.hashCode(this.f39628b) * 31);
    }

    public final String toString() {
        return "MediationPrefetchSettings(loadTimeoutMillis=" + this.f39628b + ", mediationPrefetchAdUnits=" + this.f39629c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f39628b);
        List list = this.f39629c;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zr1) it.next()).writeToParcel(parcel, i);
        }
    }

    public is1(long j10, ArrayList arrayList) {
        this.f39628b = j10;
        this.f39629c = arrayList;
    }
}
