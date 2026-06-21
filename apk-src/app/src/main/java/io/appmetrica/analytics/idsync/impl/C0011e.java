package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.idsync.impl.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0011e implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f21971a = new C();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final m fromModel(@NotNull IdSyncConfig idSyncConfig) {
        m mVar = new m();
        mVar.f22001a = idSyncConfig.getEnabled();
        l lVar = new l();
        lVar.f21996a = idSyncConfig.getLaunchDelay();
        int size = idSyncConfig.getRequests().size();
        k[] kVarArr = new k[size];
        for (int i = 0; i < size; i++) {
            kVarArr[i] = this.f21971a.fromModel(idSyncConfig.getRequests().get(i));
        }
        lVar.f21997b = kVarArr;
        mVar.f22002b = lVar;
        return mVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final IdSyncConfig toModel(@NotNull m mVar) {
        l lVar = mVar.f22002b;
        if (lVar == null) {
            lVar = new l();
        }
        boolean z5 = mVar.f22001a;
        long j10 = lVar.f21996a;
        k[] kVarArr = lVar.f21997b;
        ArrayList arrayList = new ArrayList(kVarArr.length);
        for (k kVar : kVarArr) {
            arrayList.add(this.f21971a.toModel(kVar));
        }
        return new IdSyncConfig(z5, j10, arrayList);
    }
}
