package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Tg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f23023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Zk f23024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0383ob f23025c = new C0383ob();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0426q4 f23026d = new C0426q4(new Yl(), new C0401p4(), null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Consumer f23027e;

    public Tg(Context context, final InterfaceC0124e6 interfaceC0124e6, final EnumC0078cb enumC0078cb, Zk zk2) {
        this.f23023a = context;
        this.f23024b = zk2;
        this.f23027e = new Consumer() { // from class: io.appmetrica.analytics.impl.fp
            @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
            public final void consume(Object obj) {
                Tg.a(enumC0078cb, interfaceC0124e6, this, (C0283kb) obj);
            }
        };
    }

    public static final void a(EnumC0078cb enumC0078cb, InterfaceC0124e6 interfaceC0124e6, Tg tg, C0283kb c0283kb) {
        String str = c0283kb.f24227h;
        Q3 q32 = new Q3(str, c0283kb.f24224e, c0283kb.f24225f, c0283kb.f24226g, c0283kb.i);
        String str2 = c0283kb.f24221b;
        byte[] bArr = c0283kb.f24220a;
        int i = c0283kb.f24222c;
        HashMap map = c0283kb.f24223d;
        String str3 = c0283kb.f24228j;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(str);
        Set set = AbstractC0605x9.f25010a;
        N3 n32 = new N3(bArr, str2, enumC0078cb.f23605a, orCreatePublicLogger);
        n32.f22711q = map;
        n32.f22866g = i;
        n32.f22862c = str3;
        ((Rg) interfaceC0124e6).a(q32, n32, tg.f23026d);
    }
}
