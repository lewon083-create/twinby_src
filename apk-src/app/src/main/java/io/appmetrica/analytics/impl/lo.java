package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class lo implements La {
    @Override // io.appmetrica.analytics.impl.La
    public final String a(@NonNull Context context) {
        IdentifiersResult identifiersResultQ = new Ue(C0071c4.l().c(context).a(context)).q();
        if (TextUtils.isEmpty(identifiersResultQ.f25138id)) {
            return null;
        }
        return identifiersResultQ.f25138id;
    }
}
