package io.appmetrica.analytics.internal;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.impl.C6;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new CounterConfiguration((ContentValues) parcel.readBundle(C6.class.getClassLoader()).getParcelable("io.appmetrica.analytics.internal.CounterConfiguration.data"), 0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new CounterConfiguration[i];
    }
}
