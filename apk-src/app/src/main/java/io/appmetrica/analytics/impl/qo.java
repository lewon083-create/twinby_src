package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class qo implements ro {
    @Override // io.appmetrica.analytics.impl.ro
    public final po a(List<po> list) {
        LinkedList linkedList = new LinkedList();
        boolean z5 = true;
        for (po poVar : list) {
            if (!poVar.f24595a) {
                linkedList.add(poVar.f24596b);
                z5 = false;
            }
        }
        return z5 ? new po(this, true, "") : new po(this, false, TextUtils.join(", ", linkedList));
    }
}
