package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.Objects;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.sc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0483sc extends C0098d5 {
    public C0483sc(@NonNull Context context, @NonNull R4 r42, @NonNull C0401p4 c0401p4, @NonNull W4 w42, @NonNull C0140em c0140em, @NonNull InterfaceC0187gh interfaceC0187gh, @NonNull ICommonExecutor iCommonExecutor, int i, @NonNull C0267jk c0267jk, @NonNull Gb gb2, @NonNull InterfaceC0505t9 interfaceC0505t9) {
        super(context, r42, c0401p4, w42, c0140em, interfaceC0187gh, iCommonExecutor, i, gb2, interfaceC0505t9);
    }

    @NonNull
    public final C0388og a(@NonNull C0434qc c0434qc) {
        C0286ke c0286ke = new C0286ke(c0434qc);
        Objects.requireNonNull(c0434qc);
        return new C0388og(c0286ke, new C0409pc(c0434qc), c0434qc);
    }

    @Override // io.appmetrica.analytics.impl.C0098d5
    @NonNull
    public final InterfaceC0455r9 a(@NonNull InterfaceC0580w9 interfaceC0580w9, @NonNull M6 m62, @NonNull Pg pg, @NonNull C0401p4 c0401p4, @NonNull R4 r42, @NonNull Ve ve2) {
        return this.f23668l.a(interfaceC0580w9, m62, pg, c0401p4, r42, ve2).a();
    }
}
