package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class P5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        EnumC0356n9 enumC0356n9;
        Bundle bundle = parcel.readBundle(C6.class.getClassLoader());
        if (bundle.containsKey("CounterReport.Source")) {
            int i = bundle.getInt("CounterReport.Source");
            EnumC0356n9[] enumC0356n9ArrValues = EnumC0356n9.values();
            int length = enumC0356n9ArrValues.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    enumC0356n9 = EnumC0356n9.NATIVE;
                    break;
                }
                enumC0356n9 = enumC0356n9ArrValues[i10];
                if (enumC0356n9.f24428a == i) {
                    break;
                }
                i10++;
            }
        } else {
            enumC0356n9 = null;
        }
        Q5 q5 = new Q5("", "", 0);
        EnumC0078cb enumC0078cb = EnumC0078cb.EVENT_TYPE_UNDEFINED;
        q5.f22863d = bundle.getInt("CounterReport.Type", -1);
        q5.f22864e = bundle.getInt("CounterReport.CustomType");
        q5.f22861b = StringUtils.ifIsNullToDef(bundle.getString("CounterReport.Value"), "");
        q5.f22862c = bundle.getString("CounterReport.Environment");
        q5.f22860a = bundle.getString("CounterReport.Event");
        q5.f22865f = Q5.a(bundle);
        q5.f22866g = bundle.getInt("CounterReport.TRUNCATED");
        q5.f22867h = bundle.getString("CounterReport.ProfileID");
        q5.i = bundle.getLong("CounterReport.CreationElapsedRealtime");
        q5.f22868j = bundle.getLong("CounterReport.CreationTimestamp");
        q5.f22869k = EnumC0128ea.a(Integer.valueOf(bundle.getInt("CounterReport.UniquenessStatus")));
        q5.f22870l = enumC0356n9;
        q5.f22871m = bundle.getBundle("CounterReport.Payload");
        q5.f22872n = bundle.containsKey("CounterReport.AttributionIdChanged") ? Boolean.valueOf(bundle.getBoolean("CounterReport.AttributionIdChanged")) : null;
        q5.f22873o = bundle.containsKey("CounterReport.OpenId") ? Integer.valueOf(bundle.getInt("CounterReport.OpenId")) : null;
        q5.f22874p = CollectionUtils.bundleToMap(bundle.getBundle("CounterReport.Extras"));
        return q5;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new Q5[i];
    }
}
