package com.yandex.varioqub.appmetricaadapter.impl;

import android.content.Context;
import com.yandex.metrica.ModulesFacade;
import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.p;
import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements d {
    @Override // com.yandex.varioqub.appmetricaadapter.impl.d
    public final void a(Context context, String str) {
    }

    @Override // com.yandex.varioqub.appmetricaadapter.impl.d
    public final void b(LinkedHashMap linkedHashMap) {
        YandexMetrica.reportEvent("com.yandex.varioqub.activate_config", linkedHashMap);
    }

    @Override // com.yandex.varioqub.appmetricaadapter.impl.d
    public final void c(Context context, AdapterIdentifiersCallback adapterIdentifiersCallback) {
        p.a(context, new g(adapterIdentifiersCallback), new String[]{"yandex_mobile_metrica_device_id"});
    }

    @Override // com.yandex.varioqub.appmetricaadapter.impl.d
    public final void a(Context context, AdapterIdentifiersCallback adapterIdentifiersCallback) {
        p.a(context, new h(adapterIdentifiersCallback), new String[]{"yandex_mobile_metrica_uuid"});
    }

    @Override // com.yandex.varioqub.appmetricaadapter.impl.d
    public final void a(byte[] bArr) {
        ModulesFacade.setSessionExtra("varioqub", bArr);
    }
}
