package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class Ad implements Cdo, InterfaceC0249j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ro f22065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final K2 f22066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PublicLogger f22067e = PublicLogger.getAnonymousInstance();

    public Ad(int i, String str, ro roVar, K2 k22) {
        this.f22064b = i;
        this.f22063a = str;
        this.f22065c = roVar;
        this.f22066d = k22;
    }

    @NonNull
    public final C0142eo a() {
        C0142eo c0142eo = new C0142eo();
        c0142eo.f23818b = this.f22064b;
        c0142eo.f23817a = this.f22063a.getBytes();
        c0142eo.f23820d = new C0194go();
        c0142eo.f23819c = new C0168fo();
        return c0142eo;
    }

    @Override // io.appmetrica.analytics.impl.Cdo
    public abstract /* synthetic */ void a(@NonNull C0091co c0091co);

    @NonNull
    public final K2 b() {
        return this.f22066d;
    }

    @NonNull
    public final String c() {
        return this.f22063a;
    }

    @NonNull
    public final ro d() {
        return this.f22065c;
    }

    public final int e() {
        return this.f22064b;
    }

    public final boolean f() {
        po poVarA = this.f22065c.a(this.f22063a);
        if (poVarA.f24595a) {
            return true;
        }
        this.f22067e.warning("Attribute " + this.f22063a + " of type " + ((String) Nn.f22761a.get(this.f22064b)) + " is skipped because " + poVarA.f24596b, new Object[0]);
        return false;
    }

    @Override // io.appmetrica.analytics.impl.Cdo
    public final void a(@NonNull PublicLogger publicLogger) {
        this.f22067e = publicLogger;
    }
}
