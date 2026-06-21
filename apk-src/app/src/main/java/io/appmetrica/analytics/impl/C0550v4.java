package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.v4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0550v4 implements InterfaceC0174g4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f24869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0625y4 f24870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResultReceiver f24871c;

    public C0550v4(@NonNull Context context, @NonNull C0625y4 c0625y4, @NonNull C0426q4 c0426q4) {
        this.f24869a = context;
        this.f24870b = c0625y4;
        this.f24871c = c0426q4.f24614c;
        c0625y4.a(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0174g4
    public final void a(@NonNull Q5 q5, @NonNull C0426q4 c0426q4) {
        this.f24870b.a(c0426q4.f24613b);
        this.f24870b.a(q5, this);
    }

    @NonNull
    public final C0625y4 b() {
        return this.f24870b;
    }

    @NonNull
    public final Context c() {
        return this.f24869a;
    }

    @NonNull
    public final ResultReceiver d() {
        return this.f24871c;
    }

    public final void a(@NonNull T3 t32) {
        C6.a(this.f24871c, t32);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0174g4
    public final void a() {
        this.f24870b.b(this);
    }
}
