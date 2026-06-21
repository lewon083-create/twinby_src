package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Cd implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rg f22208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H0 f22209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ld f22210c;

    public Cd(@NotNull Rg rg, @NotNull H0 h0, @NotNull Ld ld2) {
        this.f22208a = rg;
        this.f22209b = h0;
        this.f22210c = ld2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void consume(@NotNull String str) {
        Rg rg = this.f22208a;
        H0 h0 = this.f22209b;
        String str2 = h0.f22405a;
        String str3 = h0.f22406b;
        Integer numValueOf = Integer.valueOf(h0.f22408d);
        H0 h02 = this.f22209b;
        Q3 q32 = new Q3(str2, str3, numValueOf, h02.f22409e, h02.f22407c);
        Ld ld2 = this.f22210c;
        EnumC0078cb enumC0078cb = ld2.f22609b;
        G0 g02 = ld2.f22608a;
        String str4 = g02.f22365c;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(g02.f22368f.f22405a);
        Set set = AbstractC0605x9.f25010a;
        Bundle bundle = new Bundle();
        bundle.putString("payload_crash_id", str4);
        N3 n32 = new N3("", "", enumC0078cb.f23605a, orCreatePublicLogger);
        if (str != null) {
            n32.f(str);
        }
        n32.f22871m = bundle;
        n32.f22862c = ld2.f22608a.f22368f.f22410f;
        rg.a(q32, n32, new C0426q4(new Yl(), new C0401p4(), null));
    }
}
