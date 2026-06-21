package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.location.Location;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.ExternalAttribution;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface Ja extends Ea, Ic {
    void a(Activity activity);

    @Override // io.appmetrica.analytics.impl.Ic
    /* synthetic */ void a(Location location);

    void a(@NonNull AnrListener anrListener);

    void a(@NonNull ExternalAttribution externalAttribution);

    void a(@NonNull Go go);

    void a(@NonNull EnumC0346n enumC0346n);

    @Override // io.appmetrica.analytics.impl.Ic
    /* synthetic */ void a(@NonNull String str);

    @Override // io.appmetrica.analytics.impl.Ic
    /* synthetic */ void a(String str, String str2);

    void a(@NonNull String str, boolean z5);

    @Override // io.appmetrica.analytics.impl.Ic
    /* synthetic */ void a(boolean z5);

    @Override // io.appmetrica.analytics.impl.Ic
    /* synthetic */ void a(boolean z5, boolean z10);

    void b(Activity activity);

    @Override // io.appmetrica.analytics.impl.Ea
    /* synthetic */ void b(@NonNull String str);

    @Override // io.appmetrica.analytics.impl.Ea
    /* synthetic */ void b(@NonNull String str, String str2);

    @Override // io.appmetrica.analytics.impl.Ea
    /* synthetic */ boolean b();

    void c();

    void c(@NonNull String str);

    List<String> f();
}
