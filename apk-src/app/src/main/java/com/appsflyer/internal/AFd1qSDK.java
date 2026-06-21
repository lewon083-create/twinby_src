package com.appsflyer.internal;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.t;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class AFd1qSDK {
    public static final boolean getCurrencyIso4217Code(HttpURLConnection httpURLConnection) {
        Intrinsics.checkNotNullParameter(httpURLConnection, "");
        return httpURLConnection.getResponseCode() / 100 == 2;
    }

    public static final JSONArray getMediationNetwork(List<AFc1aSDK> list) {
        Intrinsics.checkNotNullParameter(list, "");
        List<AFc1aSDK> list2 = list;
        ArrayList arrayList = new ArrayList(t.j(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((AFc1aSDK) it.next()).getRevenue());
        }
        return new JSONArray((Collection) arrayList);
    }
}
