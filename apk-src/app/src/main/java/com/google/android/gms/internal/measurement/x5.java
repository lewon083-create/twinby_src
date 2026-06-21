package com.google.android.gms.internal.measurement;

import com.yandex.varioqub.config.model.ConfigValue;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x5 extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14083d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x5(String str, int i) {
        super(str);
        this.f14083d = i;
    }

    @Override // com.google.android.gms.internal.measurement.h
    public final n b(com.google.firebase.messaging.y yVar, List list) {
        switch (this.f14083d) {
            case 0:
                return n.B1;
            case 1:
            case 2:
                return this;
            case 3:
                return new g(Double.valueOf(ConfigValue.DOUBLE_DEFAULT_VALUE));
            default:
                return n.B1;
        }
    }
}
