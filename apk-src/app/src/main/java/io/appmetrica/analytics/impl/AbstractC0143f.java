package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0143f implements InterfaceC0174g4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f23821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ag f23822b;

    public AbstractC0143f(@NonNull Context context, @NonNull Ag ag2) {
        this.f23821a = context.getApplicationContext();
        this.f23822b = ag2;
        ag2.a(this);
        C0382oa.k().n().b(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0174g4
    public final void a(@NonNull Q5 q5, @NonNull C0426q4 c0426q4) {
        b(q5, c0426q4);
    }

    @NonNull
    public final Ag b() {
        return this.f23822b;
    }

    public abstract void b(@NonNull Q5 q5, @NonNull C0426q4 c0426q4);

    @NonNull
    public final Context c() {
        return this.f23821a;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0174g4
    public final void a() {
        this.f23822b.b(this);
        C0382oa.I.m().a(this);
    }
}
