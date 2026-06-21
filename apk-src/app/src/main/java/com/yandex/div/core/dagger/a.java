package com.yandex.div.core.dagger;

import com.yandex.div.core.DivRequestExecutor;
import com.yandex.div.histogram.HistogramConfiguration;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements hj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15264a;

    public /* synthetic */ a(int i) {
        this.f15264a = i;
    }

    @Override // hj.a
    public final Object get() {
        switch (this.f15264a) {
            case 0:
                return DivKitHistogramsModule.provideCalculateSizeExecutor$lambda$1();
            case 1:
                return HistogramConfiguration.DEFAULT;
            default:
                return DivRequestExecutor.STUB;
        }
    }
}
