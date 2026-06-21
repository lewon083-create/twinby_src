package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Hb implements InterfaceC0274k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0351n4 f22416a;

    public Hb(@NonNull C0351n4 c0351n4) {
        this.f22416a = c0351n4;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0274k2
    public final C0142eo a(@NonNull C0091co c0091co, @NonNull C0142eo c0142eo) {
        int i = c0091co.f23644b;
        int i10 = this.f22416a.f24398a;
        if (i == i10) {
            if (((C0142eo) ((HashMap) c0091co.f23643a.get(c0142eo.f23818b)).get(new String(c0142eo.f23817a))) != null) {
                ((HashMap) c0091co.f23643a.get(c0142eo.f23818b)).put(new String(c0142eo.f23817a), c0142eo);
                return c0142eo;
            }
        } else if (i < i10) {
            ((HashMap) c0091co.f23643a.get(c0142eo.f23818b)).put(new String(c0142eo.f23817a), c0142eo);
            c0091co.f23644b++;
        }
        return c0142eo;
    }
}
