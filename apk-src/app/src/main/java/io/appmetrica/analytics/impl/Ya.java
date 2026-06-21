package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Ya implements Parcelable {
    public static final Parcelable.Creator<Ya> CREATOR = new Xa();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResultReceiver f23321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f23322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f23323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f23324d;

    public Ya(C6 c62, List list, Map map, boolean z5) {
        this.f23322b = list;
        this.f23321a = c62;
        this.f23323c = map == null ? new HashMap() : new HashMap(map);
        this.f23324d = z5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.internal.CounterConfiguration.receiver", this.f23321a);
        if (this.f23322b != null) {
            bundle.putStringArrayList("io.appmetrica.analytics.internal.CounterConfiguration.identifiersList", new ArrayList<>(this.f23322b));
        }
        HashMap map = this.f23323c;
        if (map != null) {
            bundle.putString("io.appmetrica.analytics.internal.CounterConfiguration.clidsForVerification", Em.a((Map) map));
        }
        bundle.putBoolean("io.appmetrica.analytics.internal.CounterConfiguration.forceRefreshConfiguration", this.f23324d);
        parcel.writeBundle(bundle);
    }

    public Ya(Parcel parcel) {
        Bundle bundle = parcel.readBundle(C6.class.getClassLoader());
        if (bundle != null) {
            this.f23321a = (ResultReceiver) bundle.getParcelable("io.appmetrica.analytics.internal.CounterConfiguration.receiver");
            this.f23322b = bundle.getStringArrayList("io.appmetrica.analytics.internal.CounterConfiguration.identifiersList");
            this.f23323c = Em.a(bundle.getString("io.appmetrica.analytics.internal.CounterConfiguration.clidsForVerification"));
            this.f23324d = bundle.getBoolean("io.appmetrica.analytics.internal.CounterConfiguration.forceRefreshConfiguration");
            return;
        }
        this.f23323c = new HashMap();
    }
}
